# AddonPurchasesApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAddonPurchase**](AddonPurchasesApi.md#createAddonPurchase) | **POST** /addons/{addon_id}/purchases | Create a purchase for an addon
[**getAddonPurchase**](AddonPurchasesApi.md#getAddonPurchase) | **GET** /addons/{addon_id}/purchases/{user_id} | Get a purchase of an addon by user
[**listAddonPurchases**](AddonPurchasesApi.md#listAddonPurchases) | **GET** /addons/{addon_id}/purchases | Fetch all purchases of an addon
[**updateAddonPurchase**](AddonPurchasesApi.md#updateAddonPurchase) | **PUT** /addons/{addon_id}/purchases/{user_id} | Update a purchase for an addon


<a name="createAddonPurchase"></a>
# **createAddonPurchase**
> AddonPurchaseResponse createAddonPurchase(addonId, newAddonPurchase, with)

Create a purchase for an addon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonPurchasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonPurchasesApi apiInstance = new AddonPurchasesApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    NewAddonPurchase newAddonPurchase = new NewAddonPurchase(); // NewAddonPurchase | 
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonPurchase`
    try {
      AddonPurchaseResponse result = apiInstance.createAddonPurchase(addonId, newAddonPurchase, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonPurchasesApi#createAddonPurchase");
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
 **addonId** | **Long**| Id of the addon |
 **newAddonPurchase** | [**NewAddonPurchase**](NewAddonPurchase.md)|  |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonPurchase&#x60; | [optional] [enum: addon, order_item, user]

### Return type

[**AddonPurchaseResponse**](AddonPurchaseResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successfully processed the request. |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |
**429** | Too many requests |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  |
**0** | Something went wrong |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |

<a name="getAddonPurchase"></a>
# **getAddonPurchase**
> AddonPurchaseResponse getAddonPurchase(addonId, userId, with)

Get a purchase of an addon by user

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonPurchasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonPurchasesApi apiInstance = new AddonPurchasesApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    Long userId = 56L; // Long | Id of the user
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonPurchase`
    try {
      AddonPurchaseResponse result = apiInstance.getAddonPurchase(addonId, userId, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonPurchasesApi#getAddonPurchase");
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
 **addonId** | **Long**| Id of the addon |
 **userId** | **Long**| Id of the user |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonPurchase&#x60; | [optional] [enum: addon, order_item, user]

### Return type

[**AddonPurchaseResponse**](AddonPurchaseResponse.md)

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

<a name="listAddonPurchases"></a>
# **listAddonPurchases**
> AddonPurchaseListResponse listAddonPurchases(addonId, with)

Fetch all purchases of an addon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonPurchasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonPurchasesApi apiInstance = new AddonPurchasesApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonPurchase`
    try {
      AddonPurchaseListResponse result = apiInstance.listAddonPurchases(addonId, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonPurchasesApi#listAddonPurchases");
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
 **addonId** | **Long**| Id of the addon |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonPurchase&#x60; | [optional] [enum: addon, order_item, user]

### Return type

[**AddonPurchaseListResponse**](AddonPurchaseListResponse.md)

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

<a name="updateAddonPurchase"></a>
# **updateAddonPurchase**
> AddonPurchaseResponse updateAddonPurchase(addonId, userId, addonPurchase, with)

Update a purchase for an addon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonPurchasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonPurchasesApi apiInstance = new AddonPurchasesApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    Long userId = 56L; // Long | Id of the user
    AddonPurchase addonPurchase = new AddonPurchase(); // AddonPurchase | 
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonPurchase`
    try {
      AddonPurchaseResponse result = apiInstance.updateAddonPurchase(addonId, userId, addonPurchase, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonPurchasesApi#updateAddonPurchase");
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
 **addonId** | **Long**| Id of the addon |
 **userId** | **Long**| Id of the user |
 **addonPurchase** | [**AddonPurchase**](AddonPurchase.md)|  |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonPurchase&#x60; | [optional] [enum: addon, order_item, user]

### Return type

[**AddonPurchaseResponse**](AddonPurchaseResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully processed the request. |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |
**429** | Too many requests |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  |
**0** | Something went wrong |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |

