package com.myapp.carewatch.screens.doctor

import com.myapp.carewatch.models.Request

interface ChatInterface {

    fun onRequestChanged(request: Request)

    fun onDeleteChat(requestId: String)

    fun onDoctorLeave(request: Request)

    fun onPatientDisabledChat()

}