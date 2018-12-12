package com.example.nick_lund.lights;

public interface PullService {
    @GET("v2/sources?language=en&apiKey="+ Common.API_KEY)
    Call<Website> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
