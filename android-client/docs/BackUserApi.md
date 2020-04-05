# BackUserApi

All URIs are relative to *http://saloon.deseco.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backUserMyProfile**](BackUserApi.md#backUserMyProfile) | **POST** /api/backuser/myProfile | 
[**backUserMyService**](BackUserApi.md#backUserMyService) | **POST** /api/backuser/myServices | 


<a name="backUserMyProfile"></a>
# **backUserMyProfile**
> Object backUserMyProfile(model)



### Example
```java
// Import classes:
//import io.swagger.client.api.BackUserApi;

BackUserApi apiInstance = new BackUserApi();
SaloonProfile model = new SaloonProfile(); // SaloonProfile | 
try {
    Object result = apiInstance.backUserMyProfile(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackUserApi#backUserMyProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**SaloonProfile**](SaloonProfile.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="backUserMyService"></a>
# **backUserMyService**
> Object backUserMyService(model)



### Example
```java
// Import classes:
//import io.swagger.client.api.BackUserApi;

BackUserApi apiInstance = new BackUserApi();
SaloonServicesModel model = new SaloonServicesModel(); // SaloonServicesModel | 
try {
    Object result = apiInstance.backUserMyService(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackUserApi#backUserMyService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**SaloonServicesModel**](SaloonServicesModel.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

