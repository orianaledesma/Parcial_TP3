package edu.ar.parcial_tp3

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NO_HISTORY
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.view.ActionMode
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var submit: Button
    lateinit var textView: TextView
    lateinit var textInputEditText: TextInputEditText
    lateinit var editText2: TextInputEditText
    lateinit var textView2: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        textInputEditText = findViewById(R.id.textInputEditText)
        editText2 = findViewById(R.id.editText2)
        textView2 = findViewById(R.id.textView2)

    }

    override fun onStart() {
        super.onStart()
        submit = findViewById(R.id.button)

        // txtEmail = findViewById(R.id.txtEmail)

        submit.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(FLAG_ACTIVITY_NO_HISTORY)
            startActivity(intent)
            finish()
        }

        // txtEmail.setText("test")
    }
}
