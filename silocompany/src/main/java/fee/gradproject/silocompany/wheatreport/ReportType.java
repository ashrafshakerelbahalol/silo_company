package fee.gradproject.silocompany.wheatreport;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ReportType {
    DAILY("يومي"),
    WEEKLY("أسبوعي"),
    MONTHLY("شهري"),
    QUARTERLY("ربع شهري"),
    YEARLY("سنوي");

    @Getter
    private final String name;
}
