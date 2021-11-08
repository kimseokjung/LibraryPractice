package com.example.librarypractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.example.librarypractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.profileImage.setOnClickListener {
            val myIntent = Intent(this, ViewProfileMainActivity::class.java)
            startActivity(myIntent)


        }
        Glide.with(this)
            .load("https://biz.chosun.com/resizer/Fz_7rdonztjt4_HmSwSgJActVdI=/464x0/smart/cloudfront-ap-northeast-1.images.arcpublishing.com/chosunbiz/JUXUVFF2UEN2F432DOBTGSSBZA.jpg")
            .into(binding.lecturImg)
    }
}