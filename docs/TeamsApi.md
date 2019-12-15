# TeamsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamsTeamIdGet**](TeamsApi.md#teamsTeamIdGet) | **GET** /teams/{team_id} | Fetch a single team

<a name="teamsTeamIdGet"></a>
# **teamsTeamIdGet**
> InlineResponse2008 teamsTeamIdGet(teamId, with)

Fetch a single team

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

TeamsApi apiInstance = new TeamsApi();
Long teamId = 789L; // Long | Id of the team
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the Team schema
try {
    InlineResponse2008 result = apiInstance.teamsTeamIdGet(teamId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| Id of the team |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the Team schema | [optional] [enum: primaryAuthor]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

