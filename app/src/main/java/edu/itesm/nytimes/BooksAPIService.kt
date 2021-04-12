package edu.itesm.nytimes

import retrofit2.Response
import retrofit2.http.GET


interface APIService {
    @GET("hardcover-fiction.json?api-key=pvWH7HlnBDQQm3sYlnDnuL0rNa0sNQsq ")
    suspend fun getBooks() : Response<Results>
}