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
import java.io.File;
import no.everyday.gmodstore_sdk.model.InlineResponse2007;
import no.everyday.gmodstore_sdk.model.InlineResponse2008;
import no.everyday.gmodstore_sdk.model.InlineResponse2012;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddonVersionsApi
 */
@Ignore
public class AddonVersionsApiTest {

    private final AddonVersionsApi api = new AddonVersionsApi();

    /**
     * Fetch all the versions of an addon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonsAddonIdVersionsGetTest() throws ApiException {
        Long addonId = null;
        List<String> with = null;
        InlineResponse2007 response = api.addonsAddonIdVersionsGet(addonId, with);

        // TODO: test validations
    }
    /**
     * Create a new version for an addon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonsAddonIdVersionsPostTest() throws ApiException {
        String name = null;
        String changelog = null;
        File file = null;
        String releaseType = null;
        Long addonId = null;
        List<String> with = null;
        InlineResponse2012 response = api.addonsAddonIdVersionsPost(name, changelog, file, releaseType, addonId, with);

        // TODO: test validations
    }
    /**
     * Generate a download token for a specific version of an addon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonsAddonIdVersionsVersionIdDownloadGetTest() throws ApiException {
        Long addonId = null;
        Long versionId = null;
        InlineResponse2008 response = api.addonsAddonIdVersionsVersionIdDownloadGet(addonId, versionId);

        // TODO: test validations
    }
    /**
     * Fetch a specific version of an addon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonsAddonIdVersionsVersionIdGetTest() throws ApiException {
        Long addonId = null;
        Long versionId = null;
        List<String> with = null;
        InlineResponse2012 response = api.addonsAddonIdVersionsVersionIdGet(addonId, versionId, with);

        // TODO: test validations
    }
    /**
     * Update a version of an addon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonsAddonIdVersionsVersionIdPutTest() throws ApiException {
        String name = null;
        String changelog = null;
        String releaseType = null;
        Long addonId = null;
        Long versionId = null;
        List<String> with = null;
        InlineResponse2012 response = api.addonsAddonIdVersionsVersionIdPut(name, changelog, releaseType, addonId, versionId, with);

        // TODO: test validations
    }
}
