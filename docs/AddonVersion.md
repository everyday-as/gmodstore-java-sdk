# AddonVersion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**name** | **String** |  | 
**changelog** | **String** |  | 
**fileHash** | **String** |  | 
**fileSize** | **Integer** |  | 
**releaseType** | [**ReleaseTypeEnum**](#ReleaseTypeEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**addon** | [**Addon**](Addon.md) |  |  [optional]

<a name="ReleaseTypeEnum"></a>
## Enum: ReleaseTypeEnum
Name | Value
---- | -----
STABLE | &quot;stable&quot;
BETA | &quot;beta&quot;
ALPHA | &quot;alpha&quot;
PRIVATE | &quot;private&quot;
