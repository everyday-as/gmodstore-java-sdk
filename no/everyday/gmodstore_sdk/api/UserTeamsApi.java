/*
 * GmodStore
 * Welcome to the Gmodstore API! You can use our API to access Gmodstore API endpoints, which can be used interact with Gmodstore programmatically.
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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
import no.everyday.gmodstore_sdk.model.TeamListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTeamsApi {
    private ApiClient apiClient;

    public UserTeamsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserTeamsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listUserTeams
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;Team&#x60; (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listUserTeamsCall(Long userId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/users/{user_id}/teams"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (with != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "with", with));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listUserTeamsValidateBeforeCall(Long userId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling listUserTeams(Async)");
        }
        
        com.squareup.okhttp.Call call = listUserTeamsCall(userId, with, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Fetch all the teams of a user
     * 
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;Team&#x60; (optional)
     * @return TeamListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TeamListResponse listUserTeams(Long userId, List<String> with) throws ApiException {
        ApiResponse<TeamListResponse> resp = listUserTeamsWithHttpInfo(userId, with);
        return resp.getData();
    }

    /**
     * Fetch all the teams of a user
     * 
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;Team&#x60; (optional)
     * @return ApiResponse&lt;TeamListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TeamListResponse> listUserTeamsWithHttpInfo(Long userId, List<String> with) throws ApiException {
        com.squareup.okhttp.Call call = listUserTeamsValidateBeforeCall(userId, with, null, null);
        Type localVarReturnType = new TypeToken<TeamListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch all the teams of a user (asynchronously)
     * 
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;Team&#x60; (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listUserTeamsAsync(Long userId, List<String> with, final ApiCallback<TeamListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listUserTeamsValidateBeforeCall(userId, with, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TeamListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
