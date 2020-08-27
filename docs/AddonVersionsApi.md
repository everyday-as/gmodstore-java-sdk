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
> AddonVersionResponse createAddonVersion(name, changelog, file, releaseType, addonId, with)

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


AddonVersionsApi apiInstance = new AddonVersionsApi();
String name = "name_example"; // String | 
String changelog = "changelog_example"; // String | 
File file = new File("file_example"); // File | 
String releaseType = "releaseType_example"; // String | 
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonVersion schema
try {
    AddonVersionResponse result = apiInstance.createAddonVersion(name, changelog, file, releaseType, addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonVersionsApi#createAddonVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **changelog** | **String**|  |
 **file** | **File**|  |
 **releaseType** | **String**|  | [enum: stable, beta, alpha, private, demo]
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonVersion schema | [optional] [enum: addon]

### Return type

[**AddonVersionResponse**](AddonVersionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="downloadAddonVersion"></a>
# **downloadAddonVersion**
> AddonDownloadResponse downloadAddonVersion(addonId, versionId)

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


AddonVersionsApi apiInstance = new AddonVersionsApi();
Long addonId = 789L; // Long | Id of the addon
Long versionId = 789L; // Long | Id of the version
try {
    AddonDownloadResponse result = apiInstance.downloadAddonVersion(addonId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonVersionsApi#downloadAddonVersion");
    e.printStackTrace();
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

<a name="getAddonVersion"></a>
# **getAddonVersion**
> AddonVersionResponse getAddonVersion(addonId, versionId, with)

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


AddonVersionsApi apiInstance = new AddonVersionsApi();
Long addonId = 789L; // Long | Id of the addon
Long versionId = 789L; // Long | Id of the version
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonVersion schema
try {
    AddonVersionResponse result = apiInstance.getAddonVersion(addonId, versionId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonVersionsApi#getAddonVersion");
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

[**AddonVersionResponse**](AddonVersionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAddonVersions"></a>
# **listAddonVersions**
> AddonVersionListResponse listAddonVersions(addonId, with)

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


AddonVersionsApi apiInstance = new AddonVersionsApi();
Long addonId = 789L; // Long | Id of the addon
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonVersion schema
try {
    AddonVersionListResponse result = apiInstance.listAddonVersions(addonId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonVersionsApi#listAddonVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonId** | **Long**| Id of the addon |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonVersion schema | [optional] [enum: addon]

### Return type

[**AddonVersionListResponse**](AddonVersionListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAddonVersion"></a>
# **updateAddonVersion**
> AddonVersionResponse updateAddonVersion(name, changelog, releaseType, addonId, versionId, with)

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


AddonVersionsApi apiInstance = new AddonVersionsApi();
String name = "name_example"; // String | 
String changelog = "changelog_example"; // String | 
String releaseType = "releaseType_example"; // String | 
Long addonId = 789L; // Long | Id of the addon
Long versionId = 789L; // Long | Id of the version
List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonVersion schema
try {
    AddonVersionResponse result = apiInstance.updateAddonVersion(name, changelog, releaseType, addonId, versionId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonVersionsApi#updateAddonVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **changelog** | **String**|  |
 **releaseType** | **String**|  | [enum: stable, beta, alpha, private, demo]
 **addonId** | **Long**| Id of the addon |
 **versionId** | **Long**| Id of the version |
 **with** | [**List&lt;String&gt;**](String.md)| The relations you want to fetch with the AddonVersion schema | [optional] [enum: addon]

### Return type

[**AddonVersionResponse**](AddonVersionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

