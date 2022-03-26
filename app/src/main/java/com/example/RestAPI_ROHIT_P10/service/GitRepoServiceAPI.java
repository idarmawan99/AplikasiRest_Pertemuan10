package com.example.RestAPI_ROHIT_P10.service;

import com.example.RestAPI_ROHIT_P10.GitRepo;
import com.example.RestAPI_ROHIT_P10.GitUsersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface GitRepoServiceAPI {
    // pour recuperer les users
    @GET("search/users")
    Call<GitUsersResponse> searchUsers(@Query("q") String query);
    // pour recuperer les repos pour chaque user
    @GET("users/{u}/repos")
    Call<List<GitRepo>> userRepositories(@Path("u") String login);
}
