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

import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.model.Error;
import no.everyday.gmodstore_sdk.model.InlineResponse2004;
import no.everyday.gmodstore_sdk.model.InlineResponse2011;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddonPurchasesApi
 */
@Ignore
public class AddonPurchasesApiTest {

    private final AddonPurchasesApi api = new AddonPurchasesApi();

    /**
     * Fetch all purchases of an addon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonsAddonIdPurchasesGetTest() throws ApiException {
        Long addonId = null;
        List<String> with = null;
        InlineResponse2004 response = api.addonsAddonIdPurchasesGet(addonId, with);

        // TODO: test validations
    }
    /**
     * Create a purchase for an addon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonsAddonIdPurchasesPostTest() throws ApiException {
        Object body = null;
        Long addonId = null;
        List<String> with = null;
        InlineResponse2011 response = api.addonsAddonIdPurchasesPost(body, addonId, with);

        // TODO: test validations
    }
    /**
     * Get a purchase of an addon by user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonsAddonIdPurchasesUserIdGetTest() throws ApiException {
        Long addonId = null;
        String userId = null;
        List<String> with = null;
        InlineResponse2011 response = api.addonsAddonIdPurchasesUserIdGet(addonId, userId, with);

        // TODO: test validations
    }
    /**
     * Update a purchase for an addon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonsAddonIdPurchasesUserIdPutTest() throws ApiException {
        Object body = null;
        Long addonId = null;
        String userId = null;
        List<String> with = null;
        InlineResponse2011 response = api.addonsAddonIdPurchasesUserIdPut(body, addonId, userId, with);

        // TODO: test validations
    }
}
