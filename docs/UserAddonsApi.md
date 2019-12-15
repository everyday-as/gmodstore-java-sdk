# UserAddonsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersUserIdAddonsGet**](UserAddonsApi.md#usersUserIdAddonsGet) | **GET** /users/{user_id}/addons | Fetch all the addons authored / co-authored by a user

<a name="usersUserIdAddonsGet"></a>
# **usersUserIdAddonsGet**
> InlineResponse200 usersUserIdAddonsGet(userId, with)

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

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UserAddonsApi apiInstance = new UserAddonsApi();
String userId = "userId_example"; // String | Id of the user
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the Addon schema
try {
    InlineResponse200 result = apiInstance.usersUserIdAddonsGet(userId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAddonsApi#usersUserIdAddonsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Id of the user |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the Addon schema | [optional] [enum: latest_version, team]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

