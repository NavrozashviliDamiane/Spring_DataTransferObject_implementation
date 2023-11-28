package com.damiane.springblog.service;

import com.damiane.springblog.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
