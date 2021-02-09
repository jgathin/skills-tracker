package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class SkillsController {

    @PostMapping("form")
    @ResponseBody
    public String skillUpdate(@RequestParam String skill1, String skill2, String skill3,
                              String coder){

        String html =

                "<html>" +
                        "<body>" +
                        "<h1>"+coder+"</h1>" +
//
                        "<ol>"+

                        "<li>"+skill1+"</li>"+
                        "<li>"+skill2+"</li>"+
                        "<li>"+skill3+"</li>"+

                        "</ol>"+
                        "</body>" +
                        "</html>";

        return html;


    }

    @GetMapping
    @ResponseBody
    public String initialForm(){
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>"+
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>Javascript</li>" +
                        "<li>Swift</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }




@GetMapping("form")
@ResponseBody


public String selectForm() {

    String html =
            "<html>" +
                    "<body>" +
                    "<form method = 'post' action = '/form' id = 'skillform'>" +
                    "<label>Name:</label>" +
                    "<br>"+
                    "<input type = 'text' name = 'coder'/>" +
                    "<br>"+


                    "<label>My Favorite Language:</label>" +
                    "<br>"+
                    "<select id = 'skills' name = 'skill1' form = 'skillform' />" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'Javascript'>Javascript</option>" +
                    "<option value = 'C++'>C++</option>" +
                    "<option value = 'Python'>Python</option>" +
                    "<option value = 'Swift'>Swift</option>" +
                    "</select>" +
                    "<br>"+


                    "<label>My Second Favorite Language:</label>" +
                    "<br>"+
                    "<select id = 'skills' name = 'skill2' form = 'skillform' />" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'Javascript'>Javascript</option>" +
                    "<option value = 'C++'>C++</option>" +
                    "<option value = 'Python'>Python</option>" +
                    "<option value = 'Swift'>Swift</option>" +
                    "</select>" +
                    "<br>"+

                    "<label>My Third Favorite Language:</label>" +
                    "<br>"+
                    "<select id = 'skills' name = 'skill3' form = 'skillform' />" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'Javascript'>Javascript</option>" +
                    "<option value = 'C++'>C++</option>" +
                    "<option value = 'Python'>Python</option>" +
                    "<option value = 'Swift'>Swift</option>" +
                    "</select>" +

                    "<br>"+

                    "<input type = 'submit' value = 'Submit Me' />" +
                    "</form>" +
                    "</body>" +
                    "</html>";
        return html;
}






}