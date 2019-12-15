# UserBadgesApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersUserIdBadgesBadgeIdDelete**](UserBadgesApi.md#usersUserIdBadgesBadgeIdDelete) | **DELETE** /users/{user_id}/badges/{badge_id} | Destroy a users&#x27;s badge
[**usersUserIdBadgesGet**](UserBadgesApi.md#usersUserIdBadgesGet) | **GET** /users/{user_id}/badges | Fetch all the badges a user has
[**usersUserIdBadgesPost**](UserBadgesApi.md#usersUserIdBadgesPost) | **POST** /users/{user_id}/badges | Give a user a badge

<a name="usersUserIdBadgesBadgeIdDelete"></a>
# **usersUserIdBadgesBadgeIdDelete**
> usersUserIdBadgesBadgeIdDelete(userId, badgeId)

Destroy a users&#x27;s badge

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.UserBadgesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UserBadgesApi apiInstance = new UserBadgesApi();
String userId = "userId_example"; // String | Id of the user
Long badgeId = 789L; // Long | Id of the badge
try {
    apiInstance.usersUserIdBadgesBadgeIdDelete(userId, badgeId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserBadgesApi#usersUserIdBadgesBadgeIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Id of the user |
 **badgeId** | **Long**| Id of the badge |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersUserIdBadgesGet"></a>
# **usersUserIdBadgesGet**
> InlineResponse20013 usersUserIdBadgesGet(userId)

Fetch all the badges a user has

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.UserBadgesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UserBadgesApi apiInstance = new UserBadgesApi();
String userId = "userId_example"; // String | Id of the user
try {
    InlineResponse20013 result = apiInstance.usersUserIdBadgesGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserBadgesApi#usersUserIdBadgesGet");
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

<a name="usersUserIdBadgesPost"></a>
# **usersUserIdBadgesPost**
> InlineResponse2013 usersUserIdBadgesPost(body, userId)

Give a user a badge

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.UserBadgesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UserBadgesApi apiInstance = new UserBadgesApi();
Object body = null; // Object | 
String userId = "userId_example"; // String | Id of the user
try {
    InlineResponse2013 result = apiInstance.usersUserIdBadgesPost(body, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserBadgesApi#usersUserIdBadgesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **userId** | **String**| Id of the user |

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

