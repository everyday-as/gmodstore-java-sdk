# UserAddonsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUserAddons**](UserAddonsApi.md#listUserAddons) | **GET** /users/{user_id}/addons | Fetch all the addons authored / co-authored by a user


<a name="listUserAddons"></a>
# **listUserAddons**
> AddonListResponse listUserAddons(userId, with)

Fetch all the addons authored / co-authored by a user

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.UserAddonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UserAddonsApi apiInstance = new UserAddonsApi(defaultClient);
    Long userId = 56L; // Long | Id of the user
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `Addon`
    try {
      AddonListResponse result = apiInstance.listUserAddons(userId, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAddonsApi#listUserAddons");
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
 **userId** | **Long**| Id of the user |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;Addon&#x60; | [optional] [enum: latest_version, team, stats]

### Return type

[**AddonListResponse**](AddonListResponse.md)

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

