package com.example.quisrevita.app

import com.example.quisrevita.model.ObatModel
import com.example.quisrevita.model.ResponModel
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @FormUrlEncoded
    @POST("tblproduk/save")
    fun saveobat(
        @Body data: ObatModel,
    ) :Call<ResponModel>

    @GET("obat")
    fun getObat() :Call<ResponModel>
}