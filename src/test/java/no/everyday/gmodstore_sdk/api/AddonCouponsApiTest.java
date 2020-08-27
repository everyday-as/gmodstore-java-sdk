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
import no.everyday.gmodstore_sdk.model.AddonCouponListResponse;
import no.everyday.gmodstore_sdk.model.AddonCouponResponse;
import no.everyday.gmodstore_sdk.model.ErrorResponse;
import no.everyday.gmodstore_sdk.model.NewAddonCoupon;
import no.everyday.gmodstore_sdk.model.UpdateAddonCoupon;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddonCouponsApi
 */
@Ignore
public class AddonCouponsApiTest {

    private final AddonCouponsApi api = new AddonCouponsApi();

    /**
     * Create an addon coupon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAddonCouponTest() throws ApiException {
        NewAddonCoupon body = null;
        Long addonId = null;
        List<String> with = null;
        AddonCouponResponse response = api.createAddonCoupon(body, addonId, with);

        // TODO: test validations
    }
    /**
     * Destroy an addon&#x27;s coupon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAddonCouponTest() throws ApiException {
        Long addonId = null;
        Long couponId = null;
        api.deleteAddonCoupon(addonId, couponId);

        // TODO: test validations
    }
    /**
     * Fetch an addon&#x27;s coupon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddonCouponTest() throws ApiException {
        Long addonId = null;
        Long couponId = null;
        List<String> with = null;
        AddonCouponResponse response = api.getAddonCoupon(addonId, couponId, with);

        // TODO: test validations
    }
    /**
     * Fetch all the coupons for an addon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAddonCouponsTest() throws ApiException {
        Long addonId = null;
        List<String> with = null;
        AddonCouponListResponse response = api.listAddonCoupons(addonId, with);

        // TODO: test validations
    }
    /**
     * Update an addon&#x27;s coupon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAddonCouponTest() throws ApiException {
        UpdateAddonCoupon body = null;
        Long addonId = null;
        Long couponId = null;
        List<String> with = null;
        AddonCouponResponse response = api.updateAddonCoupon(body, addonId, couponId, with);

        // TODO: test validations
    }
}
