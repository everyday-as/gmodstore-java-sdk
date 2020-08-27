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


import no.everyday.gmodstore_sdk.model.AddonPurchase;
import no.everyday.gmodstore_sdk.model.AddonPurchaseListResponse;
import no.everyday.gmodstore_sdk.model.AddonPurchaseResponse;
import no.everyday.gmodstore_sdk.model.ErrorResponse;
import no.everyday.gmodstore_sdk.model.NewAddonPurchase;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddonPurchasesApi {
    private ApiClient apiClient;

    public AddonPurchasesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AddonPurchasesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createAddonPurchase
     * @param body  (required)
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAddonPurchaseCall(NewAddonPurchase body, Long addonId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/addons/{addon_id}/purchases"
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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createAddonPurchaseValidateBeforeCall(NewAddonPurchase body, Long addonId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createAddonPurchase(Async)");
        }
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling createAddonPurchase(Async)");
        }
        
        com.squareup.okhttp.Call call = createAddonPurchaseCall(body, addonId, with, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a purchase for an addon
     * 
     * @param body  (required)
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return AddonPurchaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddonPurchaseResponse createAddonPurchase(NewAddonPurchase body, Long addonId, List<String> with) throws ApiException {
        ApiResponse<AddonPurchaseResponse> resp = createAddonPurchaseWithHttpInfo(body, addonId, with);
        return resp.getData();
    }

    /**
     * Create a purchase for an addon
     * 
     * @param body  (required)
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return ApiResponse&lt;AddonPurchaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddonPurchaseResponse> createAddonPurchaseWithHttpInfo(NewAddonPurchase body, Long addonId, List<String> with) throws ApiException {
        com.squareup.okhttp.Call call = createAddonPurchaseValidateBeforeCall(body, addonId, with, null, null);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a purchase for an addon (asynchronously)
     * 
     * @param body  (required)
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAddonPurchaseAsync(NewAddonPurchase body, Long addonId, List<String> with, final ApiCallback<AddonPurchaseResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAddonPurchaseValidateBeforeCall(body, addonId, with, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAddonPurchase
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAddonPurchaseCall(Long addonId, Long userId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/addons/{addon_id}/purchases/{user_id}"
            .replaceAll("\\{" + "addon_id" + "\\}", apiClient.escapeString(addonId.toString()))
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
    private com.squareup.okhttp.Call getAddonPurchaseValidateBeforeCall(Long addonId, Long userId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling getAddonPurchase(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getAddonPurchase(Async)");
        }
        
        com.squareup.okhttp.Call call = getAddonPurchaseCall(addonId, userId, with, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a purchase of an addon by user
     * 
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return AddonPurchaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddonPurchaseResponse getAddonPurchase(Long addonId, Long userId, List<String> with) throws ApiException {
        ApiResponse<AddonPurchaseResponse> resp = getAddonPurchaseWithHttpInfo(addonId, userId, with);
        return resp.getData();
    }

    /**
     * Get a purchase of an addon by user
     * 
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return ApiResponse&lt;AddonPurchaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddonPurchaseResponse> getAddonPurchaseWithHttpInfo(Long addonId, Long userId, List<String> with) throws ApiException {
        com.squareup.okhttp.Call call = getAddonPurchaseValidateBeforeCall(addonId, userId, with, null, null);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a purchase of an addon by user (asynchronously)
     * 
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAddonPurchaseAsync(Long addonId, Long userId, List<String> with, final ApiCallback<AddonPurchaseResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAddonPurchaseValidateBeforeCall(addonId, userId, with, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listAddonPurchases
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listAddonPurchasesCall(Long addonId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/addons/{addon_id}/purchases"
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listAddonPurchasesValidateBeforeCall(Long addonId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling listAddonPurchases(Async)");
        }
        
        com.squareup.okhttp.Call call = listAddonPurchasesCall(addonId, with, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Fetch all purchases of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return AddonPurchaseListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddonPurchaseListResponse listAddonPurchases(Long addonId, List<String> with) throws ApiException {
        ApiResponse<AddonPurchaseListResponse> resp = listAddonPurchasesWithHttpInfo(addonId, with);
        return resp.getData();
    }

    /**
     * Fetch all purchases of an addon
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return ApiResponse&lt;AddonPurchaseListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddonPurchaseListResponse> listAddonPurchasesWithHttpInfo(Long addonId, List<String> with) throws ApiException {
        com.squareup.okhttp.Call call = listAddonPurchasesValidateBeforeCall(addonId, with, null, null);
        Type localVarReturnType = new TypeToken<AddonPurchaseListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch all purchases of an addon (asynchronously)
     * 
     * @param addonId Id of the addon (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAddonPurchasesAsync(Long addonId, List<String> with, final ApiCallback<AddonPurchaseListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAddonPurchasesValidateBeforeCall(addonId, with, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddonPurchaseListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateAddonPurchase
     * @param body  (required)
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateAddonPurchaseCall(AddonPurchase body, Long addonId, Long userId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/addons/{addon_id}/purchases/{user_id}"
            .replaceAll("\\{" + "addon_id" + "\\}", apiClient.escapeString(addonId.toString()))
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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateAddonPurchaseValidateBeforeCall(AddonPurchase body, Long addonId, Long userId, List<String> with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateAddonPurchase(Async)");
        }
        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling updateAddonPurchase(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateAddonPurchase(Async)");
        }
        
        com.squareup.okhttp.Call call = updateAddonPurchaseCall(body, addonId, userId, with, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a purchase for an addon
     * 
     * @param body  (required)
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return AddonPurchaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddonPurchaseResponse updateAddonPurchase(AddonPurchase body, Long addonId, Long userId, List<String> with) throws ApiException {
        ApiResponse<AddonPurchaseResponse> resp = updateAddonPurchaseWithHttpInfo(body, addonId, userId, with);
        return resp.getData();
    }

    /**
     * Update a purchase for an addon
     * 
     * @param body  (required)
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @return ApiResponse&lt;AddonPurchaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddonPurchaseResponse> updateAddonPurchaseWithHttpInfo(AddonPurchase body, Long addonId, Long userId, List<String> with) throws ApiException {
        com.squareup.okhttp.Call call = updateAddonPurchaseValidateBeforeCall(body, addonId, userId, with, null, null);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a purchase for an addon (asynchronously)
     * 
     * @param body  (required)
     * @param addonId Id of the addon (required)
     * @param userId Id of the user (required)
     * @param with The relations you want to fetch with the &#x60;AddonPurchase&#x60; (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAddonPurchaseAsync(AddonPurchase body, Long addonId, Long userId, List<String> with, final ApiCallback<AddonPurchaseResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateAddonPurchaseValidateBeforeCall(body, addonId, userId, with, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddonPurchaseResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
