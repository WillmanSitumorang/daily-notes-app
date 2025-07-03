package com.example.dailynotesapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NoteDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_detail)

        val title = intent.getStringExtra("title") ?: "Untitled"
        findViewById<TextView>(R.id.titleView).text = title
        findViewById<TextView>(R.id.contentView).text = "Isi dari $title"
    }
}