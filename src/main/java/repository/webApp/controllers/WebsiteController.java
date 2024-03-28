package repository.webApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class WebsiteController {

    @GetMapping(path = "/movie")
    public String movie(){
        return "movie";
    }

    @GetMapping(path = "/room")
    public String room(){
        return "room";
    }

    @GetMapping(path = "/session")
    public String session(){
        return "session";
    }
}
