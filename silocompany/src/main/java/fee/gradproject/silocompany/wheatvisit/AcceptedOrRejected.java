package fee.gradproject.silocompany.wheatvisit;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AcceptedOrRejected {
    ACCEPTED("مقبول"),
    REJECTED("مرفوض");

    @Getter
    private final String name;
}
