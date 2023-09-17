package com.anuradha.annex.bffadmin.service.impl;

import com.anuradha.annex.bffadmin.dto.PageDto;
import com.anuradha.annex.bffadmin.dto.PostDto;
import com.anuradha.annex.bffadmin.feign.client.PostFeignClient;
import com.anuradha.annex.bffadmin.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostFeignClient postFeignClient;

    @Override
    public void update(PostDto postDto) {
        postFeignClient.update(postDto);

    }

    @Override
    public PageDto<PostDto> findAll(int page, int limit) {
        return postFeignClient.findAll(page,limit);

    }
}
