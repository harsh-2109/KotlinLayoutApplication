package com.example.kotlinlayoutapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        snackbar_button.setOnClickListener { view ->
            Snackbar.make(view, "Your name is ${edit_text.text}", Snackbar.LENGTH_SHORT)
                .setAction("Click Me!") {
                    Toast.makeText(this,"Hello From Snackbar!",Toast.LENGTH_SHORT).show()
                }.show()

            Toast.makeText(this, "Your name is ${edit_text.text}", Toast.LENGTH_SHORT).show()
        }

        second_activity_button.setOnClickListener{
            val intent=Intent(this, ImageActivity::class.java)

            startActivity(intent)
        }

        concat_toast.setOnClickListener {
            val FirstName = first_name.text.toString()
            val LastName = last_name.text.toString()

            val fullName = getString(
                R.string.fullname,
                FirstName, LastName
            );
            Toast.makeText(this, fullName, Toast.LENGTH_SHORT).show();
        }

    }
}

