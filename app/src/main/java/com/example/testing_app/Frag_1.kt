package com.example.testing_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

class Frag_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_frag_1, container, false)
        val textV: EditText = view.findViewById(R.id.inptxt)
        return view
    }

    companion object {
        fun newInstance(id: Int): Frag_1{
            val args = Bundle()
            args.putInt("openWithID", id)
            val fragment = Frag_1()
            fragment.arguments = args
            return fragment
        }
    }
    //supportFragmentManager.beginTransaction().add(R.id.contain, Frag_1()).commit()
}