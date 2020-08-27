# AddonCouponsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAddonCoupon**](AddonCouponsApi.md#createAddonCoupon) | **POST** /addons/{addon_id}/coupons | Create an addon coupon
[**deleteAddonCoupon**](AddonCouponsApi.md#deleteAddonCoupon) | **DELETE** /addons/{addon_id}/coupons/{coupon_id} | Destroy an addon&#39;s coupon
[**getAddonCoupon**](AddonCouponsApi.md#getAddonCoupon) | **GET** /addons/{addon_id}/coupons/{coupon_id} | Fetch an addon&#39;s coupon
[**listAddonCoupons**](AddonCouponsApi.md#listAddonCoupons) | **GET** /addons/{addon_id}/coupons | Fetch all the coupons for an addon
[**updateAddonCoupon**](AddonCouponsApi.md#updateAddonCoupon) | **PUT** /addons/{addon_id}/coupons/{coupon_id} | Update an addon&#39;s coupon


<a name="createAddonCoupon"></a>
# **createAddonCoupon**
> AddonCouponResponse createAddonCoupon(addonId, addonCoupon, with)

Create an addon coupon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonCouponsApi apiInstance = new AddonCouponsApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    AddonCoupon addonCoupon = new AddonCoupon(); // AddonCoupon | 
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonCoupon`
    try {
      AddonCouponResponse result = apiInstance.createAddonCoupon(addonId, addonCoupon, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonCouponsApi#createAddonCoupon");
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
 **addonCoupon** | [**AddonCoupon**](AddonCoupon.md)|  |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonCoupon&#x60; | [optional] [enum: addon]

### Return type

[**AddonCouponResponse**](AddonCouponResponse.md)

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

<a name="deleteAddonCoupon"></a>
# **deleteAddonCoupon**
> deleteAddonCoupon(addonId, couponId)

Destroy an addon&#39;s coupon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonCouponsApi apiInstance = new AddonCouponsApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    Long couponId = 56L; // Long | Id of the coupon
    try {
      apiInstance.deleteAddonCoupon(addonId, couponId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonCouponsApi#deleteAddonCoupon");
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
 **couponId** | **Long**| Id of the coupon |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully processed the request. |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |
**429** | Too many requests |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  |
**0** | Something went wrong |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |

<a name="getAddonCoupon"></a>
# **getAddonCoupon**
> AddonCouponResponse getAddonCoupon(addonId, couponId, with)

Fetch an addon&#39;s coupon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonCouponsApi apiInstance = new AddonCouponsApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    Long couponId = 56L; // Long | Id of the coupon
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonCoupon`
    try {
      AddonCouponResponse result = apiInstance.getAddonCoupon(addonId, couponId, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonCouponsApi#getAddonCoupon");
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
 **couponId** | **Long**| Id of the coupon |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonCoupon&#x60; | [optional] [enum: addon]

### Return type

[**AddonCouponResponse**](AddonCouponResponse.md)

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

<a name="listAddonCoupons"></a>
# **listAddonCoupons**
> AddonCouponListResponse listAddonCoupons(addonId, with)

Fetch all the coupons for an addon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonCouponsApi apiInstance = new AddonCouponsApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonCoupon`
    try {
      AddonCouponListResponse result = apiInstance.listAddonCoupons(addonId, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonCouponsApi#listAddonCoupons");
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
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonCoupon&#x60; | [optional] [enum: addon]

### Return type

[**AddonCouponListResponse**](AddonCouponListResponse.md)

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

<a name="updateAddonCoupon"></a>
# **updateAddonCoupon**
> AddonCouponResponse updateAddonCoupon(addonId, couponId, addonCoupon, with)

Update an addon&#39;s coupon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonCouponsApi apiInstance = new AddonCouponsApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    Long couponId = 56L; // Long | Id of the coupon
    AddonCoupon addonCoupon = new AddonCoupon(); // AddonCoupon | 
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonCoupon`
    try {
      AddonCouponResponse result = apiInstance.updateAddonCoupon(addonId, couponId, addonCoupon, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonCouponsApi#updateAddonCoupon");
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
 **couponId** | **Long**| Id of the coupon |
 **addonCoupon** | [**AddonCoupon**](AddonCoupon.md)|  |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonCoupon&#x60; | [optional] [enum: addon]

### Return type

[**AddonCouponResponse**](AddonCouponResponse.md)

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

