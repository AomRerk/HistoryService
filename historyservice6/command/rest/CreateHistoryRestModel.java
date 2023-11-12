package com.example.historyservice6.command.rest;

import lombok.Data;

@Data
public class CreateHistoryRestModel {
    private int historyId;
    private int userId;
    private int songId;
    private String email;
    private String timestamp;
}
