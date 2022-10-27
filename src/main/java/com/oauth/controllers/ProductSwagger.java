package com.oauth.controllers;

import com.oauth.models.ProductEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

@Api
public interface ProductSwagger {
    @ApiOperation(value = "Get list of products in system", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess"),
            @ApiResponse(code = 401, message = "Not authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!"),
            @ApiResponse(code = 404, message = "Not found!") })
    public List<ProductEntity> getProductList(String consumerKey);

    @ApiOperation(value = "Get product by product ID", response = ProductEntity.class)
    public ProductEntity getProduct(Long productId);

    @ApiOperation(value = "Create product", response = String.class)
    public String createProduct(ProductEntity product);

    @ApiOperation(value = "Update product by product ID", response = String.class)
    public String updateProduct(Long productId, ProductEntity product);

    @ApiOperation(value = "Delete product by product ID", response = String.class)
    public String deleteProduct(Long productId);

}
