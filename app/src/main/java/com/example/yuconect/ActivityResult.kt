package com.example.yuconect

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.yuconect.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class ActivityResult : AppCompatActivity() {
    //ViewBinding
    private lateinit var binding: ActivityMainBinding
    //Navigation
    private lateinit var toolbar: Toolbar
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var navController : NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Memu bar & drawer
        setContentView(R.layout.activity_result)
        bottomNav = findViewById(R.id.BottomNav)
        toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)
        drawerLayout = findViewById(R.id.DrawerLayout)
        navigationView = findViewById(R.id.NavigationView)
        navController = findNavController(R.id.FragmentContainerView)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.id_home_Fragment,
                R.id.id_service_Fragment,
                R.id.id_favorite_Fragment,
                R.id.id_collaborator_Fragment,
                R.id.id_promotions_Fragment,
                R.id.id_help_Fragment,
                R.id.id_settings_Fragment,
                R.id.id_logout_Fragment,

            ), drawerLayout
        )

        navigationView.setupWithNavController(navController)
        bottomNav.setupWithNavController(navController)
        setupActionBarWithNavController(navController, appBarConfiguration)

        //Quitar el fondo del los iconos
        navigationView.itemIconTintList = null
        bottomNav.itemIconTintList = null

        //Cambios del color del status bar
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAGS_CHANGED)
            window.statusBarColor = ContextCompat.getColor(this, R.color.ColorToolbar)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.FragmentContainerView)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}