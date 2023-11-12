package com.example.historyservice6.core.event;

import lombok.Data;

@Data
public class HistoryCreatedEvent {
    private String _id;
    private int historyId;
    private int userId;
    private int songId;
    private String email;
    private String timestamp;
}
