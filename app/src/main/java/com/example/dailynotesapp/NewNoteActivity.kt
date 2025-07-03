package com.example.dailynotesapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NewNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_note)

        findViewById<Button>(R.id.saveButton).setOnClickListener {
            finish()
        }
    }
}