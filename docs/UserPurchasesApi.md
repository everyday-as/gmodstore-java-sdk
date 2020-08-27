# UserPurchasesApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUserPurchases**](UserPurchasesApi.md#listUserPurchases) | **GET** /users/{user_id}/purchases | Fetch all purchases a user has made

<a name="listUserPurchases"></a>
# **listUserPurchases**
> InlineResponse2004 listUserPurchases(userId, with)

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


UserPurchasesApi apiInstance = new UserPurchasesApi();
String userId = "userId_example"; // String | Id of the user
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonPurchase schema
try {
    InlineResponse2004 result = apiInstance.listUserPurchases(userId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserPurchasesApi#listUserPurchases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Id of the user |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonPurchase schema | [optional] [enum: addon, order_item, user]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

