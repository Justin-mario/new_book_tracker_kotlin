package com.booktracker.booktracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookTrackerApplication

fun main(args: Array<String>) {
    runApplication<BookTrackerApplication>(*args)
}
