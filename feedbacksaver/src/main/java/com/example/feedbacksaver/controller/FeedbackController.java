package com.example.feedbacksaver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.feedbacksaver.model.Feedback;
import com.example.feedbacksaver.service.FeedbackService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FeedbackController {

    private final FeedbackService feedbackService;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        model.addAttribute("feedbacks", feedbackService.getAllFeedbacks());
        return "index"; // index.html (Thymeleaf)
    }

    @PostMapping("/submit")
    public String submitFeedback(@ModelAttribute Feedback feedback) {
        feedbackService.saveFeedback(feedback);
        return "redirect:/";  
    }
}
