package fr.isima.controller

import fr.isima.service.fizzBuzz
import fr.isima.service.plainText
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/fizzBuzz")
class FizzBuzzController {

    @GetMapping(params = ["num"], produces = ["text/plain"], consumes = ["*"])
    @ResponseBody
    fun fizzBuzz(@RequestParam("num") num: Int) = num.fizzBuzz

    @GetMapping(params = ["start", "end"], produces = ["text/plain"], consumes = ["*"])
    @ResponseBody
    fun fizzBuzzAll(@RequestParam("start") start: Int, @RequestParam("end") end: Int) = (start..end).fizzBuzz.plainText
}
