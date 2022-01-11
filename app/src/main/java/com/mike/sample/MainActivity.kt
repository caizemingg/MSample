package com.mike.sample

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.mike.theme.ThemeFragment

class MainActivity : AppCompatActivity() {

    lateinit var ltFragment: FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ltFragment = findViewById(R.id.ltFragment)
        val beginTransaction = supportFragmentManager.beginTransaction()
        beginTransaction.add(R.id.ltFragment, ThemeFragment())
        beginTransaction.commit()
    }
}