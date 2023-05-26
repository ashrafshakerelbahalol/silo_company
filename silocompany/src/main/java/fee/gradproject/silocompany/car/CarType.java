package fee.gradproject.silocompany.car;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CarType {
    HasOnePlate("ذات لوحة أرقام واحدة"),
    HasTwoPlates("لها لوحتين أرقام"),
    HasNoPlates("ليس بها لوحات أرقام");

    @Getter
    private final String name;
}
