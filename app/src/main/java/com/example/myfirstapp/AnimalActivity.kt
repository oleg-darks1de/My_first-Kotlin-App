package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AnimalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

        val animal = intent.getParcelableExtra<Animal>("animal")

        // Set views
        val animalImgView: ImageView = findViewById(R.id.animalImgView)
        val animalNameView: TextView = findViewById(R.id.animalNameView)
        val animalDescView: TextView = findViewById(R.id.animalDescView)

        animalImgView.setImageResource(animal?.image ?: 0)
        animalNameView.text = animal?.name
        animalDescView.text = when(animal?.type) {
            "dog" -> "This is a dog. Dogs are great pets.They are loyal and playful and can be trained to do tricks.They have an incredible sense of smell and are often used for search and rescue, hunting, and detection work."
            "cat" -> "This is a cat. Cats are independent and curious creatures. They make great companions for those who appreciate their unique personalities."
            "rabbit" -> "This is a rabbit. Rabbits are gentle and social animals. They require a lot of care and attention, but can make wonderful pets for those who are willing to put in the effort."
            else -> "This animal is not recognized."
        }
    }
}

