package dev.zbib.userservice.model.entity;

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
    private int reputationScore = 0;
    private String bio;
    private String status;
    private String fieldOfStudy;

    @OneToMany(mappedBy = "profile")
    private Set<Skill> skills;

    @OneToMany(mappedBy = "profile")
    private Set<Interest> interest;
    private String currentStudies;
    private String degree;
    private String location;

}
