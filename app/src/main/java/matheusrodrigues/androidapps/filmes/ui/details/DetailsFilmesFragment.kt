package matheusrodrigues.androidapps.filmes.ui.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import matheusrodrigues.androidapps.filmes.databinding.FragmentDetailsFilmesBinding
import matheusrodrigues.androidapps.filmes.ui.base.BaseFragment

@AndroidEntryPoint
class DetailsFilmesFragment : BaseFragment<FragmentDetailsFilmesBinding, DetailsFilmesViewModel>(){
    override val viewModel: DetailsFilmesViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailsFilmesBinding = FragmentDetailsFilmesBinding.inflate(inflater, container, false)

}