package com.bootforge.productservice.service;

import com.bootforge.productservice.dto.request.CreateProductRequest;
import com.bootforge.productservice.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse createProduct(CreateProductRequest request);

    ProductResponse getProductById(Long id);

    List<ProductResponse> getAllProducts();

    ProductResponse updateProduct(
            Long id,
            CreateProductRequest request
    );

    void deleteProduct(Long id);
}
