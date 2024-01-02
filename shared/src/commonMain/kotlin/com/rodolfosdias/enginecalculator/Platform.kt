package com.rodolfosdias.enginecalculator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform