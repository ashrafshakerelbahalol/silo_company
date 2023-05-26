package fee.gradproject.silocompany.cell;

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
@Table(name = "cell")
@EntityListeners(AuditingEntityListener.class)
public class Cell {

    @Id
    @GeneratedValue
    @Column(name = "cell_number")
    private Long id;

    @Column(name = "current_balance", columnDefinition = "numeric default 0.0")
    private Long currentBalance;

    @CreatedBy
    private String addedBy;

    @CreatedDate
    private LocalDateTime addedDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @OneToMany(mappedBy = "cell")
    private Set<WheatCell> wheatCells;

    @OneToMany(mappedBy = "cell")
    private Set<CellReport> cellReports;
}
