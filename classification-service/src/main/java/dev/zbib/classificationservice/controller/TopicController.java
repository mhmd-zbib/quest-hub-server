package dev.zbib.classificationservice.controller;

import dev.zbib.classificationservice.model.request.TopicRequest;
import dev.zbib.classificationservice.service.TopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
@RequiredArgsConstructor
public class TopicController {

    private final TopicService topicService;

    @PostMapping
    public ResponseEntity<String> createTopic(@RequestBody TopicRequest topicRequest) {
        topicService.createTopic(topicRequest);
        return ResponseEntity.ok("Topic created successfully");
    }
}
