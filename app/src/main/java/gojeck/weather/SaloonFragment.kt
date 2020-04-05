package gojeck.weather

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import gojeck.weather.adapters.RecyclerViewDataAdapter
import gojeck.weather.models.SectionDataModel
import gojeck.weather.models.SingleItemModel
import kotlinx.android.synthetic.main.saloon_fragment.*


class SaloonFragment : Fragment() {
    internal var rootView: View? = null
    var allSampleData= ArrayList<SectionDataModel>()
    companion object {
        fun newInstance() =
            SaloonFragment().apply {
                arguments = Bundle().apply {}
            }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.saloon_fragment, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        createDummyData()
        recycler_view.setHasFixedSize(true)
        val adapter = RecyclerViewDataAdapter(activity, allSampleData)
        recycler_view.setLayoutManager(LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false))
        recycler_view.setAdapter(adapter)

    }

    fun createDummyData() {
        for (i in 1..5) {
            val dm = SectionDataModel()
            dm.headerTitle = "Category $i"
            val singleItem: ArrayList<SingleItemModel> = ArrayList<SingleItemModel>()
            for (j in 0..5) {
                singleItem.add(SingleItemModel("Saloon $j", "URL $j"))
            }
            dm.allItemsInSection = singleItem
            allSampleData.add(dm)
        }
    }
}