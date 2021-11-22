package org.techtown.retrofitlibarytest_20211122_inhome.api

import org.techtown.retrofitlibarytest_20211122_inhome.datas.BasicResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ServerAPIService {

//    로그인 기능 명세

    @FormUrlEncoded
    @POST("/user")
    fun postRequestLogin(
    @Field("email") id:String,
    @Field("password") pw: String,
    ) : Call<BasicResponse>


}