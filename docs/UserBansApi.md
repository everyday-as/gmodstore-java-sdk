# UserBansApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUserBans**](UserBansApi.md#listUserBans) | **GET** /users/{user_id}/bans | Fetch all active bans associated with this user

<a name="listUserBans"></a>
# **listUserBans**
> UserBanListResponse listUserBans(userId)

Fetch all active bans associated with this user

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.UserBansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserBansApi apiInstance = new UserBansApi();
Long userId = 789L; // Long | Id of the user
try {
    UserBanListResponse result = apiInstance.listUserBans(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserBansApi#listUserBans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| Id of the user |

### Return type

[**UserBanListResponse**](UserBanListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

