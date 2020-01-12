# gmodstore-sdk

GmodStore
- API version: 1.0.1
  - Build date: 2020-01-12T21:49:39.344069Z[Etc/UTC]

Welcome to the Gmodstore API! You can use our API to access Gmodstore API endpoints, which can be used interact with Gmodstore programmatically.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


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
import no.everyday.gmodstore_sdk.*;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.model.*;
import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

import java.io.File;
import java.util.*;

public class AddonCouponsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AddonCouponsApi apiInstance = new AddonCouponsApi();
        Long addonId = 789L; // Long | Id of the addon
        Long couponId = 789L; // Long | Id of the coupon
        try {
            apiInstance.addonsAddonIdCouponsCouponIdDelete(addonId, couponId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddonCouponsApi#addonsAddonIdCouponsCouponIdDelete");
            e.printStackTrace();
        }
    }
}
import no.everyday.gmodstore_sdk.*;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.model.*;
import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

import java.io.File;
import java.util.*;

public class AddonCouponsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AddonCouponsApi apiInstance = new AddonCouponsApi();
        Long addonId = 789L; // Long | Id of the addon
        Long couponId = 789L; // Long | Id of the coupon
        List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonCoupon schema
        try {
            InlineResponse201 result = apiInstance.addonsAddonIdCouponsCouponIdGet(addonId, couponId, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddonCouponsApi#addonsAddonIdCouponsCouponIdGet");
            e.printStackTrace();
        }
    }
}
import no.everyday.gmodstore_sdk.*;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.model.*;
import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

import java.io.File;
import java.util.*;

public class AddonCouponsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AddonCouponsApi apiInstance = new AddonCouponsApi();
        Object body = null; // Object | 
        Long addonId = 789L; // Long | Id of the addon
        Long couponId = 789L; // Long | Id of the coupon
        List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonCoupon schema
        try {
            InlineResponse201 result = apiInstance.addonsAddonIdCouponsCouponIdPut(body, addonId, couponId, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddonCouponsApi#addonsAddonIdCouponsCouponIdPut");
            e.printStackTrace();
        }
    }
}
import no.everyday.gmodstore_sdk.*;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.model.*;
import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

import java.io.File;
import java.util.*;

public class AddonCouponsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AddonCouponsApi apiInstance = new AddonCouponsApi();
        Long addonId = 789L; // Long | Id of the addon
        List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonCoupon schema
        try {
            InlineResponse2003 result = apiInstance.addonsAddonIdCouponsGet(addonId, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddonCouponsApi#addonsAddonIdCouponsGet");
            e.printStackTrace();
        }
    }
}
import no.everyday.gmodstore_sdk.*;
import no.everyday.gmodstore_sdk.auth.*;
import no.everyday.gmodstore_sdk.model.*;
import no.everyday.gmodstore_sdk.api.AddonCouponsApi;

import java.io.File;
import java.util.*;

