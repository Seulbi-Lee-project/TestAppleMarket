package com.example.testapplemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplemarket.databinding.ActivityDetailBinding
import com.example.testapplemarket.databinding.ActivityMainBinding
import java.text.DecimalFormat

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        val position = intent.getIntExtra("position", 0)

        val getItems = ItemsDataList().getItems(position)

        binding.itemImageDetail.setImageResource(getItems.itemImage)
        binding.subjectTextDetail.text = getItems.itemSubject
        binding.contentTextDetail.text = getItems.itemContent
        binding.priceTextDetail.text = DecimalFormat("#,###").format(getItems.itemPrice) + "원"

    }
}