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

import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.model.AddonListResponse;
import no.everyday.gmodstore_sdk.model.ErrorResponse;
import java.util.Set;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiKeyApi
 */
@Ignore
public class ApiKeyApiTest {

    private final ApiKeyApi api = new ApiKeyApi();

    
    /**
     * Get meta information about the current API key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentApiKeyTest() throws ApiException {
        Set<String> with = null;
        AddonListResponse response = api.getCurrentApiKey(with);

        // TODO: test validations
    }
    
}
