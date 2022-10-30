package com.example.retrofittest.retrofit;

import com.example.retrofittest.retrofit.dto.PostsRequestDto;
import com.example.retrofittest.retrofit.dto.PostsResponseDto;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface PostsAPI {
    @GET("/posts/{userId}")
    Call<PostsResponseDto.Posts> getPosts(@Path("userId") Long userId);

    @GET("/posts")
    Call<List<PostsResponseDto.Posts>> getAllPosts(@Query("userId") Long userId);

    @POST("/posts")
    Call<PostsResponseDto.Create> createPosts(@Body PostsRequestDto.Create create);

    @FormUrlEncoded
    @POST("/posts")
    Call<PostsResponseDto.Create> createPostsByForm(
            @Field("userId") Long userId,
            @Field("title") String title,
            @Field("body") String body
    );
}
