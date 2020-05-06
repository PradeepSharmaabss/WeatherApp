package gojeck.weather

import android.os.AsyncTask
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import gojeck.weather.adapters.RecyclerViewDataAdapter
import gojeck.weather.models.LoginData
import gojeck.weather.models.SaloonListing
import gojeck.weather.models.SectionDataModel
import gojeck.weather.models.SingleItemModel
import gojeck.weather.utils.DataProcessor
import io.swagger.client.api.SaloonDataApi
import io.swagger.client.model.SaloonSearchRequest
import kotlinx.android.synthetic.main.saloon_fragment.*


class SaloonFragment : Fragment() {
    internal var rootView: View? = null
    var allSampleData = ArrayList<SectionDataModel>()
    var saloonData = SaloonListing()
    lateinit var adapter: RecyclerViewDataAdapter

    companion object {
        fun newInstance() =
            SaloonFragment().apply {
                arguments = Bundle().apply {}
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.saloon_fragment, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        recycler_view.setHasFixedSize(true)
        adapter = RecyclerViewDataAdapter(activity, allSampleData)
        recycler_view.setLayoutManager(
            LinearLayoutManager(
                activity,
                LinearLayoutManager.VERTICAL,
                false
            )
        )
        recycler_view.setAdapter(adapter)
        MyTask().execute()
    }

    inner class MyTask : AsyncTask<String?, String?, String?>() {
        var loginData = Gson().fromJson(
            DataProcessor(activity).getStr(DataProcessor.LOGIN_DATA),
            LoginData::class.java
        )

        override fun doInBackground(vararg params: String?): String? {
            var saloonSearchRequest = SaloonSearchRequest()
            saloonSearchRequest.lat = MainActivity.lat
            saloonSearchRequest.lng = MainActivity.long
            saloonSearchRequest.distance = 100
            saloonSearchRequest.pageNumber = 1
            saloonSearchRequest.numberOfRows = 20
            saloonSearchRequest.terms = ""
            var data = SaloonDataApi()
            data.addHeader(
                "Authorization",
                loginData.data.tokenType + " " + loginData.data.accessToken
            )
            var response = data.saloonDataGetSaloon(saloonSearchRequest)
            saloonData = Gson().fromJson(Gson().toJson(response), SaloonListing::class.java)
            return ""
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            progressbar.visibility = View.GONE
            createSaloon()
        }

        override fun onPreExecute() {
            super.onPreExecute()
        }
    }

    fun createSaloon() {
        saloonData.data.forEachIndexed{index,model->
            val dm = SectionDataModel()
            dm.headerTitle =model.saloonType
            val singleItem= ArrayList<SingleItemModel>()
            saloonData.data[index].list.forEachIndexed{i,list->
                singleItem.add(SingleItemModel(list.saloonName, list.id))
            }
            dm.allItemsInSection = singleItem
            allSampleData.add(dm)
        }
        adapter.notifyDataSetChanged()
    }
}