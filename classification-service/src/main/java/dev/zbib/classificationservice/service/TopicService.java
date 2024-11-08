package dev.zbib.classificationservice.service;

import dev.zbib.classificationservice.model.entity.Field;
import dev.zbib.classificationservice.model.entity.Topic;
import dev.zbib.classificationservice.model.request.TopicRequest;
import dev.zbib.classificationservice.repository.TopicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TopicService {

    private final TopicRepository topicRepository;
    private final FieldService fieldService;

    public void createTopic(TopicRequest request) {
        Field field = fieldService.getById(request.getFieldId());
        Topic topic = Topic.builder()
                .name(request.getName())
                .description(request.getDescription())
                .createdById(request.getCreatedById())
                .field(field)
                .build();
        topicRepository.save(topic);
    }

}
