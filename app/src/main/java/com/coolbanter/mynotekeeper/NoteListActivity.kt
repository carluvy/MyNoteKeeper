package com.coolbanter.mynotekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            val activityIntent = Intent(this, NoteActivity::class.java)
            startActivity(activityIntent)
        }

        list_items.layoutManager = LinearLayoutManager(this)
        list_items.adapter = NoteAdapter(this, DataManager.notes)



    }

    override fun onResume() {
        super.onResume()
        list_items.adapter?.notifyDataSetChanged()
    }
}