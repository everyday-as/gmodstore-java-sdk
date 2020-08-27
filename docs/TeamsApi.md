# TeamsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTeam**](TeamsApi.md#getTeam) | **GET** /teams/{team_id} | Fetch a single team

<a name="getTeam"></a>
# **getTeam**
> InlineResponse2009 getTeam(teamId, with)

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


TeamsApi apiInstance = new TeamsApi();
Long teamId = 789L; // Long | Id of the team
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the Team schema
try {
    InlineResponse2009 result = apiInstance.getTeam(teamId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| Id of the team |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the Team schema | [optional] [enum: primaryAuthor]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

