package matheusrodrigues.androidapps.filmes.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import matheusrodrigues.androidapps.filmes.databinding.FragmentSearchFilmesBinding
import matheusrodrigues.androidapps.filmes.ui.base.BaseFragment

@AndroidEntryPoint
class SearchFilmesFragment : BaseFragment<FragmentSearchFilmesBinding, SearchFilmesViewModel>() {
    override val viewModel: SearchFilmesViewModel by viewModels()


    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchFilmesBinding = FragmentSearchFilmesBinding.inflate(inflater, container, false)

}