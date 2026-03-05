package com.greenguide.greenguide

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnSearch = findViewById<Button>(R.id.btnSearch)
        val btnCamera = findViewById<Button>(R.id.btnCamera)
        val btnMyPlants = findViewById<Button>(R.id.btnMyPlants)

        btnSearch.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        btnCamera.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }

        btnMyPlants.setOnClickListener {
            startActivity(Intent(this, MyplantsActivity::class.java))
        }
    }
}