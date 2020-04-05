# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AccountApi;

public class AccountApiExample {

    public static void main(String[] args) {
        AccountApi apiInstance = new AccountApi();
        UserModel model = new UserModel(); // UserModel | 
        try {
            Object result = apiInstance.accountCreateUser(model);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountCreateUser");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://saloon.deseco.in*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**accountCreateUser**](docs/AccountApi.md#accountCreateUser) | **POST** /api/account/register | 
*AccountApi* | [**accountLogin**](docs/AccountApi.md#accountLogin) | **POST** /api/account/login | 
*BackUserApi* | [**backUserMyProfile**](docs/BackUserApi.md#backUserMyProfile) | **POST** /api/backuser/myProfile | 
*BackUserApi* | [**backUserMyService**](docs/BackUserApi.md#backUserMyService) | **POST** /api/backuser/myServices | 
*ManageApi* | [**manageAddCity**](docs/ManageApi.md#manageAddCity) | **POST** /api/saloonManage/AddCity | 
*ManageApi* | [**manageAddCountry**](docs/ManageApi.md#manageAddCountry) | **POST** /api/saloonManage/AddCountry | 
*ManageApi* | [**manageAddLanguage**](docs/ManageApi.md#manageAddLanguage) | **POST** /api/saloonManage/AddLanguage | 
*ManageApi* | [**manageAddService**](docs/ManageApi.md#manageAddService) | **POST** /api/saloonManage/AddService | 
*ManageApi* | [**manageAddState**](docs/ManageApi.md#manageAddState) | **POST** /api/saloonManage/AddState | 
*ManageApi* | [**manageGetCity**](docs/ManageApi.md#manageGetCity) | **GET** /api/saloonManage/GetCity | 
*ManageApi* | [**manageGetCountry**](docs/ManageApi.md#manageGetCountry) | **GET** /api/saloonManage/GetCountry | 
*ManageApi* | [**manageGetLanguage**](docs/ManageApi.md#manageGetLanguage) | **GET** /api/saloonManage/GetLanguage | 
*ManageApi* | [**manageGetService**](docs/ManageApi.md#manageGetService) | **GET** /api/saloonManage/GetService | 
*ManageApi* | [**manageGetState**](docs/ManageApi.md#manageGetState) | **GET** /api/saloonManage/GetState | 
*SaloonDataApi* | [**saloonDataAddSaloonRating**](docs/SaloonDataApi.md#saloonDataAddSaloonRating) | **POST** /api/saloonData/SaloonRating | 
*SaloonDataApi* | [**saloonDataGetSaloon**](docs/SaloonDataApi.md#saloonDataGetSaloon) | **POST** /api/saloonData/GetSaloon | 


## Documentation for Models

 - [CityModel](docs/CityModel.md)
 - [CountryModel](docs/CountryModel.md)
 - [LanguageModel](docs/LanguageModel.md)
 - [SaloonProfile](docs/SaloonProfile.md)
 - [SaloonRatingRequest](docs/SaloonRatingRequest.md)
 - [SaloonSearchRequest](docs/SaloonSearchRequest.md)
 - [SaloonServicesModel](docs/SaloonServicesModel.md)
 - [ServicesModel](docs/ServicesModel.md)
 - [StateModel](docs/StateModel.md)
 - [UserModel](docs/UserModel.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Token

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



