package dev.zbib.classificationservice.repository;

import dev.zbib.classificationservice.model.entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldRepository extends JpaRepository<Field, Long> {
}
