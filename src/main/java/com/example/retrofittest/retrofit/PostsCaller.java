package com.example.retrofittest.retrofit;

import com.example.retrofittest.retrofit.dto.PostsRequestDto;
import com.example.retrofittest.retrofit.dto.PostsResponseDto;

import java.util.List;

public interface PostsCaller {
    //포스트 단일 조회
    PostsResponseDto.Posts getPosts(Long userId);

    //모든 포스트 조회
    List<PostsResponseDto.Posts> getAllPosts(Long userId);

    //포스트 저장 (application/json)
    PostsResponseDto.Create createPosts(PostsRequestDto.Create create);

    //포스트 저장 (application/x-www-form-urlencoded)
    PostsResponseDto.Create createPostsByForm(PostsRequestDto.Create create);
}
