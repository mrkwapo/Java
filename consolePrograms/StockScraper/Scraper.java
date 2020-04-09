package com.Dracodess;

import java.util.List;

public interface Scraper {
    void login();

    List<String> ParseData();

    List<String> getData();
}
