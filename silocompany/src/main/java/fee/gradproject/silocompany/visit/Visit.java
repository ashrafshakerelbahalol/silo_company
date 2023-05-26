package fee.gradproject.silocompany.visit;

import fee.gradproject.silocompany.affiliatedentity.AffiliatedEntity;
import fee.gradproject.silocompany.equipment.Equipment;
import fee.gradproject.silocompany.user.User;
import fee.gradproject.silocompany.visitor.Visitor;
import fee.gradproject.silocompany.wheatvisit.WheatVisit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "visit")
@EntityListeners(AuditingEntityListener.class)
public class Visit {

    @Id
    @GeneratedValue
    @Column(name = "visit_id")
    private Long id;

    @Column(name = "start_at")
    private LocalTime startAt;

    @Column(name = "end_at")
    private LocalTime endAt;

    @Column(name = "visitReason", nullable = false)
    private String visitReason;

    @Enumerated(EnumType.STRING)
    @Column(name = "visit_type", nullable = false)
    private VisitType visitType;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
    @ManyToMany
    @JoinTable(
            name = "visit_visitor",
            joinColumns = { @JoinColumn(name = "visit_id")},
            inverseJoinColumns = {@JoinColumn(name = "visitor_id")}
    )
    private Set<Visitor> visitors;

    @ManyToMany
    @JoinTable(
            name = "visit_user",
            joinColumns = { @JoinColumn(name = "visit_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")}
    )
    private Set<User> users;

    @ManyToOne
    @JoinTable(
            name = "visit_entity",
            joinColumns = @JoinColumn(name = "visit_id"),
            inverseJoinColumns = @JoinColumn(name = "entity_id")
    )
    private AffiliatedEntity affiliatedEntity;

    @ManyToMany
    @JoinTable(
            name = "visit_car",
            joinColumns = @JoinColumn(name = "visit_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id")
    )
    private Set<AffiliatedEntity> cars;

    @ManyToMany
    @JoinTable(
            name = "equipment_visit",
            joinColumns = @JoinColumn(name = "visit_id"),
            inverseJoinColumns = @JoinColumn(name = "equipment_id")
    )
    private Set<Equipment> equipments;


    @OneToOne(mappedBy = "visit")
    private WheatVisit wheatVisit;
}