# AddonStatsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddonStats**](AddonStatsApi.md#getAddonStats) | **GET** /addons/{addon_id}/stats | Fetch all the stats for an addon

<a name="getAddonStats"></a>
# **getAddonStats**
> AddonStatsListResponse getAddonStats(addonId)

Fetch all the stats for an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonStatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AddonStatsApi apiInstance = new AddonStatsApi();
Long addonId = 789L; // Long | Id of the addon
try {
    AddonStatsListResponse result = apiInstance.getAddonStats(addonId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonStatsApi#getAddonStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |

### Return type

[**AddonStatsListResponse**](AddonStatsListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

