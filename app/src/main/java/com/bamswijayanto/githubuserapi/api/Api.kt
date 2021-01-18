package com.bamswijayanto.githubuserapi.api

import com.bamswijayanto.githubuserapi.data.response.DetailUserResponse
import com.bamswijayanto.githubuserapi.data.model.User
import com.bamswijayanto.githubuserapi.data.response.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token d8457696c6d16a885ede636f1246956f0f8f83cb")
    fun getSearchUsers(
        @Query("q")query : String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token d8457696c6d16a885ede636f1246956f0f8f83cb")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token  d8457696c6d16a885ede636f1246956f0f8f83cb")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token  d8457696c6d16a885ede636f1246956f0f8f83cb")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>
}