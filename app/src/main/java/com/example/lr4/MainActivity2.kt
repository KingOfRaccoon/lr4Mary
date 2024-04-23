package com.example.lr4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.lr4.databinding.ActivityMain2Binding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity2 : AppCompatActivity() {
    private val binding: ActivityMain2Binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.addButton.setOnClickListener {
            lifecycleScope.launch(Dispatchers.IO) {
                PuppyApp.database.puppyDao().addPuppy(
                    Puppy(
                        name = binding.editName.text.toString(),
                        desc = binding.editDesc.text.toString()
                    )
                )
            }
        }
    }
}