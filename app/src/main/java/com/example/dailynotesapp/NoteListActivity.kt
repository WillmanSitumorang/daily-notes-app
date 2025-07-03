package com.example.dailynotesapp

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class NoteListActivity : AppCompatActivity() {
    private val dummyNotes = listOf("Catatan 1", "Catatan 2", "Catatan 3", "Catatan 4", "Catatan 5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)

        val listView = findViewById<ListView>(R.id.noteList)
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dummyNotes)

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, NoteDetailActivity::class.java)
            intent.putExtra("title", dummyNotes[position])
            startActivity(intent)
        }
    }
}