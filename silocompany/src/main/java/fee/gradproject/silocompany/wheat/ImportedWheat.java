package fee.gradproject.silocompany.wheat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "imported_wheat")
public class ImportedWheat extends Wheat{

    @Column(name = "trip_date", nullable = false)
    private LocalDate tripDate;

    @Column(name = "release_permission", nullable = false)
    private String releasePermission;

    @Column(name = "reservation_type", nullable = false)
    private String reservationType;

    @Column(name = "ship_name", nullable = false)
    private String shipName;

    @Column(name = "imported_wheat_type", nullable = false)
    private String importedWheatType;
}
