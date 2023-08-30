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

        val item1 = Items(R.drawable.sample1, "산지 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서대문구 창천동", 13, 25)

        val item = intent?.getParcelableExtra("item", Items::class.java) ?: item1

        binding.itemImageDetail.setImageResource(item.itemImage)
        binding.subjectTextDetail.text = item.itemSubject
        binding.contentTextDetail.text = item.itemContent
        binding.priceTextDetail.text = DecimalFormat("#,###").format(item.itemPrice) + "원"

    }
}