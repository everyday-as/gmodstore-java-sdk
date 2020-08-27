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
import no.everyday.gmodstore_sdk.model.Addon;
import no.everyday.gmodstore_sdk.model.AddonDownloadResponse;
import no.everyday.gmodstore_sdk.model.AddonVersionListResponse;
import no.everyday.gmodstore_sdk.model.AddonVersionReleaseType;
import no.everyday.gmodstore_sdk.model.AddonVersionResponse;
import no.everyday.gmodstore_sdk.model.ErrorResponse;
import java.io.File;
import org.threeten.bp.OffsetDateTime;
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
     * Create a new version for an addon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAddonVersionTest() throws ApiException {
        String name = null;
        String changelog = null;
        File file = null;
        AddonVersionReleaseType releaseType = null;
        Long addonId = null;
        List<String> with = null;
        AddonVersionResponse response = api.createAddonVersion(name, changelog, file, releaseType, addonId, with);

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
    public void downloadAddonVersionTest() throws ApiException {
        Long addonId = null;
        Long versionId = null;
        AddonDownloadResponse response = api.downloadAddonVersion(addonId, versionId);

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
    public void getAddonVersionTest() throws ApiException {
        Long addonId = null;
        Long versionId = null;
        List<String> with = null;
        AddonVersionResponse response = api.getAddonVersion(addonId, versionId, with);

        // TODO: test validations
    }
    /**
     * Fetch all the versions of an addon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAddonVersionsTest() throws ApiException {
        Long addonId = null;
        List<String> with = null;
        AddonVersionListResponse response = api.listAddonVersions(addonId, with);

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
    public void updateAddonVersionTest() throws ApiException {
        Integer id = null;
        String name = null;
        String changelog = null;
        String fileHash = null;
        Integer fileSize = null;
        AddonVersionReleaseType releaseType = null;
        OffsetDateTime createdAt = null;
        OffsetDateTime updatedAt = null;
        Addon addon = null;
        Long addonId = null;
        Long versionId = null;
        List<String> with = null;
        AddonVersionResponse response = api.updateAddonVersion(id, name, changelog, fileHash, fileSize, releaseType, createdAt, updatedAt, addon, addonId, versionId, with);

        // TODO: test validations
    }
}
