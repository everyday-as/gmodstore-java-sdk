

# UserBan


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  | 
**userId** | **UUID** |  | 
**reason** | **String** |  |  [optional]
**bannerId** | **UUID** |  |  [optional]
**unbanId** | **UUID** |  |  [optional]
**unbanReason** | **String** |  |  [optional]
**properties** | [**Set&lt;PropertiesEnum&gt;**](#Set&lt;PropertiesEnum&gt;) |  | 
**start** | **OffsetDateTime** |  | 
**end** | **OffsetDateTime** |  | 



## Enum: Set&lt;PropertiesEnum&gt;

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
FORUM_POST | &quot;forum.post&quot;
BAN_APPEAL | &quot;ban.appeal&quot;



