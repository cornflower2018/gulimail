package com.atguigu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.BrandEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Map;
/**
 * 品牌
 *
 * @author cuisanxing
 * @email 1286519253@qq.com
 * @date 2023-06-24 12:36:57
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

