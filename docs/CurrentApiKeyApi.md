# CurrentApiKeyApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentApiKey**](CurrentApiKeyApi.md#getCurrentApiKey) | **GET** /me | Get meta information about the current API key


<a name="getCurrentApiKey"></a>
# **getCurrentApiKey**
> ApiKeyResponse getCurrentApiKey(with)

Get meta information about the current API key

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.CurrentApiKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrentApiKeyApi apiInstance = new CurrentApiKeyApi(defaultClient);
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `ApiKey`
    try {
      ApiKeyResponse result = apiInstance.getCurrentApiKey(with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentApiKeyApi#getCurrentApiKey");
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
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;ApiKey&#x60; | [optional] [enum: user]

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully processed the request. |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |
**429** | Too many requests |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  |
**0** | Something went wrong |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |

