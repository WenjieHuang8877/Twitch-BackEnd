package com.laioffer.demo.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.laioffer.demo.entity.db.Item;

//write favorite
public class FavoriteRequestBody {
    @JsonProperty("favorite")
    private Item favoriteItem;

    public Item getFavoriteItem() {
        return favoriteItem;
    }

}
