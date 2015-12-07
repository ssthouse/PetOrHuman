package com.ssthouse.petorhuman.rtrofit;

import android.util.Log;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.SaveCallback;
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

    public static void testAvCloud(){
        // 测试 SDK 是否正常工作的代码
        AVObject testObject = new AVObject("TestObject");
        testObject.put("words","Hello,World!");
        testObject.saveInBackground(new SaveCallback() {
            @Override
            public void done(AVException e) {
                if(e == null){
                    Log.d("saved","success!");
                }
            }
        });
    }
}
