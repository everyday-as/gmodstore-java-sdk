# UserPurchasesApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersUserIdPurchasesGet**](UserPurchasesApi.md#usersUserIdPurchasesGet) | **GET** /users/{user_id}/purchases | Fetch all purchases a user has made

<a name="usersUserIdPurchasesGet"></a>
# **usersUserIdPurchasesGet**
> InlineResponse2003 usersUserIdPurchasesGet(userId, with)

Fetch all purchases a user has made

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.UserPurchasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UserPurchasesApi apiInstance = new UserPurchasesApi();
String userId = "userId_example"; // String | Id of the user
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonPurchase schema
try {
    InlineResponse2003 result = apiInstance.usersUserIdPurchasesGet(userId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserPurchasesApi#usersUserIdPurchasesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Id of the user |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonPurchase schema | [optional] [enum: addon, order_item, user]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

