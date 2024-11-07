package dev.zbib.userservice.model.entity;

import dev.zbib.userservice.model.enums.FieldsCategories;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skill {

    @Id
    @GeneratedValue
    private Long id;

    private FieldsCategories skill;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

}
