# SaloonDataApi

All URIs are relative to *http://saloon.deseco.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saloonDataAddSaloonRating**](SaloonDataApi.md#saloonDataAddSaloonRating) | **POST** /api/saloonData/SaloonRating | 
[**saloonDataGetSaloon**](SaloonDataApi.md#saloonDataGetSaloon) | **POST** /api/saloonData/GetSaloon | 


<a name="saloonDataAddSaloonRating"></a>
# **saloonDataAddSaloonRating**
> Object saloonDataAddSaloonRating(model)



### Example
```java
// Import classes:
//import io.swagger.client.api.SaloonDataApi;

SaloonDataApi apiInstance = new SaloonDataApi();
SaloonRatingRequest model = new SaloonRatingRequest(); // SaloonRatingRequest | 
try {
    Object result = apiInstance.saloonDataAddSaloonRating(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaloonDataApi#saloonDataAddSaloonRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**SaloonRatingRequest**](SaloonRatingRequest.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="saloonDataGetSaloon"></a>
# **saloonDataGetSaloon**
> Object saloonDataGetSaloon(model)



### Example
```java
// Import classes:
//import io.swagger.client.api.SaloonDataApi;

SaloonDataApi apiInstance = new SaloonDataApi();
SaloonSearchRequest model = new SaloonSearchRequest(); // SaloonSearchRequest | 
try {
    Object result = apiInstance.saloonDataGetSaloon(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaloonDataApi#saloonDataGetSaloon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**SaloonSearchRequest**](SaloonSearchRequest.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

