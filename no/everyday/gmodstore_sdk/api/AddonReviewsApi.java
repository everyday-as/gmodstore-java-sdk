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


import no.everyday.gmodstore_sdk.model.AddonReviewListResponse;
import no.everyday.gmodstore_sdk.model.AddonReviewResponse;
import no.everyday.gmodstore_sdk.model.ErrorResponse;
import java.util.Set;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddonReviewsApi {
    private ApiClient localVarApiClient;

    public AddonReviewsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AddonReviewsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAddonReview
     * @param addonId Id of the addon (required)
     * @param reviewId Id of the review (required)
     * @param with The relations you want to fetch with the &#x60;AddonReview&#x60; (optional)
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
    public okhttp3.Call getAddonReviewCall(Long addonId, Long reviewId, Set<String> with, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/addons/{addon_id}/reviews/{review_id}"
            .replaceAll("\\{" + "addon_id" + "\\}", localVarApiClient.escapeString(addonId.toString()))
            .replaceAll("\\{" + "review_id" + "\\}", localVarApiClient.escapeString(reviewId.toString()));

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
    private okhttp3.Call getAddonReviewValidateBeforeCall(Long addonId, Long reviewId, Set<String> with, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling getAddonReview(Async)");
        }
        
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new ApiException("Missing the required parameter 'reviewId' when calling getAddonReview(Async)");
        }
        

        okhttp3.Call localVarCall = getAddonReviewCall(addonId, reviewId, with, _callback);
        return localVarCall;

    }

    /**
     * Fetch a review of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param reviewId Id of the review (required)
     * @param with The relations you want to fetch with the &#x60;AddonReview&#x60; (optional)
     * @return AddonReviewResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public AddonReviewResponse getAddonReview(Long addonId, Long reviewId, Set<String> with) throws ApiException {
        ApiResponse<AddonReviewResponse> localVarResp = getAddonReviewWithHttpInfo(addonId, reviewId, with);
        return localVarResp.getData();
    }

    /**
     * Fetch a review of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param reviewId Id of the review (required)
     * @param with The relations you want to fetch with the &#x60;AddonReview&#x60; (optional)
     * @return ApiResponse&lt;AddonReviewResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<AddonReviewResponse> getAddonReviewWithHttpInfo(Long addonId, Long reviewId, Set<String> with) throws ApiException {
        okhttp3.Call localVarCall = getAddonReviewValidateBeforeCall(addonId, reviewId, with, null);
        Type localVarReturnType = new TypeToken<AddonReviewResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch a review of an addon (asynchronously)
     * 
     * @param addonId Id of the addon (required)
     * @param reviewId Id of the review (required)
     * @param with The relations you want to fetch with the &#x60;AddonReview&#x60; (optional)
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
    public okhttp3.Call getAddonReviewAsync(Long addonId, Long reviewId, Set<String> with, final ApiCallback<AddonReviewResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAddonReviewValidateBeforeCall(addonId, reviewId, with, _callback);
        Type localVarReturnType = new TypeToken<AddonReviewResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAddonReviews
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonReview&#x60; (optional)
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
    public okhttp3.Call listAddonReviewsCall(Long addonId, Set<String> with, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/addons/{addon_id}/reviews"
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
    private okhttp3.Call listAddonReviewsValidateBeforeCall(Long addonId, Set<String> with, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling listAddonReviews(Async)");
        }
        

        okhttp3.Call localVarCall = listAddonReviewsCall(addonId, with, _callback);
        return localVarCall;

    }

    /**
     * Fetch all the reviews of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonReview&#x60; (optional)
     * @return AddonReviewListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public AddonReviewListResponse listAddonReviews(Long addonId, Set<String> with) throws ApiException {
        ApiResponse<AddonReviewListResponse> localVarResp = listAddonReviewsWithHttpInfo(addonId, with);
        return localVarResp.getData();
    }

    /**
     * Fetch all the reviews of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonReview&#x60; (optional)
     * @return ApiResponse&lt;AddonReviewListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<AddonReviewListResponse> listAddonReviewsWithHttpInfo(Long addonId, Set<String> with) throws ApiException {
        okhttp3.Call localVarCall = listAddonReviewsValidateBeforeCall(addonId, with, null);
        Type localVarReturnType = new TypeToken<AddonReviewListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch all the reviews of an addon (asynchronously)
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonReview&#x60; (optional)
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
    public okhttp3.Call listAddonReviewsAsync(Long addonId, Set<String> with, final ApiCallback<AddonReviewListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAddonReviewsValidateBeforeCall(addonId, with, _callback);
        Type localVarReturnType = new TypeToken<AddonReviewListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
