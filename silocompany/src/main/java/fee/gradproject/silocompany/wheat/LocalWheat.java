package fee.gradproject.silocompany.wheat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "local_wheat")
public class LocalWheat extends Wheat{

    @Enumerated
    @Column(name = "cleanliness_degree")
    private CleanlinessDegree cleanlinessDegree;
}
