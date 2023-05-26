package fee.gradproject.silocompany.wheatreport;

import fee.gradproject.silocompany.wheat.Wheat;
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
@Table(name = "wheat_report")
public class WheatReport {

    @Id
    @GeneratedValue
    @Column(name = "wheat_report_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "report_id", nullable = false)
    private Report report;

    @ManyToOne
    @JoinColumn(name = "wheat_id", nullable = false)
    private Wheat wheat;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Enumerated
    @Column(name = "report_type", nullable = false)
    private ReportType reportType;

    @Enumerated
    @Column(name = "stored_wheat_type", nullable = false)
    private StoredWheatType storedWheatType;



}
