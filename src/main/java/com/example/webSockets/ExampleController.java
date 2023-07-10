package com.example.webSockets;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class ExampleController {

    private final MessageSendingOperations<String> messageSendingOperation;

    @GetMapping("/example")
    @ResponseBody
    public void example() {
        messageSendingOperation.convertAndSend("/topic/order-notifications", new OutputMessage(1L, "New order"));
    }
}
