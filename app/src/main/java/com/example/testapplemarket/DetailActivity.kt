package com.example.testapplemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplemarket.databinding.ActivityDetailBinding
import com.example.testapplemarket.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)



    }
}