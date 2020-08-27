# AddonReviewsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddonReview**](AddonReviewsApi.md#getAddonReview) | **GET** /addons/{addon_id}/reviews/{review_id} | Fetch a review of an addon
[**listAddonReviews**](AddonReviewsApi.md#listAddonReviews) | **GET** /addons/{addon_id}/reviews | Fetch all the reviews of an addon

<a name="getAddonReview"></a>
# **getAddonReview**
> InlineResponse2006 getAddonReview(addonId, reviewId, with)

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


AddonReviewsApi apiInstance = new AddonReviewsApi();
Long addonId = 789L; // Long | Id of the addon
Long reviewId = 789L; // Long | Id of the review
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonReview schema
try {
    InlineResponse2006 result = apiInstance.getAddonReview(addonId, reviewId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonReviewsApi#getAddonReview");
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

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAddonReviews"></a>
# **listAddonReviews**
> InlineResponse2005 listAddonReviews(addonId, with)

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


AddonReviewsApi apiInstance = new AddonReviewsApi();
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonReview schema
try {
    InlineResponse2005 result = apiInstance.listAddonReviews(addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonReviewsApi#listAddonReviews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonReview schema | [optional] [enum: addon, author]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

