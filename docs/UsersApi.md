# UsersApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSelfUser**](UsersApi.md#getSelfUser) | **GET** /users/me | Fetches the current user (API Key Owner)
[**getUser**](UsersApi.md#getUser) | **GET** /users/{user_id} | Fetch a single user

<a name="getSelfUser"></a>
# **getSelfUser**
> UserResponse getSelfUser(with)

Fetches the current user (API Key Owner)

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UsersApi apiInstance = new UsersApi();
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the User schema
try {
    UserResponse result = apiInstance.getSelfUser(with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getSelfUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the User schema | [optional] [enum: group]

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserResponse getUser(userId, with)

Fetch a single user

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | Id of the user
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the User schema
try {
    UserResponse result = apiInstance.getUser(userId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Id of the user |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the User schema | [optional] [enum: group]

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

