# AddonsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addonsAddonIdGet**](AddonsApi.md#addonsAddonIdGet) | **GET** /addons/{addon_id} | Fetch a single addon
[**addonsGet**](AddonsApi.md#addonsGet) | **GET** /addons | Fetch all the addons that you have access to

<a name="addonsAddonIdGet"></a>
# **addonsAddonIdGet**
> InlineResponse2001 addonsAddonIdGet(addonId, with)

Fetch a single addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonsApi apiInstance = new AddonsApi();
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the Addon schema
try {
    InlineResponse2001 result = apiInstance.addonsAddonIdGet(addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonsApi#addonsAddonIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the Addon schema | [optional] [enum: latest_version, team]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonsGet"></a>
# **addonsGet**
> InlineResponse200 addonsGet(with)

Fetch all the addons that you have access to

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonsApi apiInstance = new AddonsApi();
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the Addon schema
try {
    InlineResponse200 result = apiInstance.addonsGet(with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonsApi#addonsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the Addon schema | [optional] [enum: latest_version, team]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

