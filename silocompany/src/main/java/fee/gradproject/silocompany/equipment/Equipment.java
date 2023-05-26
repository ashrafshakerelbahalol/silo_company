package fee.gradproject.silocompany.equipment;

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
@Table(name = "equipment")
@EntityListeners(AuditingEntityListener.class)
public class Equipment {

    @Id
    @GeneratedValue()
    @Column
    private Long id;

    @Column
    private String name;

    @Column(name = "existing_quantity")
    private int existingQuantity;

    @Enumerated
    @Column(name = "measuring_unit")
    private MeasuringUnit measuringUnit;

    @ManyToMany(mappedBy = "equipments")
    private Set<Visit> visits;


    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
