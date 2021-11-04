package com.rushana.myfirstapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val Tag = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alphabet = listOf<String>("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")
        println(alphabet.filterIndexed { index, String -> index % 2 != 0 })

        Log.d(Tag, "Унылая пора! Очей очарованье!")

        }

    override fun onStart() {
        super.onStart()
        Log.d(Tag, "Приятна мне твоя прощальная краса —")

    }

    override fun onResume() {
        super.onResume()
        Log.d(Tag, "Люблю я пышное природы увяданье,")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d (Tag, "И мглой волнистою покрыты небеса,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Tag, "В багрец и в золото одетые леса,")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Tag, "В их сенях ветра шум и свежее дыханье,")
    }

    override fun onRestart() {
        super.onRestart()

    }
    }





