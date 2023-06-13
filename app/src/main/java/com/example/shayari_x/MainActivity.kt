package com.example.shayari_x

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shayari_x.Adapter.ShayariAdapter
import com.example.shayari_x.Database.ExternalDB
import com.example.shayari_x.Modal.ShayariModel
import com.example.shayari_x.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ShayariAdapter
    lateinit var DatabaseHelper : ExternalDB
    var shayarilist = ArrayList<ShayariModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        DatabaseHelper = ExternalDB(this,"Data.db",5)
        this.DatabaseHelper.CheckDb()
        shayarilist = DatabaseHelper.shyri as ArrayList<ShayariModel>

        adapter.setShyri(shayarilist)

        binding.rcvlist.layoutManager = LinearLayoutManager(this)
        binding.rcvlist.adapter = adapter



    }
}