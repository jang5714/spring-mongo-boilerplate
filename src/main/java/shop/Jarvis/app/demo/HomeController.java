package shop.Jarvis.app.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return new SimpleDateFormat("yyyy-MM-ss aa hh:mm:ss").format(new Date());
    }
}
