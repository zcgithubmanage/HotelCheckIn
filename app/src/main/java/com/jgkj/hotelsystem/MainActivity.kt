package com.jgkj.hotelsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jgkj.hotelsystem.ui.AddressChooseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_main.setOnClickListener {
            val intentName = Intent(this,AddressChooseActivity::class.java)
            startActivity(intentName)
        }
    }
}
