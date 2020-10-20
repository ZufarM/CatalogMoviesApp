package com.example.catalogapp.models;

import com.google.gson.annotations.SerializedName;

public class Episode {

    @SerializedName("season")
    private String season;

    @SerializedName("episode")
    private String episode;

    @SerializedName("name")
    private String name;

    @SerializedName("air_date")
    private String airDate;

    public String getSeason() {
        return season;
    }

    public String getEpisode() {
        return episode;
    }

    public String getName() {
        return name;
    }

    public String getAirDate() {
        return airDate;
    }

    // https://www.episodate.com/api/show-details?q=29560
    // Example
    //    {
    //        "tvShow": {
    //        "id": 29560,
    //                "name": "Arrow",
    //                "permalink": "arrow",
    //                "url": "https://www.episodate.com/tv-show/arrow",
    //                "description": "Arrow is an American television series developed by writer/producers Greg Berlanti, Marc Guggenheim, and Andrew Kreisberg. It is based on the DC Comics character Green Arrow, a costumed crime-fighter created by Mort Weisinger and George Papp. It premiered in North America on The CW on October 10, 2012, with international broadcasting taking place in late 2012. Primarily filmed in Vancouver, British Columbia, Canada, the series follows billionaire playboy Oliver Queen, portrayed by Stephen Amell, who, five years after being stranded on a hostile island, returns home to fight crime and corruption as a secret vigilante whose weapon of choice is a bow and arrow. Unlike in the comic books, Queen does not go by the alias \"Green Arrow\". The series takes a realistic look at the Green Arrow character, as well as other characters from the DC Comics universe. Although Oliver Queen/Green Arrow had been featured in the television series Smallville from 2006 to 2011, the producers decided to start clean and find a new actor (Amell) to portray the character. Arrow focuses on the humanity of Oliver Queen, and how he was changed by time spent shipwrecked on an island. Most episodes have flashback scenes to the five years in which Oliver was missing.",
    //                "description_source": "http://en.wikipedia.org/wiki/Arrow_%28TV_series%29",
    //                "start_date": "2012-10-10",
    //                "end_date": null,
    //                "country": "US",
    //                "status": "Ended",
    //                "runtime": 60,
    //                "network": "The CW",
    //                "youtube_link": null,
    //                "image_path": "https://static.episodate.com/images/tv-show/full/29560.jpg",
    //                "image_thumbnail_path": "https://static.episodate.com/images/tv-show/thumbnail/29560.jpg",
    //                "rating": "9.1236",
    //                "rating_count": "623",
    //                "countdown": null,
    //                "genres": [
    //        "Drama",
    //                "Action",
    //                "Science-Fiction"
    //        ],
    //        "pictures": [
    //        "https://static.episodate.com/images/episode/29560-242.jpg",
    //                "https://static.episodate.com/images/episode/29560-804.jpg",
    //                "https://static.episodate.com/images/episode/29560-664.jpg",
    //                "https://static.episodate.com/images/episode/29560-120.jpg",
    //                "https://static.episodate.com/images/episode/29560-764.jpg",
    //                "https://static.episodate.com/images/episode/29560-792.jpg",
    //                "https://static.episodate.com/images/episode/29560-159.jpg"
    //        ],
    //        "episodes": [
    //        {
    //            "season": 1,
    //                "episode": 1,
    //                "name": "Pilot",
    //                "air_date": "2012-10-11 00:00:00"
    //        },
    //    }
}
