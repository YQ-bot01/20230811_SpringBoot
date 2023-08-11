package com.example._20230702_vue_2.repository;

import com.example._20230702_vue_2.entity.GoodInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RecordRepositoryTest {
    @Autowired
    private GoodInfoRepository recordRepository;
    @Test
    void findAll(){
        System.out.println(recordRepository.findAll());
    }

    @Test
    void save(){
        GoodInfo good=new GoodInfo();
        good.setGoodName("test1");
        good.setPrice(1);
        GoodInfo good1=recordRepository.save(good);
        System.out.println(good1);


    }

}
