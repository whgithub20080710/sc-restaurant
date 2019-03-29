package com.stick.product.service.impl;

import com.stick.product.dataobject.ProductInfo;
import com.stick.product.enums.ProductStatusEnum;
import com.stick.product.repository.ProductInfoRepository;
import com.stick.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}