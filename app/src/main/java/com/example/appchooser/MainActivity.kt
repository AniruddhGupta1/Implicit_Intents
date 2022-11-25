package com.example.appchooser

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.provider.MediaStore
import android.telecom.Call
import android.widget.Button
import androidx.core.text.parseAsHtml
import java.net.URI
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.btn)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.button)
        var btn4 = findViewById<Button>(R.id.button2)
        btn.setOnClickListener{
            var url = "http://www.google.com"
            var i = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(i)
        }
        btn2.setOnClickListener{
            var i = Intent(Intent.ACTION_DIAL)
            i.setData(Uri.parse("tel: +919516021163"))
            startActivity(i)

        }
        btn3.setOnClickListener{
            var i = Intent(Intent.ACTION_VIEW)
            i.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(i)
        }
        btn4.setOnClickListener{
            var i = "http://maps.google.com"
            var intent = Intent(Intent.ACTION_VIEW,Uri.parse(i))
            startActivity(intent)
        }


    }


}