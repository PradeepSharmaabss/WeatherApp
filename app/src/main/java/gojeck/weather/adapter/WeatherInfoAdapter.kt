package gojeck.weather.adapter

import android.app.Activity
import android.support.v7.widget.RecyclerView.Adapter
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import gojeck.weather.R.id
import gojeck.weather.R.layout
import gojeck.weather.model.Forecastday
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class WeatherInfoAdapter(private val mActivity: Activity) :
    Adapter<WeatherInfoAdapter.AvengerHolder>() {
    internal var forecastdayItems: List<Forecastday>? = null
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AvengerHolder {
        return AvengerHolder(
            LayoutInflater.from(parent.context).inflate(
                layout.item_weather,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AvengerHolder, position: Int) {
        val item = forecastdayItems!![position]
        holder.setIvADay(item.date)
        holder.setTvATemp("" + item.day.avgtempC)
    }

    override fun getItemCount(): Int {
        return if (forecastdayItems == null) 0 else forecastdayItems!!.size
    }

    fun update(mData: List<Forecastday>?) {
        forecastdayItems = mData
        notifyDataSetChanged()
    }

    inner class AvengerHolder(itemView: View) :
        ViewHolder(itemView) {
        var tvDay: TextView
        var tvTemp: TextView
        fun setIvADay(name: String) {
            tvDay.text = getDayName(name)
        }

        fun setTvATemp(name: String) {
            tvTemp.text = "$name C"
        }

        init {
            tvDay = itemView.findViewById(id.txt_day)
            tvTemp = itemView.findViewById(id.txt_temp)
        }
    }

    private fun getDayName(dat: String): String {
        var goal = ""
        try {
            val inFormat = SimpleDateFormat("yyyy-MM-dd")
            val date: Date? = inFormat.parse(dat)
            val outFormat = SimpleDateFormat("EEEE")
            goal = outFormat.format(date)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return goal
    }

}