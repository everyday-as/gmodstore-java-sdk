# AddonsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddon**](AddonsApi.md#getAddon) | **GET** /addons/{addon_id} | Fetch a single addon
[**listSelfAddons**](AddonsApi.md#listSelfAddons) | **GET** /addons | Fetch all the addons that you have access to

<a name="getAddon"></a>
# **getAddon**
> AddonResponse getAddon(addonId, with)

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


AddonsApi apiInstance = new AddonsApi();
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the Addon schema
try {
    AddonResponse result = apiInstance.getAddon(addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonsApi#getAddon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the Addon schema | [optional] [enum: latest_version, team]

### Return type

[**AddonResponse**](AddonResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSelfAddons"></a>
# **listSelfAddons**
> AddonListResponse listSelfAddons(with)

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


AddonsApi apiInstance = new AddonsApi();
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the Addon schema
try {
    AddonListResponse result = apiInstance.listSelfAddons(with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonsApi#listSelfAddons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the Addon schema | [optional] [enum: latest_version, team]

### Return type

[**AddonListResponse**](AddonListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

