package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "<HTML>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h3>We have a few skills we would like to learn. Here is the list!</h3>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</HTMl>";
    }

    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST})
    public String skillFormPost(@RequestParam String name, @RequestParam String opt1, @RequestParam String opt2,
                                @RequestParam String opt3){
        return "<HTML>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>"+ opt1 + "</li>" +
                "<li>"+ opt2 + "</li>" +
                "<li>"+ opt3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</HTMl>";
    }


    @GetMapping("form")
    public String skillForm(){
        return "<HTML>" +
                "<body>" +
                "<form action='/' method='post'>" +
                "<label>Name</label><br>" +
                "<input type='text' name='name'>" +
                "<br>" +
                "<label>My favorite Language</label><br>" +
                "<select name='opt1'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select><br>" +
                "<label>My 2nd favorite Language</label><br>" +
                "<select name='opt2'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select><br>" +
                "<label>My 3rd favorite Language</label><br>" +
                "<select name='opt3'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select><br>" +
                "<input type='Submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</HTML>";
    }
}
