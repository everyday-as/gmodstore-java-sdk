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


import no.everyday.gmodstore_sdk.model.Error;
import no.everyday.gmodstore_sdk.model.InlineResponse2004;
import no.everyday.gmodstore_sdk.model.InlineResponse2005;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddonReviewsApi {
    private ApiClient apiClient;

    public AddonReviewsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AddonReviewsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addonsAddonIdReviewsGet
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the AddonReview schema (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addonsAddonIdReviewsGetCall(Long addonId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/addons/{addon_id}/reviews"
            .replaceAll("\\{" + "addon_id" + "\\}", apiClient.escapeString(addonId.toString()));

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addonsAddonIdReviewsGetValidateBeforeCall(Long addonId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling addonsAddonIdReviewsGet(Async)");
        }
        
        com.squareup.okhttp.Call call = addonsAddonIdReviewsGetCall(addonId, with, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Fetch all the reviews of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the AddonReview schema (optional)
     * @return InlineResponse2004
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2004 addonsAddonIdReviewsGet(Long addonId, List<String> with) throws ApiException {
        ApiResponse<InlineResponse2004> resp = addonsAddonIdReviewsGetWithHttpInfo(addonId, with);
        return resp.getData();
    }

    /**
     * Fetch all the reviews of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the AddonReview schema (optional)
     * @return ApiResponse&lt;InlineResponse2004&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2004> addonsAddonIdReviewsGetWithHttpInfo(Long addonId, List<String> with) throws ApiException {
        com.squareup.okhttp.Call call = addonsAddonIdReviewsGetValidateBeforeCall(addonId, with, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch all the reviews of an addon (asynchronously)
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the AddonReview schema (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addonsAddonIdReviewsGetAsync(Long addonId, List<String> with, final ApiCallback<InlineResponse2004> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addonsAddonIdReviewsGetValidateBeforeCall(addonId, with, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addonsAddonIdReviewsReviewIdGet
     * @param addonId Id of the addon (required)
     * @param reviewId Id of the review (required)
     * @param with The relations you want to fetch with the AddonReview schema (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addonsAddonIdReviewsReviewIdGetCall(Long addonId, Long reviewId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/addons/{addon_id}/reviews/{review_id}"
            .replaceAll("\\{" + "addon_id" + "\\}", apiClient.escapeString(addonId.toString()))
            .replaceAll("\\{" + "review_id" + "\\}", apiClient.escapeString(reviewId.toString()));

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addonsAddonIdReviewsReviewIdGetValidateBeforeCall(Long addonId, Long reviewId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling addonsAddonIdReviewsReviewIdGet(Async)");
        }
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new ApiException("Missing the required parameter 'reviewId' when calling addonsAddonIdReviewsReviewIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = addonsAddonIdReviewsReviewIdGetCall(addonId, reviewId, with, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Fetch a review of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param reviewId Id of the review (required)
     * @param with The relations you want to fetch with the AddonReview schema (optional)
     * @return InlineResponse2005
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2005 addonsAddonIdReviewsReviewIdGet(Long addonId, Long reviewId, List<String> with) throws ApiException {
        ApiResponse<InlineResponse2005> resp = addonsAddonIdReviewsReviewIdGetWithHttpInfo(addonId, reviewId, with);
        return resp.getData();
    }

    /**
     * Fetch a review of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param reviewId Id of the review (required)
     * @param with The relations you want to fetch with the AddonReview schema (optional)
     * @return ApiResponse&lt;InlineResponse2005&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2005> addonsAddonIdReviewsReviewIdGetWithHttpInfo(Long addonId, Long reviewId, List<String> with) throws ApiException {
        com.squareup.okhttp.Call call = addonsAddonIdReviewsReviewIdGetValidateBeforeCall(addonId, reviewId, with, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2005>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch a review of an addon (asynchronously)
     * 
     * @param addonId Id of the addon (required)
     * @param reviewId Id of the review (required)
     * @param with The relations you want to fetch with the AddonReview schema (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addonsAddonIdReviewsReviewIdGetAsync(Long addonId, Long reviewId, List<String> with, final ApiCallback<InlineResponse2005> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addonsAddonIdReviewsReviewIdGetValidateBeforeCall(addonId, reviewId, with, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2005>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
