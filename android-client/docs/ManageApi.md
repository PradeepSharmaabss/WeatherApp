# ManageApi

All URIs are relative to *http://saloon.deseco.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**manageAddCity**](ManageApi.md#manageAddCity) | **POST** /api/saloonManage/AddCity | 
[**manageAddCountry**](ManageApi.md#manageAddCountry) | **POST** /api/saloonManage/AddCountry | 
[**manageAddLanguage**](ManageApi.md#manageAddLanguage) | **POST** /api/saloonManage/AddLanguage | 
[**manageAddService**](ManageApi.md#manageAddService) | **POST** /api/saloonManage/AddService | 
[**manageAddState**](ManageApi.md#manageAddState) | **POST** /api/saloonManage/AddState | 
[**manageGetCity**](ManageApi.md#manageGetCity) | **GET** /api/saloonManage/GetCity | 
[**manageGetCountry**](ManageApi.md#manageGetCountry) | **GET** /api/saloonManage/GetCountry | 
[**manageGetLanguage**](ManageApi.md#manageGetLanguage) | **GET** /api/saloonManage/GetLanguage | 
[**manageGetService**](ManageApi.md#manageGetService) | **GET** /api/saloonManage/GetService | 
[**manageGetState**](ManageApi.md#manageGetState) | **GET** /api/saloonManage/GetState | 


<a name="manageAddCity"></a>
# **manageAddCity**
> Object manageAddCity(model)



### Example
```java
// Import classes:
//import io.swagger.client.api.ManageApi;

ManageApi apiInstance = new ManageApi();
CityModel model = new CityModel(); // CityModel | 
try {
    Object result = apiInstance.manageAddCity(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageApi#manageAddCity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**CityModel**](CityModel.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="manageAddCountry"></a>
# **manageAddCountry**
> Object manageAddCountry(model)



### Example
```java
// Import classes:
//import io.swagger.client.api.ManageApi;

ManageApi apiInstance = new ManageApi();
CountryModel model = new CountryModel(); // CountryModel | 
try {
    Object result = apiInstance.manageAddCountry(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageApi#manageAddCountry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**CountryModel**](CountryModel.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="manageAddLanguage"></a>
# **manageAddLanguage**
> Object manageAddLanguage(model)



### Example
```java
// Import classes:
//import io.swagger.client.api.ManageApi;

ManageApi apiInstance = new ManageApi();
LanguageModel model = new LanguageModel(); // LanguageModel | 
try {
    Object result = apiInstance.manageAddLanguage(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageApi#manageAddLanguage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**LanguageModel**](LanguageModel.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="manageAddService"></a>
# **manageAddService**
> Object manageAddService(model)



### Example
```java
// Import classes:
//import io.swagger.client.api.ManageApi;

ManageApi apiInstance = new ManageApi();
ServicesModel model = new ServicesModel(); // ServicesModel | 
try {
    Object result = apiInstance.manageAddService(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageApi#manageAddService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**ServicesModel**](ServicesModel.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="manageAddState"></a>
# **manageAddState**
> Object manageAddState(model)



### Example
```java
// Import classes:
//import io.swagger.client.api.ManageApi;

ManageApi apiInstance = new ManageApi();
StateModel model = new StateModel(); // StateModel | 
try {
    Object result = apiInstance.manageAddState(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageApi#manageAddState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**StateModel**](StateModel.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="manageGetCity"></a>
# **manageGetCity**
> Object manageGetCity()



### Example
```java
// Import classes:
//import io.swagger.client.api.ManageApi;

ManageApi apiInstance = new ManageApi();
try {
    Object result = apiInstance.manageGetCity();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageApi#manageGetCity");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="manageGetCountry"></a>
# **manageGetCountry**
> Object manageGetCountry()



### Example
```java
// Import classes:
//import io.swagger.client.api.ManageApi;

ManageApi apiInstance = new ManageApi();
try {
    Object result = apiInstance.manageGetCountry();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageApi#manageGetCountry");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="manageGetLanguage"></a>
# **manageGetLanguage**
> Object manageGetLanguage()



### Example
```java
// Import classes:
//import io.swagger.client.api.ManageApi;

ManageApi apiInstance = new ManageApi();
try {
    Object result = apiInstance.manageGetLanguage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageApi#manageGetLanguage");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="manageGetService"></a>
# **manageGetService**
> Object manageGetService(terms)



### Example
```java
// Import classes:
//import io.swagger.client.api.ManageApi;

ManageApi apiInstance = new ManageApi();
String terms = "terms_example"; // String | 
try {
    Object result = apiInstance.manageGetService(terms);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageApi#manageGetService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="manageGetState"></a>
# **manageGetState**
> Object manageGetState()



### Example
```java
// Import classes:
//import io.swagger.client.api.ManageApi;

ManageApi apiInstance = new ManageApi();
try {
    Object result = apiInstance.manageGetState();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageApi#manageGetState");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

