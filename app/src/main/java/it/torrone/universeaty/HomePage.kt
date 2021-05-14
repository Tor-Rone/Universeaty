package it.torrone.universeaty

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.imangazaliev.circlemenu.CircleMenu


class HomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val circleMenu = findViewById<CircleMenu>(R.id.fab)
        val titles = arrayListOf("Lettere", "Ingegneria", "Scienze", "Economia", "Medicina")

        circleMenu.setOnItemClickListener { buttonIndex ->
            findViewById<TextView>(R.id.facultyTv).text = titles[buttonIndex]
        }



            circleMenu.onButtonClickAnimationEnd { buttonIndex ->
                if (buttonIndex == 1) {
                    Log.d("CircleMenuStatus", "onMenuOpenAnimationEnd")
                    startActivity(Intent(this, Application::class.java))
                }
            }
        }
    }

