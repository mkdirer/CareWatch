package com.myapp.carewatch.screens.doctor

import com.myapp.carewatch.models.Request
import com.myapp.carewatch.models.User

interface AllDoctorsInterface {
    fun changeType(doctorType:String)

    fun chooseDoctor(doctor:User)

    fun onDoctorsDatabaseChanged(allDoctors: ArrayList<User>)

    fun onRequestsDatabaseChanged(allRequests: ArrayList<Request>)

    fun onRequestAccept(request: Request)

}