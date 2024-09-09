package org.example.decomposedemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform