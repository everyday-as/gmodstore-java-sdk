# TeamUsersApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listTeamUsers**](TeamUsersApi.md#listTeamUsers) | **GET** /teams/{team_id}/users | Fetch all the users in the given team

<a name="listTeamUsers"></a>
# **listTeamUsers**
> InlineResponse20010 listTeamUsers(teamId, with)

Fetch all the users in the given team

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.TeamUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TeamUsersApi apiInstance = new TeamUsersApi();
Long teamId = 789L; // Long | Id of the team
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the TeamUser schema
try {
    InlineResponse20010 result = apiInstance.listTeamUsers(teamId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamUsersApi#listTeamUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| Id of the team |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the TeamUser schema | [optional] [enum: user]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

