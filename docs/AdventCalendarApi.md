# AdventCalendarApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdventCalendarStats**](AdventCalendarApi.md#getAdventCalendarStats) | **GET** /events/advent-calendar/stats | Fetch statistics relating to the advent calendar event


<a name="getAdventCalendarStats"></a>
# **getAdventCalendarStats**
> AdventCalendarStatsResponse getAdventCalendarStats()

Fetch statistics relating to the advent calendar event

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AdventCalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdventCalendarApi apiInstance = new AdventCalendarApi(defaultClient);
    try {
      AdventCalendarStatsResponse result = apiInstance.getAdventCalendarStats();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdventCalendarApi#getAdventCalendarStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdventCalendarStatsResponse**](AdventCalendarStatsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully processed the request. |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |
**429** | Too many requests |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  |
**0** | Something went wrong |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |

