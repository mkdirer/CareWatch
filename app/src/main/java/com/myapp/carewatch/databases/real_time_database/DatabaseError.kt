package com.myapp.carewatch.databases.real_time_database

import android.view.View

interface DatabaseError {
    //realtime database error
    fun errorHandled(errorMessage:String,view: View)
}