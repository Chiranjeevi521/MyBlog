package io.hasura.myblog;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ADMIN on 9/9/2017.
 */

public class ErrorResponse {

    @SerializedName("error")
    String error;

    public String getError() {

        return error;
    }

}
