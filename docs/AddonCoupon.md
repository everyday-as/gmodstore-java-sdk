

# AddonCoupon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [readonly]
**code** | **String** |  | 
**percent** | **BigDecimal** |  | 
**maxUses** | **Integer** |  | 
**expiresAt** | **OffsetDateTime** | A future date less than 2 weeks from today | 
**boundUserId** | **Long** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly]
**addon** | [**Addon**](Addon.md) |  |  [optional]
**boundUser** | [**User**](User.md) |  |  [optional]



