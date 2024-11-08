package dev.zbib.classificationservice.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class ClassifiableEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private Long createdById;
}