public class AddonCouponsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AddonCouponsApi apiInstance = new AddonCouponsApi();
        Object body = null; // Object | 
        Long addonId = 789L; // Long | Id of the addon
        List<String> with = Arrays.asList("with_example"); // List<String> | The relations you want to fetch with the AddonCoupon schema
        try {
            InlineResponse201 result = apiInstance.addonsAddonIdCouponsPost(body, addonId, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddonCouponsApi#addonsAddonIdCouponsPost");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.gmodstore.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddonCouponsApi* | [**addonsAddonIdCouponsCouponIdDelete**](docs/AddonCouponsApi.md#addonsAddonIdCouponsCouponIdDelete) | **DELETE** /addons/{addon_id}/coupons/{coupon_id} | Destroy an addon&#x27;s coupon
*AddonCouponsApi* | [**addonsAddonIdCouponsCouponIdGet**](docs/AddonCouponsApi.md#addonsAddonIdCouponsCouponIdGet) | **GET** /addons/{addon_id}/coupons/{coupon_id} | Fetch an addon&#x27;s coupon
*AddonCouponsApi* | [**addonsAddonIdCouponsCouponIdPut**](docs/AddonCouponsApi.md#addonsAddonIdCouponsCouponIdPut) | **PUT** /addons/{addon_id}/coupons/{coupon_id} | Update an addon&#x27;s coupon
*AddonCouponsApi* | [**addonsAddonIdCouponsGet**](docs/AddonCouponsApi.md#addonsAddonIdCouponsGet) | **GET** /addons/{addon_id}/coupons | Fetch all the coupons for an addon
*AddonCouponsApi* | [**addonsAddonIdCouponsPost**](docs/AddonCouponsApi.md#addonsAddonIdCouponsPost) | **POST** /addons/{addon_id}/coupons | Create an addon coupon
*AddonPurchasesApi* | [**addonsAddonIdPurchasesGet**](docs/AddonPurchasesApi.md#addonsAddonIdPurchasesGet) | **GET** /addons/{addon_id}/purchases | Fetch all purchases of an addon
*AddonPurchasesApi* | [**addonsAddonIdPurchasesPost**](docs/AddonPurchasesApi.md#addonsAddonIdPurchasesPost) | **POST** /addons/{addon_id}/purchases | Create a purchase for an addon
*AddonPurchasesApi* | [**addonsAddonIdPurchasesUserIdGet**](docs/AddonPurchasesApi.md#addonsAddonIdPurchasesUserIdGet) | **GET** /addons/{addon_id}/purchases/{user_id} | Get a purchase of an addon by user
*AddonPurchasesApi* | [**addonsAddonIdPurchasesUserIdPut**](docs/AddonPurchasesApi.md#addonsAddonIdPurchasesUserIdPut) | **PUT** /addons/{addon_id}/purchases/{user_id} | Update a purchase for an addon
*AddonReviewsApi* | [**addonsAddonIdReviewsGet**](docs/AddonReviewsApi.md#addonsAddonIdReviewsGet) | **GET** /addons/{addon_id}/reviews | Fetch all the reviews of an addon
*AddonReviewsApi* | [**addonsAddonIdReviewsReviewIdGet**](docs/AddonReviewsApi.md#addonsAddonIdReviewsReviewIdGet) | **GET** /addons/{addon_id}/reviews/{review_id} | Fetch a review of an addon
*AddonStatsApi* | [**addonsAddonIdStatsGet**](docs/AddonStatsApi.md#addonsAddonIdStatsGet) | **GET** /addons/{addon_id}/stats | Fetch all the stats for an addon
*AddonVersionsApi* | [**addonsAddonIdVersionsGet**](docs/AddonVersionsApi.md#addonsAddonIdVersionsGet) | **GET** /addons/{addon_id}/versions | Fetch all the versions of an addon
*AddonVersionsApi* | [**addonsAddonIdVersionsPost**](docs/AddonVersionsApi.md#addonsAddonIdVersionsPost) | **POST** /addons/{addon_id}/versions | Create a new version for an addon
*AddonVersionsApi* | [**addonsAddonIdVersionsVersionIdDownloadGet**](docs/AddonVersionsApi.md#addonsAddonIdVersionsVersionIdDownloadGet) | **GET** /addons/{addon_id}/versions/{version_id}/download | Generate a download token for a specific version of an addon
*AddonVersionsApi* | [**addonsAddonIdVersionsVersionIdGet**](docs/AddonVersionsApi.md#addonsAddonIdVersionsVersionIdGet) | **GET** /addons/{addon_id}/versions/{version_id} | Fetch a specific version of an addon
*AddonVersionsApi* | [**addonsAddonIdVersionsVersionIdPut**](docs/AddonVersionsApi.md#addonsAddonIdVersionsVersionIdPut) | **PUT** /addons/{addon_id}/versions/{version_id} | Update a version of an addon
*AddonsApi* | [**addonsAddonIdGet**](docs/AddonsApi.md#addonsAddonIdGet) | **GET** /addons/{addon_id} | Fetch a single addon
*AddonsApi* | [**addonsGet**](docs/AddonsApi.md#addonsGet) | **GET** /addons | Fetch all the addons that you have access to
*TeamUsersApi* | [**teamsTeamIdUsersGet**](docs/TeamUsersApi.md#teamsTeamIdUsersGet) | **GET** /teams/{team_id}/users | Fetch all the users in the given team
*TeamsApi* | [**teamsTeamIdGet**](docs/TeamsApi.md#teamsTeamIdGet) | **GET** /teams/{team_id} | Fetch a single team
*UserAddonsApi* | [**usersUserIdAddonsGet**](docs/UserAddonsApi.md#usersUserIdAddonsGet) | **GET** /users/{user_id}/addons | Fetch all the addons authored / co-authored by a user
*UserBadgesApi* | [**usersUserIdBadgesBadgeIdDelete**](docs/UserBadgesApi.md#usersUserIdBadgesBadgeIdDelete) | **DELETE** /users/{user_id}/badges/{badge_id} | Destroy a users&#x27;s badge
*UserBadgesApi* | [**usersUserIdBadgesGet**](docs/UserBadgesApi.md#usersUserIdBadgesGet) | **GET** /users/{user_id}/badges | Fetch all the badges a user has
*UserBadgesApi* | [**usersUserIdBadgesPost**](docs/UserBadgesApi.md#usersUserIdBadgesPost) | **POST** /users/{user_id}/badges | Give a user a badge
*UserBansApi* | [**usersUserIdBansGet**](docs/UserBansApi.md#usersUserIdBansGet) | **GET** /users/{user_id}/bans | Fetch all active bans associated with this user
*UserPurchasesApi* | [**usersUserIdPurchasesGet**](docs/UserPurchasesApi.md#usersUserIdPurchasesGet) | **GET** /users/{user_id}/purchases | Fetch all purchases a user has made
*UserTeamsApi* | [**usersUserIdTeamsGet**](docs/UserTeamsApi.md#usersUserIdTeamsGet) | **GET** /users/{user_id}/teams | Fetch all the teams of a user
*UsersApi* | [**usersMeGet**](docs/UsersApi.md#usersMeGet) | **GET** /users/me | Fetches the current user (API Key Owner)
*UsersApi* | [**usersUserIdGet**](docs/UsersApi.md#usersUserIdGet) | **GET** /users/{user_id} | Fetch a single user

## Documentation for Models

 - [Addon](docs/Addon.md)
 - [AddonCoupon](docs/AddonCoupon.md)
 - [AddonDownload](docs/AddonDownload.md)
 - [AddonImages](docs/AddonImages.md)
 - [AddonPrice](docs/AddonPrice.md)
 - [AddonPurchase](docs/AddonPurchase.md)
 - [AddonReview](docs/AddonReview.md)
 - [AddonStats](docs/AddonStats.md)
 - [AddonStatsRevenue](docs/AddonStatsRevenue.md)
 - [AddonStatsRevenueCurrent](docs/AddonStatsRevenueCurrent.md)
 - [AddonStatsSales](docs/AddonStatsSales.md)
 - [AddonStatsSalesCurrent](docs/AddonStatsSalesCurrent.md)
 - [AddonStatsViews](docs/AddonStatsViews.md)
 - [AddonStatsViewsCurrent](docs/AddonStatsViewsCurrent.md)
 - [AddonVersion](docs/AddonVersion.md)
 - [Ban](docs/Ban.md)
 - [Error](docs/Error.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse20013](docs/InlineResponse20013.md)
 - [InlineResponse20014](docs/InlineResponse20014.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InlineResponse2011](docs/InlineResponse2011.md)
 - [InlineResponse2012](docs/InlineResponse2012.md)
 - [InlineResponse2013](docs/InlineResponse2013.md)
 - [InlineResponseDefault](docs/InlineResponseDefault.md)
 - [Money](docs/Money.md)
 - [OrderItem](docs/OrderItem.md)
 - [PermissionGroup](docs/PermissionGroup.md)
 - [Team](docs/Team.md)
 - [TeamUser](docs/TeamUser.md)
 - [User](docs/User.md)
 - [UserBadgeLegend](docs/UserBadgeLegend.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


