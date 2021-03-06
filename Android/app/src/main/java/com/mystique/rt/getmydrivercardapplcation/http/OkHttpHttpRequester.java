

package com.mystique.rt.getmydrivercardapplcation.http;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * <h1>OkHttpHttpRequester class</h1>
 *
 * <b>Description: </b> This class implements the actions/methods which can be
 * performed as a part of an HTTP request (get, post, put).
 *
 * @author  Mystique Team
 * @version 1.0
 * @since   2018-11-12
 */
public class OkHttpHttpRequester implements HttpRequester {
    public OkHttpHttpRequester() {
        // required empty constructor
    }

    @Override
    public String get(String url) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        OkHttpClient client = new OkHttpClient();

        Response response = client.newCall(request)
                .execute();

        String body = response.body().string();
        return body;
    }

    @Override
    public String post(String url, String bodyString) throws IOException {
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"),
                bodyString
        );

        Request request = new Request.Builder()
                .post(body)
                .url(url)
                .build();
        OkHttpClient client = new OkHttpClient();

        Response response = client.newCall(request)
                .execute();

        String responseBody = response.body().string();
        return responseBody;
    }

    @Override
    public String put(String url, String bodyString) throws IOException {
        RequestBody requestBody = RequestBody.create(
                MediaType.parse("application/json"),
                bodyString);

        Request request = new Request.Builder()
                .put(requestBody)
                .url(url)
                .build();
        OkHttpClient client = new OkHttpClient();

        Response response = client.newCall(request)
                .execute();

        String responseBody = response.body().string();
        return responseBody;
    }
}
