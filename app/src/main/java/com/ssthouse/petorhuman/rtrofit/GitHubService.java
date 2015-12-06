package com.ssthouse.petorhuman.rtrofit;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by ssthouse on 2015/12/5.
 */
public interface GitHubService {
    @GET("/api/record/top")
    Call<Bean> listRepos();

}
