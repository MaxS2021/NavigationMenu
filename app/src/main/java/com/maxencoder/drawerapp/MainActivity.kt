package com.maxencoder.drawerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.maxencoder.drawerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.apply {
            navMenu.setNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.item1 -> {Toast.makeText(this@MainActivity, "Предмет 1_1", Toast.LENGTH_SHORT).show()}
                    R.id.item21 -> {Toast.makeText(this@MainActivity, "Предмет 2_1", Toast.LENGTH_SHORT).show()}
                    R.id.item2 -> {Toast.makeText(this@MainActivity, "Предмет 2_1", Toast.LENGTH_SHORT).show()}
                    R.id.item22 -> {Toast.makeText(this@MainActivity, "Предмет 2_2", Toast.LENGTH_SHORT).show()}
                }
                drawer.closeDrawer(GravityCompat.START)
                true
            }
            bOpen.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
        }

    }
}