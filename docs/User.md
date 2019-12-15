# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**name** | **String** |  | 
**avatar** | **String** |  | 
**countryCode** | **String** |  |  [optional]
**slug** | **String** |  | 
**banProperties** | [**List&lt;BanPropertiesEnum&gt;**](#List&lt;BanPropertiesEnum&gt;) |  | 
**group** | [**PermissionGroup**](PermissionGroup.md) |  |  [optional]

<a name="List<BanPropertiesEnum>"></a>
## Enum: List&lt;BanPropertiesEnum&gt;
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
