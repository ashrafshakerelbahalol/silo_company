package fee.gradproject.silocompany.wheatreport;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum StoredWheatType {
    LOCAL_WHEAT("نوع محلي واحد"),
    IMPORTED_WHEAT("نوع مستورد واحد"),
    LOCAL_WHEAT_MIX("مزيج من درجات القمح المحلي"),
    IMPORTED_WHEAT_MIX("مزيج من انواع القمح المستورد"),
    LOCAL_AND_IMPORTED_WHEAT_MIX("جميع انواع القمح");

    @Getter
    private final String name;
}
