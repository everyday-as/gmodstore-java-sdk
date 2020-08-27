

# User

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**avatar** | [**URI**](URI.md) |  |  [optional]
**countryCode** | **String** |  |  [optional]
**slug** | **String** |  |  [optional]
**reputation** | **Long** |  |  [optional]
**teamReputation** | **Long** |  |  [optional]
**banProperties** | [**Set&lt;BanPropertiesEnum&gt;**](#Set&lt;BanPropertiesEnum&gt;) |  |  [optional]
**group** | [**PermissionGroup**](PermissionGroup.md) |  |  [optional]



## Enum: Set&lt;BanPropertiesEnum&gt;

Name | Value
---- | -----
EVERYTHING | &quot;everything&quot;
ADDON_CREATE | &quot;addon.create&quot;
ADDON_PURCHASE | &quot;addon.purchase&quot;
ADDON_DOWNLOAD | &quot;addon.download&quot;
ADDON_REVIEW | &quot;addon.review&quot;
ADDON_COMMENT | &quot;addon.comment&quot;
JOB_CREATE | &quot;job.create&quot;
JOB_APPLY | &quot;job.apply&quot;
JOB_REVIEW | &quot;job.review&quot;
JOB_COMMENT | &quot;job.comment&quot;
BAN_APPEAL | &quot;ban.appeal&quot;



