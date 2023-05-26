package fee.gradproject.silocompany.car;

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
@Table(name = "car")
@EntityListeners(AuditingEntityListener.class)
public class Car {

    @Id
    @Column(name = "car_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "car_type", nullable = false)
    private CarType carType;

    @Enumerated(EnumType.STRING)
    @Column(name = "car_condition", nullable = false)
    private CarType carCondition;

    @ElementCollection
    @CollectionTable(
            name = "car_driver_name",
            joinColumns = @JoinColumn(name = "car_id"))
    @Column(name = "driver_name")
    private Set<String> driverNames;

    @ManyToMany(mappedBy = "cars")
    private Set<Visit> visits;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @ElementCollection
    @CollectionTable(
            name = "car_plate_numbers",
            joinColumns = @JoinColumn(name = "car_id"))
    @Column(name = "plate_number")
    private Set<String> plateNumbers;

}
