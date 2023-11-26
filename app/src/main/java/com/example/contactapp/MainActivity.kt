package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import com.example.contactapp.model.Contact

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.new_contact_menu -> {
                val navController = findNavController(R.id.nav_host_fragment)
                navController.navigate(R.id.nav_new_contact)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    companion object {
        val contactList: MutableList<Contact> = mutableListOf<Contact>(
            Contact("Josefina Lehner", "111-111-1111", "JL@gmail.com", 1),
            Contact("Stuart Vandervort II", "012-345-6789", "SV@example.com", 2),
            Contact("Madiison Russel", "987-654-3210", "MR@example.com", 3),
            Contact("Halie Morar II", "111-222-3333", "HM@example.com", 4),
            Contact("Karelle Simonis", "999-888-7777", "KS@example.com", 5),
            Contact("Hannal Welch", "444-333-2222", "HW@example.com", 6),
            Contact("Fanny Frami", "777-666-5555", "FF@example.com", 7),
            Contact("Elfreinda Wisozk", "333-444-5555", "EW@example.com", 8),
            Contact("Donald Knuth", "666-555-4444", "donald@example.com", 9),
            Contact("Grace Murray Hopper", "222-333-4444", "grace.murray@example.com", 10)
        )
    }
}