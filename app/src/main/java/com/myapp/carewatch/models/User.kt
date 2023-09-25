package com.myapp.carewatch.models

import com.myapp.carewatch.R

data class User(
    var id: String = "",
    var name: String = "",
    var bio: String = "",
    var avatar: Int = R.drawable.doctor_avatar_1,
    var isDoctor: Boolean = true,
    var medicineBranch: String? = null,
    var startTime: Long? = null,
    var endTime: Long? = null,
    var starCount: Float? = null
)