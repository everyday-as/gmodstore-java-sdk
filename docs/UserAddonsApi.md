# UserAddonsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUserAddons**](UserAddonsApi.md#listUserAddons) | **GET** /users/{user_id}/addons | Fetch all the addons authored / co-authored by a user

<a name="listUserAddons"></a>
# **listUserAddons**
> AddonListResponse listUserAddons(userId, with)

Fetch all the addons authored / co-authored by a user

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.UserAddonsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserAddonsApi apiInstance = new UserAddonsApi();
String userId = "userId_example"; // String | Id of the user
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the Addon schema
try {
    AddonListResponse result = apiInstance.listUserAddons(userId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAddonsApi#listUserAddons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Id of the user |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the Addon schema | [optional] [enum: latest_version, team]

### Return type

[**AddonListResponse**](AddonListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

