# UserBansApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersUserIdBansGet**](UserBansApi.md#usersUserIdBansGet) | **GET** /users/{user_id}/bans | Fetch all active bans associated with this user

<a name="usersUserIdBansGet"></a>
# **usersUserIdBansGet**
> InlineResponse20013 usersUserIdBansGet(userId)

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

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UserBansApi apiInstance = new UserBansApi();
String userId = "userId_example"; // String | Id of the user
try {
    InlineResponse20013 result = apiInstance.usersUserIdBansGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserBansApi#usersUserIdBansGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Id of the user |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

