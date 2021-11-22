package org.techtown.retrofitlibarytest_20211122_inhome

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.techtown.retrofitlibarytest_20211122_inhome.api.ServerAPI
import org.techtown.retrofitlibarytest_20211122_inhome.api.ServerAPIService

abstract class BaseActivity : AppCompatActivity() {

    lateinit var mContext : Context

    lateinit var apiService : ServerAPIService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mContext = this

        val retrofit = ServerAPI.getRetrofit()
        apiService = retrofit.create(ServerAPIService::class.java)
    }

    abstract fun setupEvents()
    abstract  fun setValues()
}