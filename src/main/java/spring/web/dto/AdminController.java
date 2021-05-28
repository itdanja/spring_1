package spring.web.dto;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import spring.service.CardService;

@Controller
@RequiredArgsConstructor
public class AdminController {

    private final CardService cardService;


    @GetMapping("/adminpage")
    public String adminpage(){
        return "adminpage";
    }


}
