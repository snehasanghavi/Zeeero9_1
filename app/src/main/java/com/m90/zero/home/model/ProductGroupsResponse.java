package com.m90.zero.home.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ProductGroupsResponse {

    @SerializedName("data")
    public ArrayList<ProductGroupsDetailsResponse> data;
    @SerializedName("access_token")
    public String access_token;
    @SerializedName("status")
    public int status;
    @SerializedName("message")
    public String message;
    @SerializedName("content_type")
    public String content_type;

    @Override
    public String toString() {
        return "ProductGroupsResponse{" +
                "data=" + data +
                ", access_token='" + access_token + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", content_type='" + content_type + '\'' +
                '}';
    }
}
