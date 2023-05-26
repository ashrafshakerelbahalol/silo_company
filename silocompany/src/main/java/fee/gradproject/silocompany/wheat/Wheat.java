package fee.gradproject.silocompany.wheat;

import fee.gradproject.silocompany.cell.WheatCell;
import fee.gradproject.silocompany.program.EntityWheatProgram;
import fee.gradproject.silocompany.wheatreport.WheatReport;
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
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "wheat")
@Inheritance(strategy = InheritanceType.JOINED)
@EntityListeners(AuditingEntityListener.class)
public abstract class Wheat {

    @Id
    @GeneratedValue
    @Column(name = "wheat_id")
    private Long id;

    @Enumerated
    @Column(name = "wheat_state")
    private WheatState wheatState;

    @Column(name = "dust_quantity", columnDefinition = "numeric default 0.0")
    private Double dustQuantity;

    @Column(name = "increase_filtering", columnDefinition = "numeric default 0.0")
    private Double increaseFiltering;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @OneToMany(mappedBy = "wheat")
    private Set<WheatVisit> wheatVisits;

    @OneToMany(mappedBy = "wheat")
    private Set<WheatReport> wheatReports;

    @OneToMany(mappedBy = "wheat")
    private Set<WheatCell> wheatCells;

    @OneToMany(mappedBy = "wheat")
    private Set<EntityWheatProgram> entityWheatPrograms;
}
