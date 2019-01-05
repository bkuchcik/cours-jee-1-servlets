package fr.isima.controller;

import fr.isima.service.FizzBuzz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/fizzBuzz2")
public class FizzBuzzController {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @GetMapping(params = {"num"}, produces = "text/plain", consumes = "*")
    @ResponseBody
    public String fizzBuzz(@RequestParam("num") int num) {
        return fizzBuzz.fizzBuzz(num);
    }

    @GetMapping(params = {"start", "end"}, produces = "text/plain", consumes = "*")
    @ResponseBody
    public String fizzBuzzAll(@RequestParam("start") int start, @RequestParam("end") int end) {
        return fizzBuzz.fizzBuzzAll(start, end).toString();
    }
}
