package dev.zbib.userservice.model.entity;

import dev.zbib.userservice.model.enums.FieldsCategories;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profile {

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Id
    private Long id;
    private String bio;
    private String status;
    private Long domainId;

    private int reputationScore = 0;
    private String degree;
    private String location;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<FieldsCategories> skills;

    @ElementCollection
    private Set<Long> fields;

    @ElementCollection
    private Set<Long> topics;

}
