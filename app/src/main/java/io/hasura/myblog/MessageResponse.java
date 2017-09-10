package io.hasura.myblog;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ADMIN on 9/9/2017.
 */

public class MessageResponse {

    @SerializedName("message")
    String message;
    public String getMessage(){
        return message;
    }
}
