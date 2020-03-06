package com.example.randomizer2

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultView = findViewById<TextView>(R.id.resultView)

        rollButton.setOnClickListener {
            var min = findViewById<EditText>(R.id.num).text.toString()
            var max = findViewById<EditText>(R.id.num2).text.toString()
            var minNum = Integer.parseInt(min)
            var maxNum = Integer.parseInt(max)
            val rand = Random().nextInt(maxNum - minNum + 1) + minNum
            resultView.text = rand.toString()

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
