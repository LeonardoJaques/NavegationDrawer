package com.jaques.projetos.navegationdrawer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            enviarEmail()
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_principal,
                R.id.nav_servicos,
                R.id.nav_clientes,
                R.id.nav_contato,
                R.id.nav_sobre
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }


    fun enviarEmail(): Unit {

//        val celular = "tel: 11996352894"
//        val imagem = "https://mega.ibxk.com.br//2019/10/02/02143002377157.jpg"
//        val endereco = "https://www.google.com.br/maps/place/Parque+Ari+Barroso+-+Penha+Circular,+Rio+de+Janeiro+-+RJ,+21070-000/@-22.8393085,-43.2881164,18z/data=!3m1!4b1!4m5!3m4!1s0x997b9c8e2279b1:0x7dabdb4370acdab0!8m2!3d-22.8398257!4d-43.287501"
        //        val intent = Intent(Intent.ACTION_DIAL, Uri.parse(celular))
//        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(imagem))
//        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(endereco))
        val intent = Intent(Intent.ACTION_SEND)
        intent.putExtra( Intent.EXTRA_EMAIL, arrayOf("atendimento@atmconsultoria.com.br"))
        intent.putExtra( Intent.EXTRA_SUBJECT, "contato pelo app")
        intent.putExtra( Intent.EXTRA_TEXT, "Mensagem Automatica")

        //mine types
        intent.setType("message/rfc822")

        startActivity(Intent.createChooser(intent,"Compartilhar"))

    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


}
