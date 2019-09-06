package gojeck.weather

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import gojeck.weather.adapter.WeatherInfoAdapter
import kotlinx.android.synthetic.main.weather_info_fragment.*


class WeatherInfoFragment : Fragment() {
    internal var rootView: View? = null
    var weatherInfoAdapter:WeatherInfoAdapter? =null
    companion object {
        fun newInstance() =
            WeatherInfoFragment().apply {
                arguments = Bundle().apply {}
            }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.weather_info_fragment, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setData()
    }

    private fun setData() {
        txt_city.setText((activity as MainActivity?)!!.getData().location.name)
        txt_temp.setText((activity as MainActivity?)!!.getData().current.tempC.toInt().toString())
        setAnimation()
    }

    private fun initView() {
        recycler_view.setLayoutManager(LinearLayoutManager(activity))
        recycler_view.addItemDecoration(DividerItemDecoration(activity, RecyclerView.VERTICAL))
        recycler_view.setAdapter(getAdapter())
        weatherInfoAdapter!!.update((activity as MainActivity?)!!.getData().forecast.forecastday)

    }
    private fun getAdapter(): WeatherInfoAdapter {
        if (weatherInfoAdapter == null) {
            weatherInfoAdapter = activity?.let { WeatherInfoAdapter(it) }
        }
        return weatherInfoAdapter as WeatherInfoAdapter
    }
    private fun setAnimation(){
       var slideUpAnimation = AnimationUtils.loadAnimation(activity, R.anim.anim_slid_up);linear.startAnimation(slideUpAnimation)
    }
}