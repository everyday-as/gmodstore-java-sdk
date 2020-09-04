/*
 * GmodStore API
 * Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.
 *
 * The version of the OpenAPI document: 1.1.0
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


import no.everyday.gmodstore_sdk.model.BadgeListResponse;
import no.everyday.gmodstore_sdk.model.BadgeResponse;
import no.everyday.gmodstore_sdk.model.ErrorResponse;
import no.everyday.gmodstore_sdk.model.UserBadge;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserBadgesApi {
    private ApiClient localVarApiClient;

    public UserBadgesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserBadgesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createUserBadge
     * @param userId Id of the user (required)
     * @param userBadge  (required)
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
    public okhttp3.Call createUserBadgeCall(Long userId, UserBadge userBadge, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = userBadge;

        // create path and map variables
        String localVarPath = "/users/{user_id}/badges"
            .replaceAll("\\{" + "user_id" + "\\}", localVarApiClient.escapeString(userId.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createUserBadgeValidateBeforeCall(Long userId, UserBadge userBadge, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling createUserBadge(Async)");
        }
        
        // verify the required parameter 'userBadge' is set
        if (userBadge == null) {
            throw new ApiException("Missing the required parameter 'userBadge' when calling createUserBadge(Async)");
        }
        

        okhttp3.Call localVarCall = createUserBadgeCall(userId, userBadge, _callback);
        return localVarCall;

    }

    /**
     * Give a user a badge
     * 
     * @param userId Id of the user (required)
     * @param userBadge  (required)
     * @return BadgeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public BadgeResponse createUserBadge(Long userId, UserBadge userBadge) throws ApiException {
        ApiResponse<BadgeResponse> localVarResp = createUserBadgeWithHttpInfo(userId, userBadge);
        return localVarResp.getData();
    }

    /**
     * Give a user a badge
     * 
     * @param userId Id of the user (required)
     * @param userBadge  (required)
     * @return ApiResponse&lt;BadgeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<BadgeResponse> createUserBadgeWithHttpInfo(Long userId, UserBadge userBadge) throws ApiException {
        okhttp3.Call localVarCall = createUserBadgeValidateBeforeCall(userId, userBadge, null);
        Type localVarReturnType = new TypeToken<BadgeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Give a user a badge (asynchronously)
     * 
     * @param userId Id of the user (required)
     * @param userBadge  (required)
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
    public okhttp3.Call createUserBadgeAsync(Long userId, UserBadge userBadge, final ApiCallback<BadgeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createUserBadgeValidateBeforeCall(userId, userBadge, _callback);
        Type localVarReturnType = new TypeToken<BadgeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteUserBadge
     * @param userId Id of the user (required)
     * @param badgeId Id of the badge (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserBadgeCall(Long userId, Integer badgeId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_id}/badges/{badge_id}"
            .replaceAll("\\{" + "user_id" + "\\}", localVarApiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "badge_id" + "\\}", localVarApiClient.escapeString(badgeId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteUserBadgeValidateBeforeCall(Long userId, Integer badgeId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling deleteUserBadge(Async)");
        }
        
        // verify the required parameter 'badgeId' is set
        if (badgeId == null) {
            throw new ApiException("Missing the required parameter 'badgeId' when calling deleteUserBadge(Async)");
        }
        

        okhttp3.Call localVarCall = deleteUserBadgeCall(userId, badgeId, _callback);
        return localVarCall;

    }

    /**
     * Destroy a users&#39;s badge
     * 
     * @param userId Id of the user (required)
     * @param badgeId Id of the badge (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public void deleteUserBadge(Long userId, Integer badgeId) throws ApiException {
        deleteUserBadgeWithHttpInfo(userId, badgeId);
    }

    /**
     * Destroy a users&#39;s badge
     * 
     * @param userId Id of the user (required)
     * @param badgeId Id of the badge (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteUserBadgeWithHttpInfo(Long userId, Integer badgeId) throws ApiException {
        okhttp3.Call localVarCall = deleteUserBadgeValidateBeforeCall(userId, badgeId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Destroy a users&#39;s badge (asynchronously)
     * 
     * @param userId Id of the user (required)
     * @param badgeId Id of the badge (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserBadgeAsync(Long userId, Integer badgeId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteUserBadgeValidateBeforeCall(userId, badgeId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for listUserBadges
     * @param userId Id of the user (required)
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
    public okhttp3.Call listUserBadgesCall(Long userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_id}/badges"
            .replaceAll("\\{" + "user_id" + "\\}", localVarApiClient.escapeString(userId.toString()));

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
    private okhttp3.Call listUserBadgesValidateBeforeCall(Long userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling listUserBadges(Async)");
        }
        

        okhttp3.Call localVarCall = listUserBadgesCall(userId, _callback);
        return localVarCall;

    }

    /**
     * Fetch all the badges a user has
     * 
     * @param userId Id of the user (required)
     * @return BadgeListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public BadgeListResponse listUserBadges(Long userId) throws ApiException {
        ApiResponse<BadgeListResponse> localVarResp = listUserBadgesWithHttpInfo(userId);
        return localVarResp.getData();
    }

    /**
     * Fetch all the badges a user has
     * 
     * @param userId Id of the user (required)
     * @return ApiResponse&lt;BadgeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<BadgeListResponse> listUserBadgesWithHttpInfo(Long userId) throws ApiException {
        okhttp3.Call localVarCall = listUserBadgesValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<BadgeListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch all the badges a user has (asynchronously)
     * 
     * @param userId Id of the user (required)
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
    public okhttp3.Call listUserBadgesAsync(Long userId, final ApiCallback<BadgeListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listUserBadgesValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<BadgeListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
