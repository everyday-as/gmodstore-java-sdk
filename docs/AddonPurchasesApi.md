# AddonPurchasesApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addonsAddonIdPurchasesGet**](AddonPurchasesApi.md#addonsAddonIdPurchasesGet) | **GET** /addons/{addon_id}/purchases | Fetch all purchases of an addon
[**addonsAddonIdPurchasesPost**](AddonPurchasesApi.md#addonsAddonIdPurchasesPost) | **POST** /addons/{addon_id}/purchases | Create a purchase for an addon
[**addonsAddonIdPurchasesUserIdGet**](AddonPurchasesApi.md#addonsAddonIdPurchasesUserIdGet) | **GET** /addons/{addon_id}/purchases/{user_id} | Get a purchase of an addon by user
[**addonsAddonIdPurchasesUserIdPut**](AddonPurchasesApi.md#addonsAddonIdPurchasesUserIdPut) | **PUT** /addons/{addon_id}/purchases/{user_id} | Update a purchase for an addon

<a name="addonsAddonIdPurchasesGet"></a>
# **addonsAddonIdPurchasesGet**
> InlineResponse2003 addonsAddonIdPurchasesGet(addonId, with)

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

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonPurchasesApi apiInstance = new AddonPurchasesApi();
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonPurchase schema
try {
    InlineResponse2003 result = apiInstance.addonsAddonIdPurchasesGet(addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonPurchasesApi#addonsAddonIdPurchasesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonPurchase schema | [optional] [enum: addon, order_item, user]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonsAddonIdPurchasesPost"></a>
# **addonsAddonIdPurchasesPost**
> InlineResponse2011 addonsAddonIdPurchasesPost(body, addonId, with)

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

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonPurchasesApi apiInstance = new AddonPurchasesApi();
Object body = null; // Object | 
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonPurchase schema
try {
    InlineResponse2011 result = apiInstance.addonsAddonIdPurchasesPost(body, addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonPurchasesApi#addonsAddonIdPurchasesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonPurchase schema | [optional] [enum: addon, order_item, user]

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonsAddonIdPurchasesUserIdGet"></a>
# **addonsAddonIdPurchasesUserIdGet**
> InlineResponse2011 addonsAddonIdPurchasesUserIdGet(addonId, userId, with)

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

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonPurchasesApi apiInstance = new AddonPurchasesApi();
Long addonId = 789L; // Long | Id of the addon
String userId = "userId_example"; // String | Id of the user
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonPurchase schema
try {
    InlineResponse2011 result = apiInstance.addonsAddonIdPurchasesUserIdGet(addonId, userId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonPurchasesApi#addonsAddonIdPurchasesUserIdGet");
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

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonsAddonIdPurchasesUserIdPut"></a>
# **addonsAddonIdPurchasesUserIdPut**
> InlineResponse2011 addonsAddonIdPurchasesUserIdPut(body, addonId, userId, with)

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

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonPurchasesApi apiInstance = new AddonPurchasesApi();
Object body = null; // Object | 
Long addonId = 789L; // Long | Id of the addon
String userId = "userId_example"; // String | Id of the user
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonPurchase schema
try {
    InlineResponse2011 result = apiInstance.addonsAddonIdPurchasesUserIdPut(body, addonId, userId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonPurchasesApi#addonsAddonIdPurchasesUserIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **addonId** | **Long**| Id of the addon |
 **userId** | **String**| Id of the user |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonPurchase schema | [optional] [enum: addon, order_item, user]

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

