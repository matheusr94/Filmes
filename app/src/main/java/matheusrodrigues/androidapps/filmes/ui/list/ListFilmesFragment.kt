package matheusrodrigues.androidapps.filmes.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import matheusrodrigues.androidapps.filmes.databinding.FragmentListFilmesBinding
import matheusrodrigues.androidapps.filmes.ui.base.BaseFragment

@AndroidEntryPoint
class ListFilmesFragment : BaseFragment<FragmentListFilmesBinding, ListFilmesViewModel>(){
    override val viewModel: ListFilmesViewModel by viewModels()


    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentListFilmesBinding = FragmentListFilmesBinding.inflate(inflater, container, false)
}