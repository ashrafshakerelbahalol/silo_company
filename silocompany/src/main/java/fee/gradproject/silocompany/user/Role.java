package fee.gradproject.silocompany.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public enum Role {
    مدير_عام(
            Set.of(
                    Permission.ADMIN_READ,
                    Permission.ADMIN_CREATE,
                    Permission.ADMIN_UPDATE,
                    Permission.ADMIN_DELETE,
                    Permission.MANAGER_CREATE,
                    Permission.MANAGER_DELETE,
                    Permission.MANAGER_UPDATE,
                    Permission.MANAGER_READ
            )
    ),
    مدير_تنفيذي(
            Set.of(
                    Permission.MANAGER_CREATE,
                    Permission.MANAGER_DELETE,
                    Permission.MANAGER_UPDATE,
                    Permission.MANAGER_READ
            )
    ),
    نائب_المدير_التنفيذي(Collections.emptySet()),
    حارس_البوابة(Collections.emptySet()),
    قسم_الميزان(Collections.emptySet()),
    قسم_الاستلام(Collections.emptySet())
    ;

    @Getter
    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities(){
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }

}
