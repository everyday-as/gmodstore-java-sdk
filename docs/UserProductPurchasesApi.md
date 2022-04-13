# UserProductPurchasesApi

All URIs are relative to *https://www.gmodstore.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUserPurchases**](UserProductPurchasesApi.md#listUserPurchases) | **GET** /api/v3/users/{user}/purchases | List all the specified user&#39;s purchases


<a name="listUserPurchases"></a>
# **listUserPurchases**
> Object listUserPurchases(user, cursor, filter)

List all the specified user&#39;s purchases

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.UserProductPurchasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.gmodstore.com");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    UserProductPurchasesApi apiInstance = new UserProductPurchasesApi(defaultClient);
    String user = "user_example"; // String | 
    String cursor = "cursor_example"; // String | The cursor from which to return paginated results starting after
    ProductPurchaseFilter filter = new ProductPurchaseFilter(); // ProductPurchaseFilter | Filter the results
    try {
      Object result = apiInstance.listUserPurchases(user, cursor, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserProductPurchasesApi#listUserPurchases");
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
 **user** | **String**|  |
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
**404** | The requested resource does not exist |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
