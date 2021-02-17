package com.kkang.libary_profile_200112

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        profilePhotoImg.setOnClickListener {

            val myIntent = Intent(mContext, ViewProfilePhotoActivity::class.java)
            startActivity(myIntent)

        }

    }

    override fun setValues() {

        Glide.with(mContext)
            .load("https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F9956CB395DEA3BCA0D")
            .into(profilePhotoImg)

    }
}