package fee.gradproject.silocompany.program;

import fee.gradproject.silocompany.affiliatedentity.AffiliatedEntity;
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
@Table(name = "entity_wheat_program")
@EntityListeners(AuditingEntityListener.class)
public class EntityWheatProgram {

    @Id
    @GeneratedValue
    @Column(name = "entity_wheat_program")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "program_id")
    private Program program;

    @ManyToOne
    @JoinColumn(name = "affiliated_entity_id")
    private AffiliatedEntity affiliatedEntity;

    @ManyToOne
    @JoinColumn(name = "wheat_id")
    private Wheat wheat;

    @Column(name = "determined_weight", nullable = false)
    private Double determined_weight;

    @Column(name = "total_shipped_weigth", columnDefinition = "numeric default 0.0")
    private Double totalShippedWeight;

    @Column(name = "total_wheat_loss", nullable = false)
    private Double totalWheatLoss;

    @Column(name = "total_exchanged_weight", columnDefinition = "numeric default 0.0")
    private Double totalExchangedWeight;

    @Column(name = "total_remaining_weight", columnDefinition = "numeric default 0.0")
    private Double totalRemainingWeight;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
