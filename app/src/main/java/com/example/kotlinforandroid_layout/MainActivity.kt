package com.example.kotlinforandroid_layout

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitman = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitman)

        rounded.cornerRadius = 20f
        logo.setImageDrawable(rounded)
    }
}