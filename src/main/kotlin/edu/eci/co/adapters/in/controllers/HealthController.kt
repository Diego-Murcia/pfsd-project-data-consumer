package edu.eci.co.adapters.`in`.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {
    @GetMapping("/")
    fun healt(): String {
        return "Application Running..."
    }
}