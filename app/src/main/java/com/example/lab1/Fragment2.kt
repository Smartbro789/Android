package com.example.lab1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class Fragment2 : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        print("hello")
        val fragment_text = arguments?.getString("fragment_text")
        val color = arguments?.getString("fragment_text_color")
        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = fragment_text
        if (color == "Red")
            textView.setTextColor(getResources().getColor(R.color.red))
        else if (color == "Green")
            textView.setTextColor(getResources().getColor(R.color.green))
        else if (color == "Blue")
            textView.setTextColor(getResources().getColor(R.color.blue))

        view.findViewById<Button>(R.id.cancelButton).setOnClickListener {
            val textView = view.findViewById<TextView>(R.id.textView)
            textView.text = ""
        }
    }

}