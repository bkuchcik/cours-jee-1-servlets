package fr.isima.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.web.servlet.ServletComponentScan
import org.springframework.context.annotation.ComponentScan

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}

@EnableAutoConfiguration
@ComponentScan
@ServletComponentScan("fr.isima")
class Application
