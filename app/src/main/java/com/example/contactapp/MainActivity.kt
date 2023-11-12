package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactapp.adapter.ContactAdapter
import com.example.contactapp.databinding.ActivityMainBinding
import com.example.contactapp.model.Contact

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var contactList = listOf<Contact>(
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

        binding.recyclerView.adapter = ContactAdapter(contactList)
        binding.recyclerView.setHasFixedSize(true)
    }
}