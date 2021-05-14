package it.torrone.universeaty

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val logBtn = findViewById<Button>(R.id.logBtn)
        val regBtn = findViewById<Button>(R.id.regBtn)

        logBtn.setOnClickListener{
            startActivity(Intent(this, Login::class.java))
        }

        regBtn.setOnClickListener{
            startActivity(Intent(this, Register::class.java))
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            startActivity(Intent(this, Application::class.java))
        }

        findViewById<Button>(R.id.btn3).setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }

    }

    override fun onBackPressed(){
        super.onBackPressed()
        Toast.makeText(this,"Bye bye",Toast.LENGTH_LONG).show()
        finish()
    }

    /*public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            reload()
        }
        if(GoogleSignIn.getLastSignedInAccount(this)!=null){
            reload()
            finish()
        }
    }*/

   /* private fun reload() {
        startActivity(Intent(this, LukeAmaliaAlessio::class.java))
    }*/
}