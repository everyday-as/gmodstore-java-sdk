# UserBadgesApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserBadge**](UserBadgesApi.md#createUserBadge) | **POST** /users/{user_id}/badges | Give a user a badge
[**deleteUserBadge**](UserBadgesApi.md#deleteUserBadge) | **DELETE** /users/{user_id}/badges/{badge_id} | Destroy a users&#x27;s badge
[**listUserBadges**](UserBadgesApi.md#listUserBadges) | **GET** /users/{user_id}/badges | Fetch all the badges a user has

<a name="createUserBadge"></a>
# **createUserBadge**
> BadgeResponse createUserBadge(body, userId)

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


UserBadgesApi apiInstance = new UserBadgesApi();
NewUserBadge body = new NewUserBadge(); // NewUserBadge | 
String userId = "userId_example"; // String | Id of the user
try {
    BadgeResponse result = apiInstance.createUserBadge(body, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserBadgesApi#createUserBadge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewUserBadge**](NewUserBadge.md)|  |
 **userId** | **String**| Id of the user |

### Return type

[**BadgeResponse**](BadgeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserBadge"></a>
# **deleteUserBadge**
> deleteUserBadge(userId, badgeId)

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


UserBadgesApi apiInstance = new UserBadgesApi();
String userId = "userId_example"; // String | Id of the user
Long badgeId = 789L; // Long | Id of the badge
try {
    apiInstance.deleteUserBadge(userId, badgeId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserBadgesApi#deleteUserBadge");
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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUserBadges"></a>
# **listUserBadges**
> BadgeListResponse listUserBadges(userId)

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


UserBadgesApi apiInstance = new UserBadgesApi();
String userId = "userId_example"; // String | Id of the user
try {
    BadgeListResponse result = apiInstance.listUserBadges(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserBadgesApi#listUserBadges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Id of the user |

### Return type

[**BadgeListResponse**](BadgeListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

