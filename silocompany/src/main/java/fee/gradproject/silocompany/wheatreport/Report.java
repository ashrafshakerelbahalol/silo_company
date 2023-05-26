package fee.gradproject.silocompany.wheatreport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_report")
public class Report {

    @Id
    @GeneratedValue
    @Column(name = "report_id")
    private Long id;

    @Column(name = "starting_balance", columnDefinition = "numeric default 0.0")
    private Double startingBalance;

    @Column(name = "incoming_weight", columnDefinition = "numeric default 0.0")
    private Double incomingWeight;

    @Column(name = "total_dust_quantity", columnDefinition = "numeric default 0.0")
    private Double totalDustQuantity;

    @Column(name = "total_increase_filtering", columnDefinition = "numeric default 0.0")
    private Double totalIncreaseFiltering;

    @Column(name = "total_outgoing_wheat", columnDefinition = "numeric default 0.0")
    private Double totalOutgoingWheat;

    @Column(name = "ending_balance", columnDefinition = "numeric default 0.0")
    private Double endingBalance;

    @OneToMany(mappedBy = "report")
    private Set<WheatReport> wheatReports;
}
