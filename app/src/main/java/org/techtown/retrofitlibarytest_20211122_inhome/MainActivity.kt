package org.techtown.retrofitlibarytest_20211122_inhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.techtown.retrofitlibarytest_20211122_inhome.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {


    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setValues()
        setupEvents()
    }

     override fun setupEvents() {

     }

     override fun setValues() {

     }


 }