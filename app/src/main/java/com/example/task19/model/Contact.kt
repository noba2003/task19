package com.example.task19.model

data class Contact (val name: String, val phoneNumber: String, val address: String)

// data
val contacts = listOf(
    Contact("Ahmed Ali", "+971501234567", "Dubai, UAE"),
    Contact("Sara Hussein", "+971502345678", "Abu Dhabi, UAE"),
    Contact("Omar Khalid", "+971503456789", "Sharjah, UAE"),
    Contact("Fatima Noor", "+971504567890", "Al Ain, UAE"),
    Contact("Mohammed Saleh", "+971505678901", "Ajman, UAE"),
    Contact("Noura Saeed", "+971506789012", "Ras Al Khaimah, UAE"),
    Contact("Hassan Youssef", "+971507890123", "Fujairah, UAE"),
    Contact("Layla Mansour", "+971508901234", "Dubai, UAE"),
    Contact("Ibrahim Ahmed", "+971509012345", "Abu Dhabi, UAE"),
    Contact("Aisha Kamal", "+971501112233", "Dubai, UAE"),
    Contact("Yousef Sami", "+971502223344", "Sharjah, UAE"),
    Contact("Hala Nabil", "+971503334455", "Ajman, UAE"),
    Contact("Mahmoud Tariq", "+971504445566", "Fujairah, UAE"),
    Contact("Khaled Jamal", "+971505556677", "Ras Al Khaimah, UAE"),
    Contact("Lina Omar", "+971506667788", "Abu Dhabi, UAE"),
    Contact("Nasser Hassan", "+971507778899", "Al Ain, UAE"),
    Contact("Salma Hisham", "+971508889900", "Dubai, UAE"),
    Contact("Tariq Faisal", "+971509990011", "Sharjah, UAE"),
    Contact("Zainab Fadi", "+971501010101", "Ajman, UAE"),
    Contact("Samir Bilal", "+971502020202", "Ras Al Khaimah, UAE")
)