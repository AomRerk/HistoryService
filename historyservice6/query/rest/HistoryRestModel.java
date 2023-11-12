package com.example.historyservice6.query.rest;

import lombok.Data;

@Data
public class HistoryRestModel {
    private String _id;
    private int historyId;
    private int userId;
    private int songId;
    private String email;
    private String timestamp;
}
