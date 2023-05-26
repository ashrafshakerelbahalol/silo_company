package fee.gradproject.silocompany.wheatvisit;

import fee.gradproject.silocompany.visit.Visit;
import fee.gradproject.silocompany.wheat.Wheat;
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

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "wheat_visit")
@EntityListeners(AuditingEntityListener.class)
public class WheatVisit {

    @Id
    @GeneratedValue
    @Column(name = "wheat_visit_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "visit_id")
    private Visit visit;

    @ManyToOne
    @JoinColumn(name = "wheat_id")
    private Wheat wheat;

    @Column(name = "actual_weight", nullable = false)
    private Double actualWeight;

    @Column(name = "accepted_or_rejected")
    private AcceptedOrRejected acceptedOrRejected;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;


}
