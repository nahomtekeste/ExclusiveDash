package com.example.exclusivedash

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    internal lateinit var titleMedium: TextView
    internal lateinit var titleLight: TextView
    internal lateinit var titleBook: TextView
    internal lateinit var titleAuthor: TextView
    internal lateinit var titlePrice: TextView
    internal lateinit var titleBookNew: TextView
    internal lateinit var titleBookDesc: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titleLight = findViewById(R.id.titleLight) as TextView
        titleMedium = findViewById(R.id.titleMedium) as TextView

        titleBook = findViewById(R.id.titleBook) as TextView
        titleAuthor = findViewById(R.id.titleAuthor) as TextView
        titlePrice = findViewById(R.id.titlePrice) as TextView

        titleBookNew = findViewById(R.id.titleBookNew) as TextView
        titleBookDesc = findViewById(R.id.titleBookDesc) as TextView

        val mediumx = Typeface.createFromAsset(assets, "fonts/MontserratMedium.ttf")
        val lightx = Typeface.createFromAsset(assets, "fonts/MontserratLight.ttf")

        titleMedium.setTypeface(mediumx)
        titleLight.setTypeface(lightx)

        titleBook.setTypeface(mediumx)
        titleAuthor.setTypeface(lightx)
        titlePrice.setTypeface(mediumx)

        titleBookNew.setTypeface(mediumx)
        titleBookDesc.setTypeface(lightx)


    }

}
