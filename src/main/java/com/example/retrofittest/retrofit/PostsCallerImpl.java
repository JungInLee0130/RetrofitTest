package com.example.retrofittest.retrofit;

import com.example.retrofittest.retrofit.dto.PostsRequestDto;
import com.example.retrofittest.retrofit.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import retrofit2.Call;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PostsCallerImpl implements PostsCaller {
    private final RetrofitUtils retrofitUtils;

    private final PostsAPI postsAPI;

    @Override
    public PostsResponseDto.Posts getPosts(Long userId) {
        Call<PostsResponseDto.Posts> call = postsAPI.getPosts(userId);
        return retrofitUtils.execute(call);
    }

    @Override
    public List<PostsResponseDto.Posts> getAllPosts(Long userId) {
        Call<List<PostsResponseDto.Posts>> call = postsAPI.getAllPosts(userId);
        return retrofitUtils.execute(call);
    }

    @Override
    public PostsResponseDto.Create createPosts(PostsRequestDto.Create create) {
        Call<PostsResponseDto.Create> call = postsAPI.createPosts(create);
        return retrofitUtils.execute(call);
    }

    @Override
    public PostsResponseDto.Create createPostsByForm(PostsRequestDto.Create create) {
        Call<PostsResponseDto.Create> call = postsAPI.createPostsByForm(
                create.getUserId(),
                create.getTitle(),
                create.getBody()
        );

        return retrofitUtils.execute(call);
    }


}
