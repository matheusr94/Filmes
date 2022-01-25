package matheusrodrigues.androidapps.filmes.ui.search

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import matheusrodrigues.androidapps.filmes.R
import matheusrodrigues.androidapps.filmes.databinding.FragmentSearchFilmesBinding
import matheusrodrigues.androidapps.filmes.domain.model.Filme
import matheusrodrigues.androidapps.filmes.ui.base.BaseFragment

@AndroidEntryPoint
class SearchFilmesFragment : BaseFragment<FragmentSearchFilmesBinding, SearchFilmesViewModel>() {
    override val viewModel: SearchFilmesViewModel by viewModels()


    val searchAdapter by lazy {
        SearchAdapter { view, filmeocurrency, position ->
            when (view.id) {
                R.id.mcv_item -> {
                    /*val directions =
                        SearchFilmesFragmentDirections.actionSearchFilmesFragmentToDetailsFilmesFragment(filmeocurrency)*/

                    Log.d("XXX", "Clicou no card")
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvSearchFilme.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = searchAdapter
        }

        updateListRecyclerView(null)

    }

    private fun updateListRecyclerView(list: List<Filme>?) {

        val filme1 = Filme("1", "Teste1", "2021", "120min", "Teste1", "...", "Teste1")
        val filme2 = Filme("2", "Teste2", "2022", "60min", "Teste2", "...", "Teste2")

        val listaFilmes = arrayListOf<Filme>()

        listaFilmes.add(filme1)
        listaFilmes.add(filme2)



        /*if (list.isNullOrEmpty()) {
            (activity as AppCompatActivity?)?.supportActionBar?.hide()
            return
        }*/
        searchAdapter.clearList()
        searchAdapter.submitList(listaFilmes as MutableList<Filme>?)
    }




    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchFilmesBinding = FragmentSearchFilmesBinding.inflate(inflater, container, false)

}