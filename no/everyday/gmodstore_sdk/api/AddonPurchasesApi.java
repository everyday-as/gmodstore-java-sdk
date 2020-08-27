/*
 * GmodStore
 * Welcome to the Gmodstore API! You can use our API to access Gmodstore API endpoints, which can be used interact with Gmodstore programmatically.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.everyday.gmodstore_sdk.api;

import no.everyday.gmodstore_sdk.ApiCallback;
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.ApiResponse;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.Pair;
import no.everyday.gmodstore_sdk.ProgressRequestBody;
import no.everyday.gmodstore_sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import no.everyday.gmodstore_sdk.model.AddonPurchase;
import no.everyday.gmodstore_sdk.model.AddonPurchaseListResponse;
import no.everyday.gmodstore_sdk.model.AddonPurchaseResponse;
import no.everyday.gmodstore_sdk.model.ErrorResponse;
import no.everyday.gmodstore_sdk.model.NewAddonPurchase;
import java.util.Set;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddonPurchasesApi {
    private ApiClient localVarApiClient;

    public AddonPurchasesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AddonPurchasesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createAddonPurchase
     * @param addonId Id of the addon (required)
     * @param newAddonPurchase  (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createAddonPurchaseCall(Long addonId, NewAddonPurchase newAddonPurchase, Set<String> with, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = newAddonPurchase;

        // create path and map variables
        String localVarPath = "/addons/{addon_id}/purchases"
            .replaceAll("\\{" + "addon_id" + "\\}", localVarApiClient.escapeString(addonId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (with != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "with", with));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createAddonPurchaseValidateBeforeCall(Long addonId, NewAddonPurchase newAddonPurchase, Set<String> with, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling createAddonPurchase(Async)");
        }
        
        // verify the required parameter 'newAddonPurchase' is set
        if (newAddonPurchase == null) {
            throw new ApiException("Missing the required parameter 'newAddonPurchase' when calling createAddonPurchase(Async)");
        }
        

        okhttp3.Call localVarCall = createAddonPurchaseCall(addonId, newAddonPurchase, with, _callback);
        return localVarCall;

    }

    /**
     * Create a purchase for an addon
     * 
     * @param addonId Id of the addon (required)
     * @param newAddonPurchase  (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return AddonPurchaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public AddonPurchaseResponse createAddonPurchase(Long addonId, NewAddonPurchase newAddonPurchase, Set<String> with) throws ApiException {
        ApiResponse<AddonPurchaseResponse> localVarResp = createAddonPurchaseWithHttpInfo(addonId, newAddonPurchase, with);
        return localVarResp.getData();
    }

    /**
     * Create a purchase for an addon
     * 
     * @param addonId Id of the addon (required)
     * @param newAddonPurchase  (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return ApiResponse&lt;AddonPurchaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<AddonPurchaseResponse> createAddonPurchaseWithHttpInfo(Long addonId, NewAddonPurchase newAddonPurchase, Set<String> with) throws ApiException {
        okhttp3.Call localVarCall = createAddonPurchaseValidateBeforeCall(addonId, newAddonPurchase, with, null);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a purchase for an addon (asynchronously)
     * 
     * @param addonId Id of the addon (required)
     * @param newAddonPurchase  (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createAddonPurchaseAsync(Long addonId, NewAddonPurchase newAddonPurchase, Set<String> with, final ApiCallback<AddonPurchaseResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAddonPurchaseValidateBeforeCall(addonId, newAddonPurchase, with, _callback);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAddonPurchase
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getAddonPurchaseCall(Long addonId, Long userId, Set<String> with, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/addons/{addon_id}/purchases/{user_id}"
            .replaceAll("\\{" + "addon_id" + "\\}", localVarApiClient.escapeString(addonId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (with != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "with", with));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAddonPurchaseValidateBeforeCall(Long addonId, Long userId, Set<String> with, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling getAddonPurchase(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getAddonPurchase(Async)");
        }
        

        okhttp3.Call localVarCall = getAddonPurchaseCall(addonId, userId, with, _callback);
        return localVarCall;

    }

    /**
     * Get a purchase of an addon by user
     * 
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return AddonPurchaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public AddonPurchaseResponse getAddonPurchase(Long addonId, Long userId, Set<String> with) throws ApiException {
        ApiResponse<AddonPurchaseResponse> localVarResp = getAddonPurchaseWithHttpInfo(addonId, userId, with);
        return localVarResp.getData();
    }

    /**
     * Get a purchase of an addon by user
     * 
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return ApiResponse&lt;AddonPurchaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<AddonPurchaseResponse> getAddonPurchaseWithHttpInfo(Long addonId, Long userId, Set<String> with) throws ApiException {
        okhttp3.Call localVarCall = getAddonPurchaseValidateBeforeCall(addonId, userId, with, null);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a purchase of an addon by user (asynchronously)
     * 
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getAddonPurchaseAsync(Long addonId, Long userId, Set<String> with, final ApiCallback<AddonPurchaseResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAddonPurchaseValidateBeforeCall(addonId, userId, with, _callback);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAddonPurchases
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call listAddonPurchasesCall(Long addonId, Set<String> with, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/addons/{addon_id}/purchases"
            .replaceAll("\\{" + "addon_id" + "\\}", localVarApiClient.escapeString(addonId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (with != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "with", with));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAddonPurchasesValidateBeforeCall(Long addonId, Set<String> with, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling listAddonPurchases(Async)");
        }
        

        okhttp3.Call localVarCall = listAddonPurchasesCall(addonId, with, _callback);
        return localVarCall;

    }

    /**
     * Fetch all purchases of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return AddonPurchaseListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public AddonPurchaseListResponse listAddonPurchases(Long addonId, Set<String> with) throws ApiException {
        ApiResponse<AddonPurchaseListResponse> localVarResp = listAddonPurchasesWithHttpInfo(addonId, with);
        return localVarResp.getData();
    }

    /**
     * Fetch all purchases of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return ApiResponse&lt;AddonPurchaseListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<AddonPurchaseListResponse> listAddonPurchasesWithHttpInfo(Long addonId, Set<String> with) throws ApiException {
        okhttp3.Call localVarCall = listAddonPurchasesValidateBeforeCall(addonId, with, null);
        Type localVarReturnType = new TypeToken<AddonPurchaseListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch all purchases of an addon (asynchronously)
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call listAddonPurchasesAsync(Long addonId, Set<String> with, final ApiCallback<AddonPurchaseListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAddonPurchasesValidateBeforeCall(addonId, with, _callback);
        Type localVarReturnType = new TypeToken<AddonPurchaseListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateAddonPurchase
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param addonPurchase  (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call updateAddonPurchaseCall(Long addonId, Long userId, AddonPurchase addonPurchase, Set<String> with, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = addonPurchase;

        // create path and map variables
        String localVarPath = "/addons/{addon_id}/purchases/{user_id}"
            .replaceAll("\\{" + "addon_id" + "\\}", localVarApiClient.escapeString(addonId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (with != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "with", with));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateAddonPurchaseValidateBeforeCall(Long addonId, Long userId, AddonPurchase addonPurchase, Set<String> with, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling updateAddonPurchase(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateAddonPurchase(Async)");
        }
        
        // verify the required parameter 'addonPurchase' is set
        if (addonPurchase == null) {
            throw new ApiException("Missing the required parameter 'addonPurchase' when calling updateAddonPurchase(Async)");
        }
        

        okhttp3.Call localVarCall = updateAddonPurchaseCall(addonId, userId, addonPurchase, with, _callback);
        return localVarCall;

    }

    /**
     * Update a purchase for an addon
     * 
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param addonPurchase  (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return AddonPurchaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public AddonPurchaseResponse updateAddonPurchase(Long addonId, Long userId, AddonPurchase addonPurchase, Set<String> with) throws ApiException {
        ApiResponse<AddonPurchaseResponse> localVarResp = updateAddonPurchaseWithHttpInfo(addonId, userId, addonPurchase, with);
        return localVarResp.getData();
    }

    /**
     * Update a purchase for an addon
     * 
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param addonPurchase  (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return ApiResponse&lt;AddonPurchaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<AddonPurchaseResponse> updateAddonPurchaseWithHttpInfo(Long addonId, Long userId, AddonPurchase addonPurchase, Set<String> with) throws ApiException {
        okhttp3.Call localVarCall = updateAddonPurchaseValidateBeforeCall(addonId, userId, addonPurchase, with, null);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a purchase for an addon (asynchronously)
     * 
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param addonPurchase  (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call updateAddonPurchaseAsync(Long addonId, Long userId, AddonPurchase addonPurchase, Set<String> with, final ApiCallback<AddonPurchaseResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAddonPurchaseValidateBeforeCall(addonId, userId, addonPurchase, with, _callback);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
