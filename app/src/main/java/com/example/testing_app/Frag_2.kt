package com.example.testing_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView


class Frag_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_frag_2, container, false)
        var textV: TextView = view.findViewById(R.id.outtxt)
        textV.text = arguments?.getString("openWithId").toString()
        return view
    }

    companion object {
        fun newInstance(id: String) : Frag_2 {
            val args = Bundle()
            args.putString("openWithId", id)
            val fragment = Frag_2()
            fragment.arguments = args
            return fragment
            }
    }
}