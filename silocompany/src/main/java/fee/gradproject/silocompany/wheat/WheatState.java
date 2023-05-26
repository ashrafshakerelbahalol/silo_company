package fee.gradproject.silocompany.wheat;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum WheatState {
    IN_STOCK("متوفر"),
    OUT_OF_STOCK("غير متوفر");

    @Getter
    private final String wheatStateName;
}
