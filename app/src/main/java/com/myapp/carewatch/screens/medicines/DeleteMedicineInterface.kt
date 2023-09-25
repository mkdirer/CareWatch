package com.myapp.carewatch.screens.medicines

import com.myapp.carewatch.databases.medicines_database.Medicine

interface DeleteMedicineInterface {

    fun showDeleteDialog(medicine:Medicine)

    fun deleteMedicine(medicine:Medicine)

}