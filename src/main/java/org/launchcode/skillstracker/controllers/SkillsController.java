package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping("")
    @ResponseBody
    public String Skills() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages</h2>" +
                "<ol>" +
                "<li>HTML</li>" +
                "<li>CSS</li>" +
                "<li>JavaScript</li>" +
                "<li>PHP</li>" +
                "<li>SQL</li>" +
                "<li>Java</li>" +
                "</ol>";
    }
    @GetMapping("form")
    @ResponseBody
    public String Form() {
        return "<form method='post' action='/submit'>" +
                "<label for='name'>Name:</label>" +
                "<input type='text' id='name' name='name'>" +
                "<label for='lang1'>My favorite language:</label>" +
                "<select id='lang1' name='lang1'>" +
                    "<option value='HTML'>HTML</option>" +
                    "<option value='CSS'>CSS</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='PHP'>PHP</option>" +
                    "<option value='SQL'>SQL</option>" +
                    "<option value='Java'>Java</option>" +
                "</select>" +
                "<label for='lang2'>My second favorite language:</label>" +
                "<select id='lang2' name='lang2'>" +
                    "<option value='HTML'>HTML</option>" +
                    "<option value='CSS'>CSS</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='PHP'>PHP</option>" +
                    "<option value='SQL'>SQL</option>" +
                    "<option value='Java'>Java</option>" +
                "</select>" +
                "<label for='lang3'>My third favorite language:</label>" +
                "<select id='lang3' name='lang3'>" +
                    "<option value='HTML'>HTML</option>" +
                    "<option value='CSS'>CSS</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='PHP'>PHP</option>" +
                    "<option value='SQL'>SQL</option>" +
                    "<option value='Java'>Java</option>" +
                "</select>" +
                "<input type='submit'>" +
                "</form>";
    }
    @PostMapping("submit")
    @ResponseBody
    public String Submit(@RequestParam String name, String lang1, String lang2, String lang3) {
        return "<h3>" + name + "</h3><br>" +
                "<ol>" +
                "<li>" + lang1 + "</li><br>" +
                "<li>" + lang2 + "</li><br>" +
                "<li>" + lang3 + "</li><br>" +
                "</ol>";
    }

}
