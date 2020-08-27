# AddonCouponsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAddonCoupon**](AddonCouponsApi.md#createAddonCoupon) | **POST** /addons/{addon_id}/coupons | Create an addon coupon
[**deleteAddonCoupon**](AddonCouponsApi.md#deleteAddonCoupon) | **DELETE** /addons/{addon_id}/coupons/{coupon_id} | Destroy an addon&#x27;s coupon
[**getAddonCoupon**](AddonCouponsApi.md#getAddonCoupon) | **GET** /addons/{addon_id}/coupons/{coupon_id} | Fetch an addon&#x27;s coupon
[**listAddonCoupons**](AddonCouponsApi.md#listAddonCoupons) | **GET** /addons/{addon_id}/coupons | Fetch all the coupons for an addon
[**updateAddonCoupon**](AddonCouponsApi.md#updateAddonCoupon) | **PUT** /addons/{addon_id}/coupons/{coupon_id} | Update an addon&#x27;s coupon

<a name="createAddonCoupon"></a>
# **createAddonCoupon**
> AddonCouponResponse createAddonCoupon(body, addonId, with)

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


AddonCouponsApi apiInstance = new AddonCouponsApi();
AddonCoupon body = new AddonCoupon(); // AddonCoupon | 
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the `AddonCoupon`
try {
    AddonCouponResponse result = apiInstance.createAddonCoupon(body, addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonCouponsApi#createAddonCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddonCoupon**](AddonCoupon.md)|  |
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonCoupon&#x60; | [optional] [enum: addon]

### Return type

[**AddonCouponResponse**](AddonCouponResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAddonCoupon"></a>
# **deleteAddonCoupon**
> deleteAddonCoupon(addonId, couponId)

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


AddonCouponsApi apiInstance = new AddonCouponsApi();
Long addonId = 789L; // Long | Id of the addon
Long couponId = 789L; // Long | Id of the coupon
try {
    apiInstance.deleteAddonCoupon(addonId, couponId);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonCouponsApi#deleteAddonCoupon");
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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAddonCoupon"></a>
# **getAddonCoupon**
> AddonCouponResponse getAddonCoupon(addonId, couponId, with)

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


AddonCouponsApi apiInstance = new AddonCouponsApi();
Long addonId = 789L; // Long | Id of the addon
Long couponId = 789L; // Long | Id of the coupon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the `AddonCoupon`
try {
    AddonCouponResponse result = apiInstance.getAddonCoupon(addonId, couponId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonCouponsApi#getAddonCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **couponId** | **Long**| Id of the coupon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonCoupon&#x60; | [optional] [enum: addon]

### Return type

[**AddonCouponResponse**](AddonCouponResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAddonCoupons"></a>
# **listAddonCoupons**
> AddonCouponListResponse listAddonCoupons(addonId, with)

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


AddonCouponsApi apiInstance = new AddonCouponsApi();
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the `AddonCoupon`
try {
    AddonCouponListResponse result = apiInstance.listAddonCoupons(addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonCouponsApi#listAddonCoupons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonCoupon&#x60; | [optional] [enum: addon]

### Return type

[**AddonCouponListResponse**](AddonCouponListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAddonCoupon"></a>
# **updateAddonCoupon**
> AddonCouponResponse updateAddonCoupon(body, addonId, couponId, with)

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


AddonCouponsApi apiInstance = new AddonCouponsApi();
AddonCoupon body = new AddonCoupon(); // AddonCoupon | 
Long addonId = 789L; // Long | Id of the addon
Long couponId = 789L; // Long | Id of the coupon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the `AddonCoupon`
try {
    AddonCouponResponse result = apiInstance.updateAddonCoupon(body, addonId, couponId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonCouponsApi#updateAddonCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddonCoupon**](AddonCoupon.md)|  |
 **addonId** | **Long**| Id of the addon |
 **couponId** | **Long**| Id of the coupon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonCoupon&#x60; | [optional] [enum: addon]

### Return type

[**AddonCouponResponse**](AddonCouponResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

