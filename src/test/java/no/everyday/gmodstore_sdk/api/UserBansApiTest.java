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
import no.everyday.gmodstore_sdk.model.BanListResponse;
import no.everyday.gmodstore_sdk.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserBansApi
 */
@Ignore
public class UserBansApiTest {

    private final UserBansApi api = new UserBansApi();

    /**
     * Fetch all active bans associated with this user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUserBansTest() throws ApiException {
        String userId = null;
        BanListResponse response = api.listUserBans(userId);

        // TODO: test validations
    }
}
