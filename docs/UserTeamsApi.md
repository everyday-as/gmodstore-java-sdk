# UserTeamsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUserTeams**](UserTeamsApi.md#listUserTeams) | **GET** /users/{user_id}/teams | Fetch all the teams of a user

<a name="listUserTeams"></a>
# **listUserTeams**
> InlineResponse20012 listUserTeams(userId, with)

Fetch all the teams of a user

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.UserTeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserTeamsApi apiInstance = new UserTeamsApi();
String userId = "userId_example"; // String | Id of the user
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the Team schema
try {
    InlineResponse20012 result = apiInstance.listUserTeams(userId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserTeamsApi#listUserTeams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Id of the user |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the Team schema | [optional] [enum: primaryAuthor]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

