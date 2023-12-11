package com.example.pocketwarehouse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform