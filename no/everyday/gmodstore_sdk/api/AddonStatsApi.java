/*
 * GmodStore API
 * Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.
 *
 * The version of the OpenAPI document: 1.2.0
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


import no.everyday.gmodstore_sdk.model.AddonStatsResponse;
import no.everyday.gmodstore_sdk.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddonStatsApi {
    private ApiClient localVarApiClient;

    public AddonStatsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AddonStatsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAddonStats
     * @param addonId Id of the addon (required)
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
    public okhttp3.Call getAddonStatsCall(Long addonId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/addons/{addon_id}/stats"
            .replaceAll("\\{" + "addon_id" + "\\}", localVarApiClient.escapeString(addonId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private okhttp3.Call getAddonStatsValidateBeforeCall(Long addonId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling getAddonStats(Async)");
        }
        

        okhttp3.Call localVarCall = getAddonStatsCall(addonId, _callback);
        return localVarCall;

    }

    /**
     * Fetch all the stats for an addon
     * 
     * @param addonId Id of the addon (required)
     * @return AddonStatsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public AddonStatsResponse getAddonStats(Long addonId) throws ApiException {
        ApiResponse<AddonStatsResponse> localVarResp = getAddonStatsWithHttpInfo(addonId);
        return localVarResp.getData();
    }

    /**
     * Fetch all the stats for an addon
     * 
     * @param addonId Id of the addon (required)
     * @return ApiResponse&lt;AddonStatsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<AddonStatsResponse> getAddonStatsWithHttpInfo(Long addonId) throws ApiException {
        okhttp3.Call localVarCall = getAddonStatsValidateBeforeCall(addonId, null);
        Type localVarReturnType = new TypeToken<AddonStatsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch all the stats for an addon (asynchronously)
     * 
     * @param addonId Id of the addon (required)
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
    public okhttp3.Call getAddonStatsAsync(Long addonId, final ApiCallback<AddonStatsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAddonStatsValidateBeforeCall(addonId, _callback);
        Type localVarReturnType = new TypeToken<AddonStatsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
