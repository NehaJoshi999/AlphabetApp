package com.example.alphabetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gridview = findViewById<GridView>(R.id.gridview)
        var alpha = Array<String> (26){""}
        var j = 65
        for(i in 0..25){
            alpha[i] = Character.toString(j.toChar())
            j++
        }

        var adapter = ArrayAdapter<String>(applicationContext,android.R.layout.simple_dropdown_item_1line,alpha)
        gridview.adapter = adapter
        
        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(applicationContext,AlphaActivity::class.java)
            intent.putExtra("name",alpha[i])
            startActivity(intent)

        }

    }
}

