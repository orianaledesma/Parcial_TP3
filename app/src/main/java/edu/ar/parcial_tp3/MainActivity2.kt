package edu.ar.parcial_tp3

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView


class MainActivity2 : AppCompatActivity() {

    private lateinit var nav_host_fragment: NavHostFragment
    private lateinit var drawer_layout_id: DrawerLayout
    private lateinit var nav_view_id: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Busco y guardo la referencia a las vistas en variables
        drawer_layout_id = findViewById(R.id.drawer_layout)
        nav_view_id = findViewById(R.id.nav_view_id)
        nav_host_fragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        setupDrawerLayout()
    }

    private fun setupDrawerLayout() {

        val navController = nav_host_fragment.navController
        // Vinculo la navegación del drawer con la del graph
        nav_view_id.setupWithNavController(navController)

        // Configuro la appbar para que muestre el icono del drawer y actualice el titulo
        NavigationUI.setupActionBarWithNavController(this, navController, drawer_layout_id)

        // Listener para cuando se realiza la navegacion
      //  navController.addOnDestinationChangedListener { _, _, _ ->
            // Aca le digo que quiero que mi icono izquierdo de la appbar sea el del drawer
         //   supportActionBar?.setHomeAsUpIndicator(R.drawable.hamburger)
        }
    }


    // Habilita la navegación desde la appbar con el drawer. Deja
   override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(nav_host_fragment.navController, drawer_layout_id)
    }

    // Forzar el drawer a que se abra siempre
    //override fun onSupportNavigateUp(): Boolean {
//  if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
  //          drawer_layout.closeDrawer(GravityCompat.START)
    //    } else {
      //      drawer_layout.openDrawer(GravityCompat.START)
        //}

        //return false
    //}


//}