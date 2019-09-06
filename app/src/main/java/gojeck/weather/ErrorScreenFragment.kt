package gojeck.weather

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import gojeck.weather.R.layout
import kotlinx.android.synthetic.main.error_screen_fragment.*

class ErrorScreenFragment : Fragment() {
    internal var rootView: View? = null

    companion object {
        fun newInstance() =
            ErrorScreenFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(layout.error_screen_fragment, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_retry.setOnClickListener{
            (activity as MainActivity?)!!.checkPermission()
        }
    }
}