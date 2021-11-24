package com.example.alphabetapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class AlphaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpha)

        var imageView = findViewById<ImageView>(R.id.imageView)
        var name:String? = intent.getStringExtra("name")?.toLowerCase()
        Toast.makeText(applicationContext,name,Toast.LENGTH_LONG).show()

        var id = resources.getIdentifier(name,"drawable",packageName)
        imageView.setImageResource(id)

        var mid = resources.getIdentifier(name,"raw",packageName)
        var mediaplayer = MediaPlayer.create(applicationContext,mid)
        mediaplayer.start()

    }
}