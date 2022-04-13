# ProductPurchasesApi

All URIs are relative to *https://www.gmodstore.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProductPurchase**](ProductPurchasesApi.md#createProductPurchase) | **POST** /api/v3/products/{product}/purchases | Create a purchase for a product
[**getProductPurchase**](ProductPurchasesApi.md#getProductPurchase) | **GET** /api/v3/products/{product}/purchases/{purchase} | Show the specified purchase for a product
[**listProductPurchases**](ProductPurchasesApi.md#listProductPurchases) | **GET** /api/v3/products/{product}/purchases | List all purchases for a product
[**updateProductPurchase**](ProductPurchasesApi.md#updateProductPurchase) | **PUT** /api/v3/products/{product}/purchases/{purchase} | Update the specified purchase for a product


<a name="createProductPurchase"></a>
# **createProductPurchase**
> CreateProductPurchaseResponse createProductPurchase(product, newProductPurchasePayload)

Create a purchase for a product

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.ProductPurchasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.gmodstore.com");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ProductPurchasesApi apiInstance = new ProductPurchasesApi(defaultClient);
    String product = "product_example"; // String | 
    NewProductPurchasePayload newProductPurchasePayload = new NewProductPurchasePayload(); // NewProductPurchasePayload | 
    try {
      CreateProductPurchaseResponse result = apiInstance.createProductPurchase(product, newProductPurchasePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPurchasesApi#createProductPurchase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **String**|  |
 **newProductPurchasePayload** | [**NewProductPurchasePayload**](NewProductPurchasePayload.md)|  | [optional]

### Return type

[**CreateProductPurchaseResponse**](CreateProductPurchaseResponse.md)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful response containing the newly created product purchase |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Improperly formatted request passed |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**401** | The passed bearer token is missing or invalid |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | The passed bearer token does not have the right scopes |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

<a name="getProductPurchase"></a>
# **getProductPurchase**
> GetProductPurchaseResponse getProductPurchase(product, purchase, filter)

Show the specified purchase for a product

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.ProductPurchasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.gmodstore.com");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ProductPurchasesApi apiInstance = new ProductPurchasesApi(defaultClient);
    String product = "product_example"; // String | 
    String purchase = "purchase_example"; // String | 
    ProductPurchaseFilter filter = new ProductPurchaseFilter(); // ProductPurchaseFilter | Filter the results
    try {
      GetProductPurchaseResponse result = apiInstance.getProductPurchase(product, purchase, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPurchasesApi#getProductPurchase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **String**|  |
 **purchase** | **String**|  |
 **filter** | [**ProductPurchaseFilter**](.md)| Filter the results | [optional]

### Return type

[**GetProductPurchaseResponse**](GetProductPurchaseResponse.md)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response containing a single product purchase |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Improperly formatted request passed |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**401** | The passed bearer token is missing or invalid |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | The passed bearer token does not have the right scopes |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

<a name="listProductPurchases"></a>
# **listProductPurchases**
> Object listProductPurchases(product, perPage, cursor, filter)

List all purchases for a product

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.ProductPurchasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.gmodstore.com");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ProductPurchasesApi apiInstance = new ProductPurchasesApi(defaultClient);
    String product = "product_example"; // String | 
    Integer perPage = 24; // Integer | 
    String cursor = "cursor_example"; // String | The cursor from which to return paginated results starting after
    ProductPurchaseFilter filter = new ProductPurchaseFilter(); // ProductPurchaseFilter | Filter the results
    try {
      Object result = apiInstance.listProductPurchases(product, perPage, cursor, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPurchasesApi#listProductPurchases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **String**|  |
 **perPage** | **Integer**|  | [optional] [default to 24]
 **cursor** | **String**| The cursor from which to return paginated results starting after | [optional]
 **filter** | [**ProductPurchaseFilter**](.md)| Filter the results | [optional]

### Return type

**Object**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response containing a list of product purchases |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Improperly formatted request passed |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**401** | The passed bearer token is missing or invalid |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | The passed bearer token does not have the right scopes |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

<a name="updateProductPurchase"></a>
# **updateProductPurchase**
> UpdateProductPurchaseResponse updateProductPurchase(product, purchase, updateProductPurchasePayload)

Update the specified purchase for a product

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.ProductPurchasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.gmodstore.com");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ProductPurchasesApi apiInstance = new ProductPurchasesApi(defaultClient);
    String product = "product_example"; // String | 
    String purchase = "purchase_example"; // String | 
    UpdateProductPurchasePayload updateProductPurchasePayload = new UpdateProductPurchasePayload(); // UpdateProductPurchasePayload | 
    try {
      UpdateProductPurchaseResponse result = apiInstance.updateProductPurchase(product, purchase, updateProductPurchasePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPurchasesApi#updateProductPurchase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **String**|  |
 **purchase** | **String**|  |
 **updateProductPurchasePayload** | [**UpdateProductPurchasePayload**](UpdateProductPurchasePayload.md)|  | [optional]

### Return type

[**UpdateProductPurchaseResponse**](UpdateProductPurchaseResponse.md)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response containing the product purchase with changes applied |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Improperly formatted request passed |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**401** | The passed bearer token is missing or invalid |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | The passed bearer token does not have the right scopes |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

