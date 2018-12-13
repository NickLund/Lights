package com.example.nick_lund.lights;

public class Common {
    private static final String BASE_URL="192.168.101.85:5000/";
}
/*
    private static final String BASE_URL="https://newsapi.org/";

    public static final String API_KEY="c8f360de82484152b2c3776029a6a11f";

    public static NewsService getNewsService(){
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public  static IconBetterIdeaService getIconService(){
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    public static String getAPIUrl(String source,String sortBy,String apiKEY){
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
//                .append("&sortBy=")
//                .append(sortBy)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }
*/
