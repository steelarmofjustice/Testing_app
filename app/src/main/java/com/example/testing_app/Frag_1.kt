package com.example.testing_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Frag_1 : Fragment() {

    private var click : ButtonClick? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_frag_1, container, false)
        val textV: EditText = view.findViewById(R.id.inptxt)
        view.findViewById<Button>(R.id.button).apply {
            setOnClickListener{ click?.onClick() }
        }
        return view
    }

    /**companion object {
        fun newInstance(id: String): Frag_1{
            val args = Bundle()
            args.putString("openWithID", id)
            val fragment = Frag_1()
            fragment.arguments = args
            return fragment
        }
    }*/

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is ButtonClick){
            click = context
        }
    }
}