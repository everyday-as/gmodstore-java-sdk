# AddonCouponsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addonsAddonIdCouponsCouponIdDelete**](AddonCouponsApi.md#addonsAddonIdCouponsCouponIdDelete) | **DELETE** /addons/{addon_id}/coupons/{coupon_id} | Destroy an addon&#x27;s coupon
[**addonsAddonIdCouponsCouponIdGet**](AddonCouponsApi.md#addonsAddonIdCouponsCouponIdGet) | **GET** /addons/{addon_id}/coupons/{coupon_id} | Fetch an addon&#x27;s coupon
[**addonsAddonIdCouponsCouponIdPut**](AddonCouponsApi.md#addonsAddonIdCouponsCouponIdPut) | **PUT** /addons/{addon_id}/coupons/{coupon_id} | Update an addon&#x27;s coupon
[**addonsAddonIdCouponsGet**](AddonCouponsApi.md#addonsAddonIdCouponsGet) | **GET** /addons/{addon_id}/coupons | Fetch all the coupons for an addon
[**addonsAddonIdCouponsPost**](AddonCouponsApi.md#addonsAddonIdCouponsPost) | **POST** /addons/{addon_id}/coupons | Create an addon coupon

<a name="addonsAddonIdCouponsCouponIdDelete"></a>
# **addonsAddonIdCouponsCouponIdDelete**
> addonsAddonIdCouponsCouponIdDelete(addonId, couponId)

Destroy an addon&#x27;s coupon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonCouponsApi apiInstance = new AddonCouponsApi();
Long addonId = 789L; // Long | Id of the addon
Long couponId = 789L; // Long | Id of the coupon
try {
    apiInstance.addonsAddonIdCouponsCouponIdDelete(addonId, couponId);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonCouponsApi#addonsAddonIdCouponsCouponIdDelete");
    e.printStackTrace();
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

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonsAddonIdCouponsCouponIdGet"></a>
# **addonsAddonIdCouponsCouponIdGet**
> InlineResponse201 addonsAddonIdCouponsCouponIdGet(addonId, couponId, with)

Fetch an addon&#x27;s coupon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonCouponsApi apiInstance = new AddonCouponsApi();
Long addonId = 789L; // Long | Id of the addon
Long couponId = 789L; // Long | Id of the coupon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonCoupon schema
try {
    InlineResponse201 result = apiInstance.addonsAddonIdCouponsCouponIdGet(addonId, couponId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonCouponsApi#addonsAddonIdCouponsCouponIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **couponId** | **Long**| Id of the coupon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonCoupon schema | [optional] [enum: addon]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonsAddonIdCouponsCouponIdPut"></a>
# **addonsAddonIdCouponsCouponIdPut**
> InlineResponse201 addonsAddonIdCouponsCouponIdPut(body, addonId, couponId, with)

Update an addon&#x27;s coupon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonCouponsApi apiInstance = new AddonCouponsApi();
Object body = null; // Object | 
Long addonId = 789L; // Long | Id of the addon
Long couponId = 789L; // Long | Id of the coupon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonCoupon schema
try {
    InlineResponse201 result = apiInstance.addonsAddonIdCouponsCouponIdPut(body, addonId, couponId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonCouponsApi#addonsAddonIdCouponsCouponIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **addonId** | **Long**| Id of the addon |
 **couponId** | **Long**| Id of the coupon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonCoupon schema | [optional] [enum: addon]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonsAddonIdCouponsGet"></a>
# **addonsAddonIdCouponsGet**
> InlineResponse2003 addonsAddonIdCouponsGet(addonId, with)

Fetch all the coupons for an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonCouponsApi apiInstance = new AddonCouponsApi();
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonCoupon schema
try {
    InlineResponse2003 result = apiInstance.addonsAddonIdCouponsGet(addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonCouponsApi#addonsAddonIdCouponsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonCoupon schema | [optional] [enum: addon]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonsAddonIdCouponsPost"></a>
# **addonsAddonIdCouponsPost**
> InlineResponse201 addonsAddonIdCouponsPost(body, addonId, with)

Create an addon coupon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonCouponsApi apiInstance = new AddonCouponsApi();
Object body = null; // Object | 
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonCoupon schema
try {
    InlineResponse201 result = apiInstance.addonsAddonIdCouponsPost(body, addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonCouponsApi#addonsAddonIdCouponsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonCoupon schema | [optional] [enum: addon]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

