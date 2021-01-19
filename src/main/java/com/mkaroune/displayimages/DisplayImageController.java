package com.mkaroune.displayimages;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class DisplayImageController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "displayImage";
    }
}
