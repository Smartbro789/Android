package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import android.widget.Toast




class MainActivity : AppCompatActivity() {
//    private lateinit var textView: TextView;
//    private lateinit var radioGroup: RadioGroup;
//    private lateinit var radioButton: RadioButton;
//    private lateinit var textInput: TextInputEditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        textView = findViewById(R.id.textView)
//        radioGroup = findViewById(R.id.radioGroup)
//        textInput = findViewById(R.id.textInput)
//        textView.setText("")

    }

//    fun showText(view: View) {
//        val text: String = textInput.text.toString()
//        val selectedOption: Int = radioGroup!!.checkedRadioButtonId
//        textView.setText(text)
//        if(selectedOption != -1 && text!="") {
//            radioButton = findViewById(selectedOption)
//
//            val color = radioButton.text.toString()
//            if (color == "Red")
//                textView.setTextColor(getResources().getColor(R.color.red))
//            else if (color == "Green")
//                textView.setTextColor(getResources().getColor(R.color.green))
//            else if (color == "Blue")
//                textView.setTextColor(getResources().getColor(R.color.blue))
//        }
//        else{
//            val toast = Toast.makeText(this@MainActivity, "Спочатку виконайте всі дії.", Toast.LENGTH_LONG)
//            toast.show()
//        }
//    }
//    fun hideText(view: View) {
//        textView.setText("")
//    }
}