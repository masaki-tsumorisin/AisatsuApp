package jp.techacademy.masaki.tsumori.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greet.setOnClickListener {
            showTimePickerDialog()
        }

    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener {view, hour, minute ->

                    if (hour >= 2 && hour <=9) {
                        greetingMessage.text = "おはよう"
                    } else if (hour >= 10 && hour <= 17) {
                        greetingMessage.text = "こんにちは"
                    }else {
                        greetingMessage.text = "こんばんは"
                    }
                },
                12, 0, true)
        timePickerDialog.show()

    }
}