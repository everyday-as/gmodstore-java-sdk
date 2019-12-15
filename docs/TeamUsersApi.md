# TeamUsersApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamsTeamIdUsersGet**](TeamUsersApi.md#teamsTeamIdUsersGet) | **GET** /teams/{team_id}/users | Fetch all the users in the given team

<a name="teamsTeamIdUsersGet"></a>
# **teamsTeamIdUsersGet**
> InlineResponse2009 teamsTeamIdUsersGet(teamId, with)

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

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

TeamUsersApi apiInstance = new TeamUsersApi();
Long teamId = 789L; // Long | Id of the team
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the TeamUser schema
try {
    InlineResponse2009 result = apiInstance.teamsTeamIdUsersGet(teamId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamUsersApi#teamsTeamIdUsersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| Id of the team |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the TeamUser schema | [optional] [enum: user]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

