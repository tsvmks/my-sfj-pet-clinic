package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tsvetkov
 * @created 2020-10-11
 */
@Controller
public class IndexController {
    @RequestMapping({"", "/","index", "index.html"})
    public String index(){
        return "index";
    }
}
