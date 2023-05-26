package fee.gradproject.silocompany.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

// only admin can access these endpoints

@RestController
@RequestMapping("/api/admin")
@PreAuthorize("hasRole('مدير_عام')")
//@PreAuthorize("hasAnyRole('مدير_عام', 'مدير_تنفيذي')")
public class AdminController {

    @GetMapping
    @PreAuthorize("hasAnyAuthority('admin:read')")
    public String get(){
        return "GET:: admin controller";
    }

    @PostMapping
    @PreAuthorize("hasAnyAuthority('admin:create')")
    public String post(){
        return "POST:: admin controller";
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('admin:update')")
    public String put(){
        return "PUT:: admin controller";
    }

    @DeleteMapping
    @PreAuthorize("hasAnyAuthority('admin:delete')")
    public String delete(){
        return "DELETE:: admin controller";
    }

}
