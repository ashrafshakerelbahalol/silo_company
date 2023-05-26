package fee.gradproject.silocompany.cell;

import fee.gradproject.silocompany.wheat.Wheat;
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
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "wheat_cell")
@EntityListeners(AuditingEntityListener.class)
public class WheatCell {

    @Id
    @GeneratedValue
    @Column(name = "wheat_cell_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "wheat_id")
    private Wheat wheat;

    @ManyToOne
    @JoinColumn(name = "cell_id")
    private Cell cell;

    @CreatedBy
    private String addedBy;

    @CreatedDate
    private LocalDateTime addedDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;


}
