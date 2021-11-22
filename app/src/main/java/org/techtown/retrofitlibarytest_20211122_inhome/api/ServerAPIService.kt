package org.techtown.retrofitlibarytest_20211122_inhome.api

import retrofit2.http.POST

interface ServerAPIService {

//    로그인 기능 명세
    @POST("/user")
    fun postRequestLogin( @id:String )


}