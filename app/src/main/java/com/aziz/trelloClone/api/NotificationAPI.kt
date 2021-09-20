package com.aziz.trelloClone.api

import com.aziz.trelloClone.models.PushNotification
import com.aziz.trelloClone.utils.Constants.CONTENT_TYPE
import com.aziz.trelloClone.utils.Constants.FCM_SERVER_KEY
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface NotificationAPI {
    @Headers("Authorization: key=$FCM_SERVER_KEY", "Content-Type:$CONTENT_TYPE")
    @POST("send")
    suspend fun postNotification(@Body notification: PushNotification): Response<ResponseBody>
}