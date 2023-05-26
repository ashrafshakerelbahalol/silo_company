package fee.gradproject.silocompany.demo;

import org.springframework.web.bind.annotation.*;

//manager and admin can access these endpoints

@RestController
@RequestMapping("/api/management")
public class ManagementController {

    @GetMapping
    public String get(){
        return "GET:: management controller";
    }

    @PostMapping
    public String post(){
        return "POST:: management controller";
    }

    @PutMapping
    public String put(){
        return "PUT:: management controller";
    }

    @DeleteMapping
    public String delete(){
        return "DELETE:: management controller";
    }

}
