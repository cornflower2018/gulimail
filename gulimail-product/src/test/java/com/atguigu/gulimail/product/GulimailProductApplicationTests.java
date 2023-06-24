package com.atguigu.gulimail.product;

import ch.qos.logback.core.read.ListAppender;
import com.atguigu.gulimail.product.entity.BrandEntity;
import com.atguigu.gulimail.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimailProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {/*
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setBrandId(11L);
        brandEntity.setDescript("苹果");
        //brandEntity.setName("华为");
        //brandService.save(brandEntity);
        //System.out.println("保存成功");
        brandService.updateById(brandEntity);*/
        List<BrandEntity> list=brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",11l));
        list.forEach((item)->{
            System.out.println(item);
        });
    }
}