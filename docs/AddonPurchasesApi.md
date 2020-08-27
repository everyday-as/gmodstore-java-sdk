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
> AddonPurchaseResponse createAddonPurchase(body, addonId, with)

Create a purchase for an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonPurchasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AddonPurchasesApi apiInstance = new AddonPurchasesApi();
NewAddonPurchase body = new NewAddonPurchase(); // NewAddonPurchase | 
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonPurchase schema
try {
    AddonPurchaseResponse result = apiInstance.createAddonPurchase(body, addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonPurchasesApi#createAddonPurchase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewAddonPurchase**](NewAddonPurchase.md)|  |
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonPurchase schema | [optional] [enum: addon, order_item, user]

### Return type

[**AddonPurchaseResponse**](AddonPurchaseResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddonPurchase"></a>
# **getAddonPurchase**
> AddonPurchaseResponse getAddonPurchase(addonId, userId, with)

Get a purchase of an addon by user

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonPurchasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AddonPurchasesApi apiInstance = new AddonPurchasesApi();
Long addonId = 789L; // Long | Id of the addon
String userId = "userId_example"; // String | Id of the user
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonPurchase schema
try {
    AddonPurchaseResponse result = apiInstance.getAddonPurchase(addonId, userId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonPurchasesApi#getAddonPurchase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **userId** | **String**| Id of the user |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonPurchase schema | [optional] [enum: addon, order_item, user]

### Return type

[**AddonPurchaseResponse**](AddonPurchaseResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAddonPurchases"></a>
# **listAddonPurchases**
> AddonPurchaseListResponse listAddonPurchases(addonId, with)

Fetch all purchases of an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonPurchasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AddonPurchasesApi apiInstance = new AddonPurchasesApi();
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonPurchase schema
try {
    AddonPurchaseListResponse result = apiInstance.listAddonPurchases(addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonPurchasesApi#listAddonPurchases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonPurchase schema | [optional] [enum: addon, order_item, user]

### Return type

[**AddonPurchaseListResponse**](AddonPurchaseListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAddonPurchase"></a>
# **updateAddonPurchase**
> AddonPurchaseResponse updateAddonPurchase(body, addonId, userId, with)

Update a purchase for an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonPurchasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AddonPurchasesApi apiInstance = new AddonPurchasesApi();
UpdateAddonPurchase body = new UpdateAddonPurchase(); // UpdateAddonPurchase | 
Long addonId = 789L; // Long | Id of the addon
String userId = "userId_example"; // String | Id of the user
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonPurchase schema
try {
    AddonPurchaseResponse result = apiInstance.updateAddonPurchase(body, addonId, userId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonPurchasesApi#updateAddonPurchase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateAddonPurchase**](UpdateAddonPurchase.md)|  |
 **addonId** | **Long**| Id of the addon |
 **userId** | **String**| Id of the user |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonPurchase schema | [optional] [enum: addon, order_item, user]

### Return type

[**AddonPurchaseResponse**](AddonPurchaseResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

