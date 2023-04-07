package com.example.newsapp2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {
    private static Retrofit retrofit = null;

    public static ApiInterface getApiInterface(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiInterface.Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        else{
            return retrofit.create(ApiInterface.class);
        }
        return null;
    }
}
