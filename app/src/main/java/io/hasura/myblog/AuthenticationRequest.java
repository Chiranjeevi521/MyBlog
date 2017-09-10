package io.hasura.myblog;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ADMIN on 9/9/2017.
 */

public class AuthenticationRequest {
    @SerializedName("username")
    String username;

    @SerializedName("password")
    String password;

    public AuthenticationRequest(String username, String password){
        this.username = username;
        this.password = password;
    }
}
