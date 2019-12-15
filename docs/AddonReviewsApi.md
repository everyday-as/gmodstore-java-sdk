# AddonReviewsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addonsAddonIdReviewsGet**](AddonReviewsApi.md#addonsAddonIdReviewsGet) | **GET** /addons/{addon_id}/reviews | Fetch all the reviews of an addon
[**addonsAddonIdReviewsReviewIdGet**](AddonReviewsApi.md#addonsAddonIdReviewsReviewIdGet) | **GET** /addons/{addon_id}/reviews/{review_id} | Fetch a review of an addon

<a name="addonsAddonIdReviewsGet"></a>
# **addonsAddonIdReviewsGet**
> InlineResponse2004 addonsAddonIdReviewsGet(addonId, with)

Fetch all the reviews of an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonReviewsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonReviewsApi apiInstance = new AddonReviewsApi();
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonReview schema
try {
    InlineResponse2004 result = apiInstance.addonsAddonIdReviewsGet(addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonReviewsApi#addonsAddonIdReviewsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonReview schema | [optional] [enum: addon, author]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonsAddonIdReviewsReviewIdGet"></a>
# **addonsAddonIdReviewsReviewIdGet**
> InlineResponse2005 addonsAddonIdReviewsReviewIdGet(addonId, reviewId, with)

Fetch a review of an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonReviewsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonReviewsApi apiInstance = new AddonReviewsApi();
Long addonId = 789L; // Long | Id of the addon
Long reviewId = 789L; // Long | Id of the review
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonReview schema
try {
    InlineResponse2005 result = apiInstance.addonsAddonIdReviewsReviewIdGet(addonId, reviewId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonReviewsApi#addonsAddonIdReviewsReviewIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **reviewId** | **Long**| Id of the review |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonReview schema | [optional] [enum: addon, author]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

