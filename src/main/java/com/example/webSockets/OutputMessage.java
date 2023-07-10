package com.example.webSockets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OutputMessage {
    private Long id;
    private String content;
}
