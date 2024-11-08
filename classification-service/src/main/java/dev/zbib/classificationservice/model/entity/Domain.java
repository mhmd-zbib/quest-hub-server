package dev.zbib.classificationservice.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Domain extends ClassifiableEntity {

    @OneToMany(mappedBy = "domain")
    private List<Field> fields;

}
