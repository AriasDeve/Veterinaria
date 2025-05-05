package com.example.veterinaria;

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.veterinaria.databinding.ActivityDashboardBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {
    //lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding=ActivityDashboardBinding.inflate(layoutInflater)
        //setContentView(binding.root)



        /*binding.menuNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.Inicio->fragmentos(Inicio())
                R.id.Clinica->fragmentos(Clinica())
                R.id.Tienda->fragmentos(Tienda())
                R.id.Mascota->fragmentos(Mascota())
                R.id.Perfil->fragmentos(Perfil())
        }
            true
        }*/

setContentView(R.layout.activity_dashboard)

        fragmentos(Inicio())

        var barra_menu=findViewById<BottomNavigationView>(R.id.menu_nav)

        barra_menu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.Inicio->fragmentos(Inicio())
                R.id.Clinica->fragmentos(Clinica())
                R.id.Tienda->fragmentos(Tienda())
                R.id.Mascota->fragmentos(Mascota())
                R.id.Perfil->fragmentos(Perfil())
            }
            true
        }

        }

    fun fragmentos(fragment:Fragment){
        var fragment_manager=supportFragmentManager
        var transaction=fragment_manager.beginTransaction()
        transaction.replace(R.id.frame_layout,fragment).commit()
    }

}