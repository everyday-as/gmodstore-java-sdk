/*
 * gmodstore
 * Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.  # Rate limits Every request you make to the GmodStore API will count against your rate limit, which at the time of writing this, is 60 requests / minute. An up-to-date value will always provided in the `X-RateLimit-Limit` header The number of requests you have remaining before you must wait is provided in the `X-RateLimit-Remaining` header.  # API SDKs For a list of available API SDKs check the README here: https://github.com/everyday-as/gmodstore-api-docs#client-libraries
 *
 * The version of the OpenAPI document: 3.0.0
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


import no.everyday.gmodstore_sdk.model.DeleteProductVersionResponse;
import no.everyday.gmodstore_sdk.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteProductVersion
     * @param product  (required)
     * @param version  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response containing the product version that was just deleted </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Improperly formatted request passed </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 401 </td><td> The passed bearer token is missing or invalid </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 403 </td><td> The passed bearer token does not have the right scopes </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductVersionCall(String product, String version, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v3/products/{product}/versions/{version}"
            .replaceAll("\\{" + "product" + "\\}", localVarApiClient.escapeString(product.toString()))
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

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

        String[] localVarAuthNames = new String[] { "PersonalAccessToken" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteProductVersionValidateBeforeCall(String product, String version, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'product' is set
        if (product == null) {
            throw new ApiException("Missing the required parameter 'product' when calling deleteProductVersion(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling deleteProductVersion(Async)");
        }
        

        okhttp3.Call localVarCall = deleteProductVersionCall(product, version, _callback);
        return localVarCall;

    }

    /**
     * Delete the specified version for a product
     * 
     * @param product  (required)
     * @param version  (required)
     * @return DeleteProductVersionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response containing the product version that was just deleted </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Improperly formatted request passed </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 401 </td><td> The passed bearer token is missing or invalid </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 403 </td><td> The passed bearer token does not have the right scopes </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
     */
    public DeleteProductVersionResponse deleteProductVersion(String product, String version) throws ApiException {
        ApiResponse<DeleteProductVersionResponse> localVarResp = deleteProductVersionWithHttpInfo(product, version);
        return localVarResp.getData();
    }

    /**
     * Delete the specified version for a product
     * 
     * @param product  (required)
     * @param version  (required)
     * @return ApiResponse&lt;DeleteProductVersionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response containing the product version that was just deleted </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Improperly formatted request passed </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 401 </td><td> The passed bearer token is missing or invalid </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 403 </td><td> The passed bearer token does not have the right scopes </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<DeleteProductVersionResponse> deleteProductVersionWithHttpInfo(String product, String version) throws ApiException {
        okhttp3.Call localVarCall = deleteProductVersionValidateBeforeCall(product, version, null);
        Type localVarReturnType = new TypeToken<DeleteProductVersionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete the specified version for a product (asynchronously)
     * 
     * @param product  (required)
     * @param version  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response containing the product version that was just deleted </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Improperly formatted request passed </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 401 </td><td> The passed bearer token is missing or invalid </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 403 </td><td> The passed bearer token does not have the right scopes </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> The requested resource does not exist </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProductVersionAsync(String product, String version, final ApiCallback<DeleteProductVersionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteProductVersionValidateBeforeCall(product, version, _callback);
        Type localVarReturnType = new TypeToken<DeleteProductVersionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
