package dev.zbib.classificationservice.repository;

import dev.zbib.classificationservice.model.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
