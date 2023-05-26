package fee.gradproject.silocompany.visitor;

import fee.gradproject.silocompany.visit.Visit;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "visitor")
@EntityListeners(AuditingEntityListener.class)
public class Visitor {

    @Id
    @GeneratedValue
    @Column(name = "visitor_id")
    private Long id;

    @Column(name = "card_id", unique = true, nullable = false, length = 14)
    private String cardId;

    @Column(nullable = false, length = 50)
    private String name;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @ManyToMany(mappedBy = "visitors")
    private Set<Visit> visits;
}