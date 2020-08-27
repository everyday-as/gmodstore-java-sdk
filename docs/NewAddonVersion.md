# NewAddonVersion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**changelog** | **String** | You can pass in markdown here  | 
**file** | [**File**](File.md) |  | 
**releaseType** | [**ReleaseTypeEnum**](#ReleaseTypeEnum) | This can be a value of stable, beta, alpha, private or demo  |  [optional]

<a name="ReleaseTypeEnum"></a>
## Enum: ReleaseTypeEnum
Name | Value
---- | -----
STABLE | &quot;stable&quot;
BETA | &quot;beta&quot;
ALPHA | &quot;alpha&quot;
PRIVATE | &quot;private&quot;
DEMO | &quot;demo&quot;