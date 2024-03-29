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
import no.everyday.gmodstore_sdk.model.CreateProductPurchaseResponse;
import no.everyday.gmodstore_sdk.model.Error;
import no.everyday.gmodstore_sdk.model.GetProductPurchaseResponse;
import no.everyday.gmodstore_sdk.model.NewProductPurchasePayload;
import no.everyday.gmodstore_sdk.model.ProductPurchaseFilter;
import no.everyday.gmodstore_sdk.model.UpdateProductPurchasePayload;
import no.everyday.gmodstore_sdk.model.UpdateProductPurchaseResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductPurchasesApi
 */
@Ignore
public class ProductPurchasesApiTest {

    private final ProductPurchasesApi api = new ProductPurchasesApi();

    
    /**
     * Create a purchase for a product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProductPurchaseTest() throws ApiException {
        String product = null;
        NewProductPurchasePayload newProductPurchasePayload = null;
                CreateProductPurchaseResponse response = api.createProductPurchase(product, newProductPurchasePayload);
        // TODO: test validations
    }
    
    /**
     * Show the specified purchase for a product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductPurchaseTest() throws ApiException {
        String product = null;
        String purchase = null;
        ProductPurchaseFilter filter = null;
                GetProductPurchaseResponse response = api.getProductPurchase(product, purchase, filter);
        // TODO: test validations
    }
    
    /**
     * List all purchases for a product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProductPurchasesTest() throws ApiException {
        String product = null;
        Integer perPage = null;
        String cursor = null;
        ProductPurchaseFilter filter = null;
                Object response = api.listProductPurchases(product, perPage, cursor, filter);
        // TODO: test validations
    }
    
    /**
     * Update the specified purchase for a product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProductPurchaseTest() throws ApiException {
        String product = null;
        String purchase = null;
        UpdateProductPurchasePayload updateProductPurchasePayload = null;
                UpdateProductPurchaseResponse response = api.updateProductPurchase(product, purchase, updateProductPurchasePayload);
        // TODO: test validations
    }
    
}
