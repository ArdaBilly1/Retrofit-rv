package com.example.ppmretrofit.services;

import com.example.ppmretrofit.models.Book;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GotService {
    @GET("books")
    Call<List<Book>> getBooks();
}
