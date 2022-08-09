package com.example.springbootdemo

import com.example.springbootdemo.format.FormatJsonToObject
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
@RestController
class SpringBootDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringBootDemoApplication>(*args)
    FormatJsonToObject.getJsonFromFile()
}

@GetMapping("/hello")
fun sayHello(@RequestParam(value = "myName", defaultValue = "World") name: String): String {

    return String.format("Hello %s!", name)
}