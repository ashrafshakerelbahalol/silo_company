package fee.gradproject.silocompany.cell;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cell_report")
public class CellReport {

    @Id
    @Column(name = "cell_report_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cell_number")
    private Cell cell;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "cell_starting_balance")
    private Double cellStartingBalance;

    @Column(name = "cell_incoming_weight")
    private Double cellIncomingWeight;

    @Column(name = "cell_outgoing_weight")
    private Double cellOutgoingWeight;

    @Column(name = "cell_ending_balance")
    private Double cellEndingBalance;
}
