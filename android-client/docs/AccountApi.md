# AccountApi

All URIs are relative to *http://saloon.deseco.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountCreateUser**](AccountApi.md#accountCreateUser) | **POST** /api/account/register | 
[**accountLogin**](AccountApi.md#accountLogin) | **POST** /api/account/login | 


<a name="accountCreateUser"></a>
# **accountCreateUser**
> Object accountCreateUser(model)



### Example
```java
// Import classes:
//import io.swagger.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
UserModel model = new UserModel(); // UserModel | 
try {
    Object result = apiInstance.accountCreateUser(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountCreateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**UserModel**](UserModel.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="accountLogin"></a>
# **accountLogin**
> Object accountLogin(mobile, otp)



### Example
```java
// Import classes:
//import io.swagger.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String mobile = "mobile_example"; // String | 
String otp = "otp_example"; // String | 
try {
    Object result = apiInstance.accountLogin(mobile, otp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mobile** | **String**|  |
 **otp** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

