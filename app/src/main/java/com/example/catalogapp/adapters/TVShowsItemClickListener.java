package com.example.catalogapp.adapters;

import android.widget.ImageView;

import com.example.catalogapp.models.TVShow;

public interface TVShowsItemClickListener {
    void onTVShowClick(TVShow tvShow, ImageView movieImageView);
}
