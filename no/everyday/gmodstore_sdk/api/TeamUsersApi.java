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


import no.everyday.gmodstore_sdk.model.ErrorResponse;
import java.util.Set;
import no.everyday.gmodstore_sdk.model.TeamUserListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamUsersApi {
    private ApiClient localVarApiClient;

    public TeamUsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TeamUsersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for listTeamUsers
     * @param teamId Id of the team (required)
     * @param with The relations you want to fetch with the &#x60;TeamUser&#x60; (optional)
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
    public okhttp3.Call listTeamUsersCall(Long teamId, Set<String> with, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/teams/{team_id}/users"
            .replaceAll("\\{" + "team_id" + "\\}", localVarApiClient.escapeString(teamId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (with != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "with", with));
        }

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
    private okhttp3.Call listTeamUsersValidateBeforeCall(Long teamId, Set<String> with, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new ApiException("Missing the required parameter 'teamId' when calling listTeamUsers(Async)");
        }
        

        okhttp3.Call localVarCall = listTeamUsersCall(teamId, with, _callback);
        return localVarCall;

    }

    /**
     * Fetch all the users in the given team
     * 
     * @param teamId Id of the team (required)
     * @param with The relations you want to fetch with the &#x60;TeamUser&#x60; (optional)
     * @return TeamUserListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public TeamUserListResponse listTeamUsers(Long teamId, Set<String> with) throws ApiException {
        ApiResponse<TeamUserListResponse> localVarResp = listTeamUsersWithHttpInfo(teamId, with);
        return localVarResp.getData();
    }

    /**
     * Fetch all the users in the given team
     * 
     * @param teamId Id of the team (required)
     * @param with The relations you want to fetch with the &#x60;TeamUser&#x60; (optional)
     * @return ApiResponse&lt;TeamUserListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the request. </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset - The UNIX timestamp at which your rate limit quota will reset. <br>  </td></tr>
        <tr><td> 0 </td><td> Something went wrong </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<TeamUserListResponse> listTeamUsersWithHttpInfo(Long teamId, Set<String> with) throws ApiException {
        okhttp3.Call localVarCall = listTeamUsersValidateBeforeCall(teamId, with, null);
        Type localVarReturnType = new TypeToken<TeamUserListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch all the users in the given team (asynchronously)
     * 
     * @param teamId Id of the team (required)
     * @param with The relations you want to fetch with the &#x60;TeamUser&#x60; (optional)
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
    public okhttp3.Call listTeamUsersAsync(Long teamId, Set<String> with, final ApiCallback<TeamUserListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listTeamUsersValidateBeforeCall(teamId, with, _callback);
        Type localVarReturnType = new TypeToken<TeamUserListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
