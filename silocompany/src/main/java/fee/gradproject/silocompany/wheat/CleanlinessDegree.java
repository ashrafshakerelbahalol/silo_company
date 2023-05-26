package fee.gradproject.silocompany.wheat;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CleanlinessDegree {
    LOWEST_DEGREE("22.5"),
    MEDIUM_DEGREE("23"),
    HIGHEST_DEGREE("23.5");

    @Getter
    private final String degree;
}
