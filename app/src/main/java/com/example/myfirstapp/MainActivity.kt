package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // Initialize animal objects
        val dog = Animal(R.drawable.dog, "Dog", "This is a dog. Dogs are great pets.They are loyal and playful and can be trained to do tricks.They have an incredible sense of smell and are often used for search and rescue, hunting, and detection work.", "dog")
        val cat = Animal(R.drawable.cat, "Cat", "This is a cat. Cats are independent and curious creatures. They make great companions for those who appreciate their unique personalities.", "cat")
        val rabbit = Animal(R.drawable.rabbit, "Rabbit", "This is a rabbit. Rabbits are gentle and social animals. They require a lot of care and attention, but can make wonderful pets for those who are willing to put in the effort.", "rabbit")

        // Set views and listeners
        setAnimalView(dog, R.id.dogImgView, R.id.dogNameView, R.id.dogDescView, R.id.dogBtn)
        setAnimalView(cat, R.id.catImgView, R.id.catNameView, R.id.catDescView, R.id.catBtn)
        setAnimalView(rabbit, R.id.rabbitImgView, R.id.rabbitNameView, R.id.rabbitDescView, R.id.rabbitBtn)
    }

    private fun setAnimalView(animal: Animal, imgViewId: Int, nameViewId: Int, descViewId: Int, btnId: Int) {
        val imgView: ImageView = findViewById(imgViewId)
        val nameView: TextView = findViewById(nameViewId)
        val descView: TextView = findViewById(descViewId)
        val btn: Button = findViewById(btnId)

        imgView.setImageResource(animal.image)
        nameView.text = animal.name
        
        btn.setOnClickListener {
            val intent = Intent(this@MainActivity, AnimalActivity::class.java)
            intent.putExtra("animal", animal)
            startActivity(intent)
        }
    }
}
