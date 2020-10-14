package com.example.catalogapp.models;

import com.google.gson.annotations.SerializedName;

public class TVShow {

    // https://www.episodate.com/api/most-popular?page=1
    // Example
    //    {
    //        "total": "16976",
    //        "page": 1,
    //        "pages": 849,
    //        "tv_shows":
    //        [
    //            {
    //                "id": 35624,
    //                "name": "The Flash",
    //                "permalink": "the-flash",
    //                "start_date": "2014-10-07",
    //                "end_date": null,
    //                "country": "US",
    //                "network": "The CW",
    //                "status": "Running",
    //                "image_thumbnail_path": "https://static.episodate.com/images/tv-show/thumbnail/35624.jpg"
    //            },
    //            {
    //                "id": 23455,
    //                "name": "Game of Thrones",
    //                "permalink": "game-of-thrones",
    //                "start_date": "2011-04-17",
    //                "end_date": null,
    //                "country": "US",
    //                "network": "HBO",
    //                "status": "Ended",
    //                "image_thumbnail_path": "https://static.episodate.com/images/tv-show/thumbnail/23455.jpg"
    //            }
    //        ]
    //    }

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("start_date")
    private String start_date;

    @SerializedName("country")
    private String country;

    @SerializedName("network")
    private String network;

    @SerializedName("status")
    private String status;

    @SerializedName("image_thumbnail_path")
    private String thumbnail;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getCountry() {
        return country;
    }

    public String getNetwork() {
        return network;
    }

    public String getStatus() {
        return status;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}
