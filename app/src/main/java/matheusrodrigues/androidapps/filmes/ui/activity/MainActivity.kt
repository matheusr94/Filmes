package matheusrodrigues.androidapps.filmes.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import matheusrodrigues.androidapps.filmes.R
import matheusrodrigues.androidapps.filmes.data.api.ServiceApi
import matheusrodrigues.androidapps.filmes.data.model.filme.SearchReponse
import matheusrodrigues.androidapps.filmes.databinding.ActivityMainBinding
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var navHostFragment: NavHostFragment
    private lateinit var binding: ActivityMainBinding
    @Inject lateinit var serviceApi: ServiceApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews(binding)

        lifecycleScope.launchWhenCreated {
            val search: SearchReponse? = serviceApi.getMovies("movie","Batman").body()
            Log.d("XXX", "Lista " + search.toString())
        }
    }

    private fun initViews(binding: ActivityMainBinding) {
        navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavigation.apply {
            setupWithNavController(navController)
            setOnNavigationItemReselectedListener {  }
        }
    }
}