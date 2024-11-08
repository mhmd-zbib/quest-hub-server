package dev.zbib.classificationservice.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Field extends ClassifiableEntity {

    @OneToMany(mappedBy = "field")
    private List<Topic> topics;

    @ManyToOne
    @JoinColumn(name = "domain_id")
    private Domain domain;
}
