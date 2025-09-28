package com.example.feedbacksaver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.feedbacksaver.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}

