package fee.gradproject.silocompany.affiliatedentity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AffiliatedEntityType {
    CollectionCenter("مراكز التجميع"),
    Hangar("الهناجر"),
    WheatOwner("تاجر قمح محلي"),
    AnotherSilo("صومعة أخري"),
    ShippingPort("ميناء"),
    Mill("مطحن"),
    others("أخري");

    @Getter
    private final String name;

}
