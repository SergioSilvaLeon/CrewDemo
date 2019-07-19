package com.nearsoft.CrewDemo.controller

import com.nearsoft.CrewDemo.dao.RestDao
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController(private val repository: RestDao) {

    @GetMapping("/{id}", produces = "application/json")
    fun getString(@PathVariable id: Int): String {
        return null
    }

}