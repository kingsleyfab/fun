package com.example.`fun`

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Mailbut.setOnClickListener {


            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_APP_EMAIL)
            startActivity(intent)
            startActivity(Intent.createChooser(intent, ("Open Mail")))

        }

        Pointbut.setOnClickListener {



            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.javatpoint.com/"))
            startActivity(intent)

            intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/"))
            startActivity(intent)


         }


        Watsappbut.setOnClickListener {


            val intent = Intent()
           intent.action = Intent.ACTION_SEND
            intent.type = "test/plain"
           startActivity(Intent.createChooser(intent, ("Share to")))


        }


        Checkbut.setOnClickListener {


            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "test/plain"
            startActivity(Intent.createChooser(intent, ("Open With")))


        }
    }

}

