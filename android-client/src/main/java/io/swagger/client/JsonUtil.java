package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("CityModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<CityModel>>(){}.getType();
    }
    
    if ("CountryModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<CountryModel>>(){}.getType();
    }
    
    if ("LanguageModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<LanguageModel>>(){}.getType();
    }
    
    if ("SaloonProfile".equalsIgnoreCase(className)) {
      return new TypeToken<List<SaloonProfile>>(){}.getType();
    }
    
    if ("SaloonRatingRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<SaloonRatingRequest>>(){}.getType();
    }
    
    if ("SaloonSearchRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<SaloonSearchRequest>>(){}.getType();
    }
    
    if ("SaloonServicesModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<SaloonServicesModel>>(){}.getType();
    }
    
    if ("ServicesModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<ServicesModel>>(){}.getType();
    }
    
    if ("StateModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<StateModel>>(){}.getType();
    }
    
    if ("UserModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserModel>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("CityModel".equalsIgnoreCase(className)) {
      return new TypeToken<CityModel>(){}.getType();
    }
    
    if ("CountryModel".equalsIgnoreCase(className)) {
      return new TypeToken<CountryModel>(){}.getType();
    }
    
    if ("LanguageModel".equalsIgnoreCase(className)) {
      return new TypeToken<LanguageModel>(){}.getType();
    }
    
    if ("SaloonProfile".equalsIgnoreCase(className)) {
      return new TypeToken<SaloonProfile>(){}.getType();
    }
    
    if ("SaloonRatingRequest".equalsIgnoreCase(className)) {
      return new TypeToken<SaloonRatingRequest>(){}.getType();
    }
    
    if ("SaloonSearchRequest".equalsIgnoreCase(className)) {
      return new TypeToken<SaloonSearchRequest>(){}.getType();
    }
    
    if ("SaloonServicesModel".equalsIgnoreCase(className)) {
      return new TypeToken<SaloonServicesModel>(){}.getType();
    }
    
    if ("ServicesModel".equalsIgnoreCase(className)) {
      return new TypeToken<ServicesModel>(){}.getType();
    }
    
    if ("StateModel".equalsIgnoreCase(className)) {
      return new TypeToken<StateModel>(){}.getType();
    }
    
    if ("UserModel".equalsIgnoreCase(className)) {
      return new TypeToken<UserModel>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
