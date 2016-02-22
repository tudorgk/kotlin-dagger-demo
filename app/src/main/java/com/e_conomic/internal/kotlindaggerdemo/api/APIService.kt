package com.e_conomic.internal.kotlindaggerdemo.api

import retrofit2.Call
import retrofit2.http.GET
import java.util.*

/**
 * Created by tudorgk on 16/2/16.
 */

interface ApiService {



    @GET("users/{user}/repos")
    fun listRepos() : Call<HashMap<String,String>>


}
