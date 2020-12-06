

# AddonCoupon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [readonly]
**code** | **String** |  | 
**percent** | [**BigDecimal**](BigDecimal.md) |  | 
**maxUses** | **Integer** |  | 
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | A future date less than 2 weeks from today | 
**boundUserId** | **Long** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**addon** | [**Addon**](Addon.md) |  |  [optional]
**boundUser** | [**User**](User.md) |  |  [optional]



