package com.example._20230702_vue_2.controller;

import com.example._20230702_vue_2.entity.GoodInfo;
import com.example._20230702_vue_2.repository.GoodInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goodInfo")
public class GoodHandler {
    @Autowired
    private GoodInfoRepository goodInfoRepository;
    @GetMapping("/findAll/{page}/{size}")
    public Page<GoodInfo> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Pageable pageable= PageRequest.of(page-1,size);
        return goodInfoRepository.findAll(pageable);
    }
    @PostMapping("save")
    public String save(@RequestBody GoodInfo good){
        GoodInfo res=goodInfoRepository.save(good);
        if(res!=null){
            return "success";
        }else{
            return "error";
        }
    }

    @PutMapping("/update")
    public String update(@RequestBody GoodInfo good){
        GoodInfo res=goodInfoRepository.save(good);
        if(res!=null){
            return "success";
        }else{
            return "error";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        goodInfoRepository.deleteById(id);
    }
}
