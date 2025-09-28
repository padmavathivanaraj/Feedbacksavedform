package com.example.feedbacksaver.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.feedbacksaver.model.Feedback;
import com.example.feedbacksaver.repository.FeedbackRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FeedbackService {

    private final FeedbackRepository feedbackRepository;

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }
}
