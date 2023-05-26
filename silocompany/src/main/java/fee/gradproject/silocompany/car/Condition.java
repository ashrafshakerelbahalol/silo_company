package fee.gradproject.silocompany.car;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Condition {
    Good("جيد"),
    Bad("سئ");

    @Getter
    private final String name;

}
