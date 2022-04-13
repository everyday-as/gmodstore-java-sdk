/*
 * gmodstore
 * Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.  # Rate limits Every request you make to the GmodStore API will count against your rate limit, which at the time of writing this, is 60 requests / minute. An up-to-date value will always provided in the `X-RateLimit-Limit` header The number of requests you have remaining before you must wait is provided in the `X-RateLimit-Remaining` header.  # API SDKs For a list of available API SDKs check the README here: https://github.com/everyday-as/gmodstore-api-docs#client-libraries
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.everyday.gmodstore_sdk.api;

import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.model.CreateProductCouponResponse;
import no.everyday.gmodstore_sdk.model.DeleteProductCouponResponse;
import no.everyday.gmodstore_sdk.model.Error;
import no.everyday.gmodstore_sdk.model.GetProductCouponResponse;
import no.everyday.gmodstore_sdk.model.NewProductCouponPayload;
import no.everyday.gmodstore_sdk.model.ProductPurchaseFilter;
import no.everyday.gmodstore_sdk.model.UpdateProductCouponPayload;
import no.everyday.gmodstore_sdk.model.UpdateProductCouponResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductCouponsApi
 */
@Ignore
public class ProductCouponsApiTest {

    private final ProductCouponsApi api = new ProductCouponsApi();

    
    /**
     * Create a coupon for a product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProductCouponTest() throws ApiException {
        String product = null;
        NewProductCouponPayload newProductCouponPayload = null;
                CreateProductCouponResponse response = api.createProductCoupon(product, newProductCouponPayload);
        // TODO: test validations
    }
    
    /**
     * Delete the specified coupon for a product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProductCouponTest() throws ApiException {
        String product = null;
        String coupon = null;
                DeleteProductCouponResponse response = api.deleteProductCoupon(product, coupon);
        // TODO: test validations
    }
    
    /**
     * Show the specified coupon for a product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductCouponTest() throws ApiException {
        String product = null;
        String coupon = null;
        ProductPurchaseFilter filter = null;
                GetProductCouponResponse response = api.getProductCoupon(product, coupon, filter);
        // TODO: test validations
    }
    
    /**
     * List all coupons for a product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProductCouponsTest() throws ApiException {
        String product = null;
        Integer perPage = null;
        String cursor = null;
        ProductPurchaseFilter filter = null;
                Object response = api.listProductCoupons(product, perPage, cursor, filter);
        // TODO: test validations
    }
    
    /**
     * Update the specified coupon for a product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProductCouponTest() throws ApiException {
        String product = null;
        String coupon = null;
        UpdateProductCouponPayload updateProductCouponPayload = null;
                UpdateProductCouponResponse response = api.updateProductCoupon(product, coupon, updateProductCouponPayload);
        // TODO: test validations
    }
    
}