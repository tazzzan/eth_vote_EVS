package eth.vote.controller;

/**
 * Created by ilja on 21.12.16.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String homepage(){
        return "index.html";
    }
}