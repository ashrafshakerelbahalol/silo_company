package fee.gradproject.silocompany.equipment;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MeasuringUnit {
    BY_NUMBER ("بالعدد"),
    BY_WEIGHT("بالوزن");

    @Getter
    private final String measuringUnitName;
}
