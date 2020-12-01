# gmodstore-sdk

GmodStore API
- API version: 1.1.0
  - Build date: 2020-12-01T10:58:27.251778Z[Etc/UTC]

Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.

  For more information, please visit [https://docs.gmodstore.com](https://docs.gmodstore.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>no.everyday</groupId>
  <artifactId>gmodstore-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "no.everyday:gmodstore-sdk:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/gmodstore-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import no.everyday.gmodstore_sdk.ApiClient;
import no.everyday.gmodstore_sdk.ApiException;
import no.everyday.gmodstore_sdk.Configuration;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.models.*;
import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gmodstore.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddonCouponsApi apiInstance = new AddonCouponsApi(defaultClient);
    Long addonId = 56L; // Long | Id of the addon
    AddonCoupon addonCoupon = new AddonCoupon(); // AddonCoupon | 
    Set<String> with = Arrays.asList(); // Set<String> | The relations you want to fetch with the `AddonCoupon`
    try {
      AddonCouponResponse result = apiInstance.createAddonCoupon(addonId, addonCoupon, with);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonCouponsApi#createAddonCoupon");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.gmodstore.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddonCouponsApi* | [**createAddonCoupon**](docs/AddonCouponsApi.md#createAddonCoupon) | **POST** /addons/{addon_id}/coupons | Create an addon coupon
*AddonCouponsApi* | [**deleteAddonCoupon**](docs/AddonCouponsApi.md#deleteAddonCoupon) | **DELETE** /addons/{addon_id}/coupons/{coupon_id} | Destroy an addon&#39;s coupon
*AddonCouponsApi* | [**getAddonCoupon**](docs/AddonCouponsApi.md#getAddonCoupon) | **GET** /addons/{addon_id}/coupons/{coupon_id} | Fetch an addon&#39;s coupon
*AddonCouponsApi* | [**listAddonCoupons**](docs/AddonCouponsApi.md#listAddonCoupons) | **GET** /addons/{addon_id}/coupons | Fetch all the coupons for an addon
*AddonCouponsApi* | [**updateAddonCoupon**](docs/AddonCouponsApi.md#updateAddonCoupon) | **PUT** /addons/{addon_id}/coupons/{coupon_id} | Update an addon&#39;s coupon
*AddonPurchasesApi* | [**createAddonPurchase**](docs/AddonPurchasesApi.md#createAddonPurchase) | **POST** /addons/{addon_id}/purchases | Create a purchase for an addon
*AddonPurchasesApi* | [**getAddonPurchase**](docs/AddonPurchasesApi.md#getAddonPurchase) | **GET** /addons/{addon_id}/purchases/{user_id} | Get a purchase of an addon by user
*AddonPurchasesApi* | [**listAddonPurchases**](docs/AddonPurchasesApi.md#listAddonPurchases) | **GET** /addons/{addon_id}/purchases | Fetch all purchases of an addon
*AddonPurchasesApi* | [**updateAddonPurchase**](docs/AddonPurchasesApi.md#updateAddonPurchase) | **PUT** /addons/{addon_id}/purchases/{user_id} | Update a purchase for an addon
*AddonReviewsApi* | [**getAddonReview**](docs/AddonReviewsApi.md#getAddonReview) | **GET** /addons/{addon_id}/reviews/{review_id} | Fetch a review of an addon
*AddonReviewsApi* | [**listAddonReviews**](docs/AddonReviewsApi.md#listAddonReviews) | **GET** /addons/{addon_id}/reviews | Fetch all the reviews of an addon
*AddonStatsApi* | [**getAddonStats**](docs/AddonStatsApi.md#getAddonStats) | **GET** /addons/{addon_id}/stats | Fetch all the stats for an addon
*AddonVersionsApi* | [**createAddonVersion**](docs/AddonVersionsApi.md#createAddonVersion) | **POST** /addons/{addon_id}/versions | Create a new version for an addon
*AddonVersionsApi* | [**downloadAddonVersion**](docs/AddonVersionsApi.md#downloadAddonVersion) | **GET** /addons/{addon_id}/versions/{version_id}/download | Generate a download token for a specific version of an addon
*AddonVersionsApi* | [**getAddonVersion**](docs/AddonVersionsApi.md#getAddonVersion) | **GET** /addons/{addon_id}/versions/{version_id} | Fetch a specific version of an addon
*AddonVersionsApi* | [**listAddonVersions**](docs/AddonVersionsApi.md#listAddonVersions) | **GET** /addons/{addon_id}/versions | Fetch all the versions of an addon
*AddonVersionsApi* | [**updateAddonVersion**](docs/AddonVersionsApi.md#updateAddonVersion) | **PUT** /addons/{addon_id}/versions/{version_id} | Update a version of an addon
*AddonsApi* | [**getAddon**](docs/AddonsApi.md#getAddon) | **GET** /addons/{addon_id} | Fetch a single addon
*AddonsApi* | [**listSelfAddons**](docs/AddonsApi.md#listSelfAddons) | **GET** /addons | Fetch all the addons that you have access to
*AdventCalendarApi* | [**getAdventCalendarStats**](docs/AdventCalendarApi.md#getAdventCalendarStats) | **GET** /events/advent-calendar/stats | Fetch statistics relating to the advent calendar event
*PermissionGroupsApi* | [**listPermissionGroups**](docs/PermissionGroupsApi.md#listPermissionGroups) | **GET** /permission-groups | Fetches all available permission groups
*TeamAddonsApi* | [**listTeamAddons**](docs/TeamAddonsApi.md#listTeamAddons) | **GET** /teams/{team_id}/addons | Fetch all the addons in the given team
*TeamUsersApi* | [**listTeamUsers**](docs/TeamUsersApi.md#listTeamUsers) | **GET** /teams/{team_id}/users | Fetch all the users in the given team
*TeamsApi* | [**getTeam**](docs/TeamsApi.md#getTeam) | **GET** /teams/{team_id} | Fetch a single team
*UserAddonsApi* | [**listUserAddons**](docs/UserAddonsApi.md#listUserAddons) | **GET** /users/{user_id}/addons | Fetch all the addons authored / co-authored by a user
*UserBadgesApi* | [**createUserBadge**](docs/UserBadgesApi.md#createUserBadge) | **POST** /users/{user_id}/badges | Give a user a badge
*UserBadgesApi* | [**deleteUserBadge**](docs/UserBadgesApi.md#deleteUserBadge) | **DELETE** /users/{user_id}/badges/{badge_id} | Destroy a users&#39;s badge
*UserBadgesApi* | [**listUserBadges**](docs/UserBadgesApi.md#listUserBadges) | **GET** /users/{user_id}/badges | Fetch all the badges a user has
*UserBansApi* | [**listUserBans**](docs/UserBansApi.md#listUserBans) | **GET** /users/{user_id}/bans | Fetch all active bans associated with this user
*UserPurchasesApi* | [**listUserPurchases**](docs/UserPurchasesApi.md#listUserPurchases) | **GET** /users/{user_id}/purchases | Fetch all purchases a user has made
*UserTeamsApi* | [**listUserTeams**](docs/UserTeamsApi.md#listUserTeams) | **GET** /users/{user_id}/teams | Fetch all the teams of a user
*UsersApi* | [**getSelfUser**](docs/UsersApi.md#getSelfUser) | **GET** /users/me | Fetches the current user (API Key Owner)
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /users/{user_id} | Fetch a single user


## Documentation for Models

 - [Addon](docs/Addon.md)
 - [AddonCoupon](docs/AddonCoupon.md)
 - [AddonCouponListResponse](docs/AddonCouponListResponse.md)
 - [AddonCouponResponse](docs/AddonCouponResponse.md)
 - [AddonDownload](docs/AddonDownload.md)
 - [AddonDownloadResponse](docs/AddonDownloadResponse.md)
 - [AddonImages](docs/AddonImages.md)
 - [AddonListResponse](docs/AddonListResponse.md)
 - [AddonPrice](docs/AddonPrice.md)
 - [AddonPurchase](docs/AddonPurchase.md)
 - [AddonPurchaseListResponse](docs/AddonPurchaseListResponse.md)
 - [AddonPurchaseResponse](docs/AddonPurchaseResponse.md)
 - [AddonResponse](docs/AddonResponse.md)
 - [AddonReview](docs/AddonReview.md)
 - [AddonReviewListResponse](docs/AddonReviewListResponse.md)
 - [AddonReviewResponse](docs/AddonReviewResponse.md)
 - [AddonStats](docs/AddonStats.md)
 - [AddonStatsListResponse](docs/AddonStatsListResponse.md)
 - [AddonStatsRevenue](docs/AddonStatsRevenue.md)
 - [AddonStatsRevenueCurrent](docs/AddonStatsRevenueCurrent.md)
 - [AddonStatsSales](docs/AddonStatsSales.md)
 - [AddonStatsSalesCurrent](docs/AddonStatsSalesCurrent.md)
 - [AddonStatsViews](docs/AddonStatsViews.md)
 - [AddonStatsViewsCurrent](docs/AddonStatsViewsCurrent.md)
 - [AddonVersion](docs/AddonVersion.md)
 - [AddonVersionListResponse](docs/AddonVersionListResponse.md)
 - [AddonVersionReleaseType](docs/AddonVersionReleaseType.md)
 - [AddonVersionResponse](docs/AddonVersionResponse.md)
 - [AdventCalendarStats](docs/AdventCalendarStats.md)
 - [AdventCalendarStatsResponse](docs/AdventCalendarStatsResponse.md)
 - [BadgeListResponse](docs/BadgeListResponse.md)
 - [BadgeResponse](docs/BadgeResponse.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Money](docs/Money.md)
 - [NewAddonPurchase](docs/NewAddonPurchase.md)
 - [NewAddonVersion](docs/NewAddonVersion.md)
 - [OrderItem](docs/OrderItem.md)
 - [PermissionGroup](docs/PermissionGroup.md)
 - [PermissionGroupListResponse](docs/PermissionGroupListResponse.md)
 - [Team](docs/Team.md)
 - [TeamListResponse](docs/TeamListResponse.md)
 - [TeamResponse](docs/TeamResponse.md)
 - [TeamUser](docs/TeamUser.md)
 - [TeamUserListResponse](docs/TeamUserListResponse.md)
 - [User](docs/User.md)
 - [UserBadge](docs/UserBadge.md)
 - [UserBadgeLegend](docs/UserBadgeLegend.md)
 - [UserBan](docs/UserBan.md)
 - [UserBanListResponse](docs/UserBanListResponse.md)
 - [UserResponse](docs/UserResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



