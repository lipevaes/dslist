package com.devvaes.dslist.dto;

import com.devvaes.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }

    public GameMinDTO(Game enity) {
        id = enity.getId();
        title = enity.getTitle();
        year = enity.getYear();
        imgUrl = enity.getImgUrl();
        shortDescription = enity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
