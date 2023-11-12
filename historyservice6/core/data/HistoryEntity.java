package com.example.historyservice6.core.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;

@Data
@Document(collection = "History")
public class HistoryEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -3332828319608621803L;
    @Id
    private String _id;
    private int historyId;
    private int userId;
    private int songId;
    private String email;
    private String timestamp;

    public HistoryEntity(){}

    public HistoryEntity(String _id){
        this._id = _id;
    }

    public HistoryEntity(String _id, int historyId, int userId, int songId, String email, String timestamp){
        this._id = _id;
        this.historyId = historyId;
        this.userId = userId;
        this.songId = songId;
        this.email = email;
        this.timestamp = timestamp;
    }

    public HistoryEntity(int historyId, int userId, int songId, String email, String timestamp){
        this.historyId = historyId;
        this.userId = userId;
        this.songId = songId;
        this.email = email;
        this.timestamp = timestamp;
    }
}
