package com.mediconnect.mediconnect_backend.controller;

import com.mediconnect.mediconnect_backend.service.AIChatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AIController {

    private final AIChatService aiChatService;

    public AIController(AIChatService aiChatService) {
        this.aiChatService = aiChatService;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String question) {
        return aiChatService.getMedicalAdvice(question);
    }
}