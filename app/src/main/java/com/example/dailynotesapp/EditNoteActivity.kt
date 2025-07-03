package com.example.dailynotesapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EditNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_note)

        findViewById<Button>(R.id.updateButton).setOnClickListener {
            finish()
        }
    }
}