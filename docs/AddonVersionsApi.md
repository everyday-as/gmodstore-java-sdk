# AddonVersionsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAddonVersion**](AddonVersionsApi.md#createAddonVersion) | **POST** /addons/{addon_id}/versions | Create a new version for an addon
[**downloadAddonVersion**](AddonVersionsApi.md#downloadAddonVersion) | **GET** /addons/{addon_id}/versions/{version_id}/download | Generate a download token for a specific version of an addon
[**getAddonVersion**](AddonVersionsApi.md#getAddonVersion) | **GET** /addons/{addon_id}/versions/{version_id} | Fetch a specific version of an addon
[**listAddonVersions**](AddonVersionsApi.md#listAddonVersions) | **GET** /addons/{addon_id}/versions | Fetch all the versions of an addon
[**updateAddonVersion**](AddonVersionsApi.md#updateAddonVersion) | **PUT** /addons/{addon_id}/versions/{version_id} | Update a version of an addon


<a name="createAddonVersion"></a>
# **createAddonVersion**
> AddonVersionResponse createAddonVersion(addonId, newAddonVersion, with)

Create a new version for an addon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonVersionsApi apiInstance = new AddonVersionsApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    NewAddonVersion newAddonVersion = new NewAddonVersion(); // NewAddonVersion | 
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonVersion`
    try {
      AddonVersionResponse result = apiInstance.createAddonVersion(addonId, newAddonVersion, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonVersionsApi#createAddonVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **newAddonVersion** | [**NewAddonVersion**](NewAddonVersion.md)|  |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonVersion&#x60; | [optional] [enum: addon]

### Return type

[**AddonVersionResponse**](AddonVersionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successfully processed the request. |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |
**429** | Too many requests |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  |
**0** | Something went wrong |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |

<a name="downloadAddonVersion"></a>
# **downloadAddonVersion**
> AddonDownloadResponse downloadAddonVersion(addonId, versionId)

Generate a download token for a specific version of an addon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonVersionsApi apiInstance = new AddonVersionsApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    Long versionId = 56L; // Long | Id of the version
    try {
      AddonDownloadResponse result = apiInstance.downloadAddonVersion(addonId, versionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonVersionsApi#downloadAddonVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **versionId** | **Long**| Id of the version |

### Return type

[**AddonDownloadResponse**](AddonDownloadResponse.md)

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

<a name="getAddonVersion"></a>
# **getAddonVersion**
> AddonVersionResponse getAddonVersion(addonId, versionId, with)

Fetch a specific version of an addon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonVersionsApi apiInstance = new AddonVersionsApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    Long versionId = 56L; // Long | Id of the version
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonVersion`
    try {
      AddonVersionResponse result = apiInstance.getAddonVersion(addonId, versionId, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonVersionsApi#getAddonVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **versionId** | **Long**| Id of the version |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonVersion&#x60; | [optional] [enum: addon]

### Return type

[**AddonVersionResponse**](AddonVersionResponse.md)

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

<a name="listAddonVersions"></a>
# **listAddonVersions**
> AddonVersionListResponse listAddonVersions(addonId, with)

Fetch all the versions of an addon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonVersionsApi apiInstance = new AddonVersionsApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonVersion`
    try {
      AddonVersionListResponse result = apiInstance.listAddonVersions(addonId, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonVersionsApi#listAddonVersions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonVersion&#x60; | [optional] [enum: addon]

### Return type

[**AddonVersionListResponse**](AddonVersionListResponse.md)

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

<a name="updateAddonVersion"></a>
# **updateAddonVersion**
> AddonVersionResponse updateAddonVersion(addonId, versionId, addonVersion, with)

Update a version of an addon

### Example
```java
// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonVersionsApi apiInstance = new AddonVersionsApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    Long versionId = 56L; // Long | Id of the version
    AddonVersion addonVersion = new AddonVersion(); // AddonVersion | 
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonVersion`
    try {
      AddonVersionResponse result = apiInstance.updateAddonVersion(addonId, versionId, addonVersion, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonVersionsApi#updateAddonVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **versionId** | **Long**| Id of the version |
 **addonVersion** | [**AddonVersion**](AddonVersion.md)|  |
 **with** | [**Set&lt;String&gt;**](String.md)| The relations you want to fetch with the &#x60;AddonVersion&#x60; | [optional] [enum: addon]

### Return type

[**AddonVersionResponse**](AddonVersionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully processed the request. |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |
**429** | Too many requests |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  |
**0** | Something went wrong |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  |

