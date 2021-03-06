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
import no.everyday.gmodstore_sdk.model.ErrorResponse;
import no.everyday.gmodstore_sdk.model.UserResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * Fetches the current user (API Key Owner)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfUserTest() throws ApiException {
        List<String> with = null;
        UserResponse response = api.getSelfUser(with);

        // TODO: test validations
    }
    /**
     * Fetch a single user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        Long userId = null;
        List<String> with = null;
        UserResponse response = api.getUser(userId, with);

        // TODO: test validations
    }
}
