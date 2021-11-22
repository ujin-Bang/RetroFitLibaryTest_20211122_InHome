package org.techtown.retrofitlibarytest_20211122_inhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.techtown.retrofitlibarytest_20211122_inhome.api.ServerAPI
import org.techtown.retrofitlibarytest_20211122_inhome.api.ServerAPIService
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

         binding.btnLogin.setOnClickListener {

             val inputEmail = binding.edtEmail.text.toString()
             val inputPw = binding.edtPassword.text.toString()

            apiService.postRequestLogin(inputEmail, inputPw)
         }
     }

     override fun setValues() {

     }


 }