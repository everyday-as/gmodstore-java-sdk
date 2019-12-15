# AddonVersionsApi

All URIs are relative to *https://api.gmodstore.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addonsAddonIdVersionsGet**](AddonVersionsApi.md#addonsAddonIdVersionsGet) | **GET** /addons/{addon_id}/versions | Fetch all the versions of an addon
[**addonsAddonIdVersionsPost**](AddonVersionsApi.md#addonsAddonIdVersionsPost) | **POST** /addons/{addon_id}/versions | Create a new version for an addon
[**addonsAddonIdVersionsVersionIdDownloadGet**](AddonVersionsApi.md#addonsAddonIdVersionsVersionIdDownloadGet) | **GET** /addons/{addon_id}/versions/{version_id}/download | Generate a download token for a specific version of an addon
[**addonsAddonIdVersionsVersionIdGet**](AddonVersionsApi.md#addonsAddonIdVersionsVersionIdGet) | **GET** /addons/{addon_id}/versions/{version_id} | Fetch a specific version of an addon
[**addonsAddonIdVersionsVersionIdPut**](AddonVersionsApi.md#addonsAddonIdVersionsVersionIdPut) | **PUT** /addons/{addon_id}/versions/{version_id} | Update a version of an addon

<a name="addonsAddonIdVersionsGet"></a>
# **addonsAddonIdVersionsGet**
> InlineResponse2006 addonsAddonIdVersionsGet(addonId, with)

Fetch all the versions of an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonVersionsApi apiInstance = new AddonVersionsApi();
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonVersion schema
try {
    InlineResponse2006 result = apiInstance.addonsAddonIdVersionsGet(addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonVersionsApi#addonsAddonIdVersionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonVersion schema | [optional] [enum: addon]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonsAddonIdVersionsPost"></a>
# **addonsAddonIdVersionsPost**
> InlineResponse2012 addonsAddonIdVersionsPost(name, changelog, file, addonId, with)

Create a new version for an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonVersionsApi apiInstance = new AddonVersionsApi();
String name = "name_example"; // String | 
String changelog = "changelog_example"; // String | 
File file = new File("file_example"); // File | 
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonVersion schema
try {
    InlineResponse2012 result = apiInstance.addonsAddonIdVersionsPost(name, changelog, file, addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonVersionsApi#addonsAddonIdVersionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **changelog** | **String**|  |
 **file** | **File**|  |
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonVersion schema | [optional] [enum: addon]

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="addonsAddonIdVersionsVersionIdDownloadGet"></a>
# **addonsAddonIdVersionsVersionIdDownloadGet**
> InlineResponse2007 addonsAddonIdVersionsVersionIdDownloadGet(addonId, versionId)

Generate a download token for a specific version of an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonVersionsApi apiInstance = new AddonVersionsApi();
Long addonId = 789L; // Long | Id of the addon
Long versionId = 789L; // Long | Id of the version
try {
    InlineResponse2007 result = apiInstance.addonsAddonIdVersionsVersionIdDownloadGet(addonId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonVersionsApi#addonsAddonIdVersionsVersionIdDownloadGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **versionId** | **Long**| Id of the version |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonsAddonIdVersionsVersionIdGet"></a>
# **addonsAddonIdVersionsVersionIdGet**
> InlineResponse2012 addonsAddonIdVersionsVersionIdGet(addonId, versionId, with)

Fetch a specific version of an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonVersionsApi apiInstance = new AddonVersionsApi();
Long addonId = 789L; // Long | Id of the addon
Long versionId = 789L; // Long | Id of the version
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonVersion schema
try {
    InlineResponse2012 result = apiInstance.addonsAddonIdVersionsVersionIdGet(addonId, versionId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonVersionsApi#addonsAddonIdVersionsVersionIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **versionId** | **Long**| Id of the version |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonVersion schema | [optional] [enum: addon]

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonsAddonIdVersionsVersionIdPut"></a>
# **addonsAddonIdVersionsVersionIdPut**
> InlineResponse2012 addonsAddonIdVersionsVersionIdPut(name, changelog, file, addonId, versionId, with)

Update a version of an addon

### Example
```java
// Import classes:
//import no.everyday.gmodstore_sdk.ApiClient;
//import no.everyday.gmodstore_sdk.ApiException;
//import no.everyday.gmodstore_sdk.Configuration;
//import no.everyday.gmodstore_sdk.auth.*;
//import no.everyday.gmodstore_sdk.api.AddonVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddonVersionsApi apiInstance = new AddonVersionsApi();
String name = "name_example"; // String | 
String changelog = "changelog_example"; // String | 
File file = new File("file_example"); // File | 
Long addonId = 789L; // Long | Id of the addon
Long versionId = 789L; // Long | Id of the version
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonVersion schema
try {
    InlineResponse2012 result = apiInstance.addonsAddonIdVersionsVersionIdPut(name, changelog, file, addonId, versionId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonVersionsApi#addonsAddonIdVersionsVersionIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **changelog** | **String**|  |
 **file** | **File**|  |
 **addonId** | **Long**| Id of the addon |
 **versionId** | **Long**| Id of the version |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonVersion schema | [optional] [enum: addon]

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

