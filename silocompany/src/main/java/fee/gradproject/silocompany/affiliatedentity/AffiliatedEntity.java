package fee.gradproject.silocompany.affiliatedentity;

import fee.gradproject.silocompany.program.EntityWheatProgram;
import fee.gradproject.silocompany.visit.Visit;
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
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "affiliated_entity")
@EntityListeners(AuditingEntityListener.class)
public class AffiliatedEntity {
    @Id
    @GeneratedValue()
    @Column(name = "affiliated_entity_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name="affiliated_entity_type", nullable = false)
    private AffiliatedEntityType affiliatedEntityType;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @OneToMany(mappedBy = "affiliatedEntity")
    private Set<Visit> visits;

    @OneToMany(mappedBy = "affiliatedEntity")
    private Set<EntityWheatProgram> entityWheatPrograms;


}
