package com.example.android.walkmyandroid;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/**
 * Created by welly on 5/1/2018.
 */

public interface AttendanceService {
    @Multipart
    @POST("/attendance")
    Call<Attendance> uploadImage(@Part MultipartBody.Part photo,
                                   @PartMap Map<String, RequestBody> text);
}
