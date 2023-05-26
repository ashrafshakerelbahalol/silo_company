package fee.gradproject.silocompany.visit;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum VisitType {
    Equipment("زيارة معدات"),
    CompanyEquipment("زيارة معدات خاصة بالشركة"),
    IncomingLocalWheat("زيارة قمح محلي وارد"),
    IncomingImportedWheat("زيارة قمح محلي وارد"),
    OutgoingLocalWheat("زيارة قمح محلي وارد"),
    OutgoingImportedWheat("زيارة قمح محلي وارد"),
    CompanyWheat("زيارة قمح خاصة بالشركة"),
    Normal("أخري");

    @Getter
    private final String name;

}
