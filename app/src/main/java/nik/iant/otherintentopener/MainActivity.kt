package nik.iant.otherintentopener

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.io.File
import java.net.URI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCaller = findViewById<Button>(R.id.button)
        val btnCam = findViewById<Button>(R.id.button5)
        val btnWeb = findViewById<Button>(R.id.button2)
        val btnShare = findViewById<Button>(R.id.button3)
        val btnNew = findViewById<Button>(R.id.button4)
        btnCaller.setOnClickListener {
            try {
                val callintent = Intent(Intent.ACTION_CALL)
                callintent.data = Uri.parse("tel:+919998887776")
                startActivity(callintent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }
        btnCam.setOnClickListener {
            try {
                val callintent = Intent(Intent.ACTION_CAMERA_BUTTON)

                startActivity(callintent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }
        btnWeb.setOnClickListener {
            try {
                val webintent = Intent(Intent.ACTION_VIEW)
                webintent.data = Uri.parse("https://www.google.com")
                startActivity(webintent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }
        btnShare.setOnClickListener {
            try {
                val shrintent = Intent(Intent.ACTION_SEND)
                shrintent.type = "image/jpeg"
//                val ImageFile = File("/home/myfile.png")

//                shrintent.putExtra(Intent.EXTRA_STREAM,Uri.fromFile(ImageFile))
//                startActivity(shrintent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }

        btnNew.setOnClickListener {
            try {
                val shrintent = Intent(this, MyData::class.java)
                shrintent.data= Uri.parse(findViewById<EditText>(R.id.editTextTextPersonName).text.toString())
                startActivity(shrintent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }
    }
}