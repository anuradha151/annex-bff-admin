package com.anuradha.annex.bffadmin.controller;

import com.anuradha.annex.bffadmin.dto.PageDto;
import com.anuradha.annex.bffadmin.dto.PostDto;
import com.anuradha.annex.bffadmin.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public PageDto<PostDto> findAll(@RequestParam int page, int limit) {
        return postService.findAll(page, limit);
    }

    @PutMapping
    public void update(@RequestBody PostDto postDto) {
        postService.update(postDto);
    }


}
