package com.fusco2k.jofoa


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
    private lateinit var scheduleButton: Button
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        scheduleButton = view.findViewById(R.id.schedule_button)
        scheduleButton.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, Schedule(), null)
                .addToBackStack(null)
                .commit()
        }
        super.onViewCreated(view, savedInstanceState)
    }
}



