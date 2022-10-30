package com.example.yuconect

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        //Cambio del ACTION BAR STATUS
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAGS_CHANGED)
            window.statusBarColor = ContextCompat.getColor(this, R.color.ColorStatusBar)
        }

        //BUTTOM INTRO - INVITADO
        val bottom: AppCompatButton = findViewById(R.id.btnGuest)
        bottom.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            startActivity(intent)
            finish()

        }


    }
}
