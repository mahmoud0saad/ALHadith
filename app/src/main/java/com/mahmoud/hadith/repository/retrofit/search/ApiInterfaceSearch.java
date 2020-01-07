package com.mahmoud.hadith.repository.retrofit.search;


import com.mahmoud.hadith.model.entity.api.hadithwithout.HadithResponse;
import com.mahmoud.hadith.repository.retrofit.ApiConstans;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterfaceSearch {

    @GET(ApiConstans.END_POINT_SEARCH +"{keyword}/"+"{language}")
    Observable<Response<HadithResponse>> searchForHadith(
            @Path(value = "keyword") String keyword,
            @Path(value = "language") String Language
    );
}
