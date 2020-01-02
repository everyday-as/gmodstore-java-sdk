# AddonStatsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addonsAddonIdStatsGet**](AddonStatsApi.md#addonsAddonIdStatsGet) | **GET** /addons/{addon_id}/stats | Fetch all the stats for an addon

<a name="addonsAddonIdStatsGet"></a>
# **addonsAddonIdStatsGet**
> InlineResponse2002 addonsAddonIdStatsGet(addonId)

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

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonStatsApi apiInstance = new AddonStatsApi();
Long addonId = 789L; // Long | Id of the addon
try {
    InlineResponse2002 result = apiInstance.addonsAddonIdStatsGet(addonId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonStatsApi#addonsAddonIdStatsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

