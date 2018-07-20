package com.android.nytimes.volley_ws;


public interface HttpConstants {

    //TODO: Keep Http(s) URL to avoid error 301 at service calling.
    String WEBSERVICE_BASEURL = "https://api.nytimes.com/svc/mostpopular/v2/";
    String NEWS_API_KEY = "3d8d81feb6564eb3b03de769cac53bae";

    /// GET NEW YORK NEWS
    String GET_NEWS = WEBSERVICE_BASEURL + "mostviewed/all-sections/";
}
