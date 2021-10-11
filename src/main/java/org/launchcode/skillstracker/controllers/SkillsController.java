package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
   public  String skillsTracker() {
       return "<html>" +
               "<head>" + "<body>" +
               "<h1>Skills Tracker</h1>" +
               "<ol>" +
               "<li>1. Java</li>" +
               "<li>2. C++</li>" +
               "<li>3. C#</li>" +
               "</ol>" +
               "</body>" +
               "</head>" +
               "</html>";
   }

   @GetMapping
   @ResponseBody
   public  String favLanguageForm(){
       String skills =  "<html>" + "<body>" +
               "<form method='post'>" +
               "<label>Name: </label>" + "<input type = 'text' name='Name'>" + "<br>" +
               "<label>My favorite language: </label>" + "<select name='favoriteLanguage'>" +
               "<option value= 'java'> Java</option>" + "<option value= 'javascript'> JavaScript</option>" +
               "<option value= 'python'> Python</option>" + "</select>" + "<br>" +

               "<label>My 2nd favorite language: " + "<select name='secondFavoriteLanguage'>" +
               "<option value= 'java'> Java</option>" + "<option value= 'javascript'> JavaScript</option>" +
               "<option value= 'python'> Python</option>" + "</label>" + "</select>" + "<br>" +

               "<label>My 3rd favorite language: </label>" + "<select name='thirdFavoriteLanguage'>" +
               "<option value= 'java'> Java</option>" + "<option value= 'javascript'> JavaScript</option>" +
               "<option value= 'python'> Python</option>" + "</select>" + "<br>" +
               "<input type = 'submit'>" + "</form>" +
               "</body>" + "</html>";
       return skills;
       }


   @PostMapping(value="form")
    @ResponseBody
    public  String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
       return "<h1>" + name + "</h1>" +
               "<ol>" +
               "<li>" + firstChoice + "</li>" +
               "<li>" + secondChoice + "</li>" +
               "<li>" + thirdChoice + "</li>" +
               "</ol>";


   }

   @GetMapping(value = "hello")
   @ResponseBody
   public String helloForm(){
       return "<form method='get' action= '/hello2'" +
               "<Name: <br>" +
               "<input type = 'text' name = 'name' /><br><br>" +
               "<input type = 'submit' value = 'Submit' />" +
               "</form>";
   }



}
