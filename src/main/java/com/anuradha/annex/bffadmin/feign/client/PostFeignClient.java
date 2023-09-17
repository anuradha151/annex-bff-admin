package com.anuradha.annex.bffadmin.feign.client;

import com.anuradha.annex.bffadmin.dto.PageDto;
import com.anuradha.annex.bffadmin.dto.PostDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "post", url = "http://localhost:8090/post/")
public interface PostFeignClient {

    @GetMapping
    PageDto<PostDto> findAll(@RequestParam int page, @RequestParam int limit);

    @PutMapping
    PageDto<PostDto> update(@RequestBody PostDto postDto);

}
