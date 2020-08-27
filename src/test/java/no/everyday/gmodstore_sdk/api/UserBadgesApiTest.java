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
import no.everyday.gmodstore_sdk.model.BadgeCreateBody;
import no.everyday.gmodstore_sdk.model.Error;
import no.everyday.gmodstore_sdk.model.InlineResponse20014;
import no.everyday.gmodstore_sdk.model.InlineResponse2013;
import no.everyday.gmodstore_sdk.model.InlineResponseDefault;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserBadgesApi
 */
@Ignore
public class UserBadgesApiTest {

    private final UserBadgesApi api = new UserBadgesApi();

    /**
     * Give a user a badge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserBadgeTest() throws ApiException {
        BadgeCreateBody body = null;
        String userId = null;
        InlineResponse2013 response = api.createUserBadge(body, userId);

        // TODO: test validations
    }
    /**
     * Destroy a users&#x27;s badge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserBadgeTest() throws ApiException {
        String userId = null;
        Long badgeId = null;
        api.deleteUserBadge(userId, badgeId);

        // TODO: test validations
    }
    /**
     * Fetch all the badges a user has
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUserBadgesTest() throws ApiException {
        String userId = null;
        InlineResponse20014 response = api.listUserBadges(userId);

        // TODO: test validations
    }
}
