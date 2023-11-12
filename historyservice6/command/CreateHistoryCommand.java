package com.example.historyservice6.command;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
public class CreateHistoryCommand {
    @TargetAggregateIdentifier
    private String _id;
    private int historyId;
    private int userId;
    private int songId;
    private String email;
    private String timestamp;
}
