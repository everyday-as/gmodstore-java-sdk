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


package no.everyday.gmodstore_sdk.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for NewProductCouponPayload
 */
public class NewProductCouponPayloadTest {
    private final NewProductCouponPayload model = new NewProductCouponPayload();

    /**
     * Model tests for NewProductCouponPayload
     */
    @Test
    public void testNewProductCouponPayload() {
        // TODO: test NewProductCouponPayload
    }

    /**
     * Test the property 'percent'
     */
    @Test
    public void percentTest() {
        // TODO: test percent
    }

    /**
     * Test the property 'code'
     */
    @Test
    public void codeTest() {
        // TODO: test code
    }

    /**
     * Test the property 'maxUses'
     */
    @Test
    public void maxUsesTest() {
        // TODO: test maxUses
    }

    /**
     * Test the property 'expiresAt'
     */
    @Test
    public void expiresAtTest() {
        // TODO: test expiresAt
    }

    /**
     * Test the property 'boundUserId'
     */
    @Test
    public void boundUserIdTest() {
        // TODO: test boundUserId
    }

}
