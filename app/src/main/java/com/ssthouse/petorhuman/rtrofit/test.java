package com.ssthouse.petorhuman.rtrofit;

import com.orhanobut.logger.Logger;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by ssthouse on 2015/12/5.
 */
public class test {

    public static void testRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.qingvoice.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GitHubService gitHubService = retrofit.create(GitHubService.class);
        Call<Bean> bean = gitHubService.listRepos();
        bean.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Response<Bean> response, Retrofit retrofit) {
                Logger.e(response.body().getCode()+"hahaha");
                Logger.e(response.body().getData().getRecord_list().get(0).getSong_name());
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
