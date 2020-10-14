package com.example.catalogapp.responses;

import com.example.catalogapp.models.TVShow;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVShowsResponse {

    @SerializedName("page")
    private int page;

    @SerializedName("pages")
    private int totalPages;

    @SerializedName("tv_shows")
    private List<TVShow> tvShows;

    public int getPage() {
        return page;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public List<TVShow> getTvShows() {
        return tvShows;
    }

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
}
