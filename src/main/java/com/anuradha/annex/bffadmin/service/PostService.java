package com.anuradha.annex.bffadmin.service;

import com.anuradha.annex.bffadmin.dto.PageDto;
import com.anuradha.annex.bffadmin.dto.PostDto;

public interface PostService {

    void update(PostDto postDto);

    PageDto<PostDto> findAll(int page, int limit);
}
