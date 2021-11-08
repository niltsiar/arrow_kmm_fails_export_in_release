package dev.niltsiar.arrow_fails_export_release.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dev.niltsiar.arrow_fails_export_release.Greeting

fun greet(): String {
    return Greeting().greeting().fold(
        ifLeft = { it },
        ifRight = { it }
    )
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
    }
}
