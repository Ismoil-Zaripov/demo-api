package com.example.demoapi.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    private String title;
    private String timestamp;
}
