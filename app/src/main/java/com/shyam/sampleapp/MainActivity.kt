package com.shyam.sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shyam.samplelib.SampleUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SampleUtil.getSampleText();
    }
}