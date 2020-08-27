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
import no.everyday.gmodstore_sdk.model.AddonPurchaseListResponse;
import no.everyday.gmodstore_sdk.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserPurchasesApi
 */
@Ignore
public class UserPurchasesApiTest {

    private final UserPurchasesApi api = new UserPurchasesApi();

    /**
     * Fetch all purchases a user has made
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUserPurchasesTest() throws ApiException {
        String userId = null;
        List<String> with = null;
        AddonPurchaseListResponse response = api.listUserPurchases(userId, with);

        // TODO: test validations
    }
}
