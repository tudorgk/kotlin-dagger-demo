package com.e_conomic.internal.kotlindaggerdemo.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.*

/**
 * Created by tudorgk on 16/2/16.
 */

interface ApiService {

    @GET("/feed.json")
    fun feed(@Query("since") since: Long): Call<HashMap<Any,Any>>

    @GET("/user_feed/{userId}.json")
    fun userFeed(@Path("userId") userId: Long, @Query("since") since: Long): Call<HashMap<Any,Any>>

    @POST("new_post.json")
    fun sendPost(@Query("text") text: String, @Query("client_id") clientId: String,
            // ultra secure API sending user id :p
                 @Query("user_id") userId: Long): Call<HashMap<Any,Any>>
}
