package com.myapp.carewatch.databases.real_time_database

import com.myapp.carewatch.models.User

interface GetCurrentUserInterface {

    fun onGetCurrentUser(user: User)
}