package com.example.alert_dialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onBackPressed() {
        val alert_dialog  = AlertDialog.Builder(this)
        alert_dialog.setTitle(getString(R.string.dialog_title))
        alert_dialog.setMessage(getString(R.string.leave_meassge))
        alert_dialog.setPositiveButton(getString(R.string.postitive_action_title)
        ) { dialog, which ->
            dialog.dismiss()
            finish()
        }
        alert_dialog.setNegativeButton(getString(R.string.no) )
        { dialog, which ->
            dialog.dismiss()
        }
        alert_dialog.setCancelable(false)
        alert_dialog.create().show()
    }
}