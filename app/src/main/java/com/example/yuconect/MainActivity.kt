package com.example.yuconect

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.github.appintro.AppIntro2
import com.github.appintro.AppIntroCustomLayoutFragment

class MainActivity : AppIntro2() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setImmersiveMode()
        addSlide(AppIntroCustomLayoutFragment.newInstance(R.layout.activity_main))

        setImmersiveMode()
        addSlide(AppIntroCustomLayoutFragment.newInstance(R.layout.activity_carousell))

        setImmersiveMode()
        addSlide(AppIntroCustomLayoutFragment.newInstance(R.layout.activity_carousell_finish))


    }
    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        // Decide what to do when the user clicks on "Skip"
        val b = Intent(this, ActivityResult :: class.java)
        startActivity(b)
        finish()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        // Decide what to do when the user clicks on "Done"
        val a = Intent(this, ActivityResult :: class.java)
        startActivity(a)
        finish()
    }
}