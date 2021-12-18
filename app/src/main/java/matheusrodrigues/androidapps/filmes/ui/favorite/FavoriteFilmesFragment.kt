package matheusrodrigues.androidapps.filmes.ui.favorite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import matheusrodrigues.androidapps.filmes.databinding.FragmentFavoriteFilmesBinding
import matheusrodrigues.androidapps.filmes.ui.base.BaseFragment

@AndroidEntryPoint
class FavoriteFilmesFragment : BaseFragment<FragmentFavoriteFilmesBinding, FavoriteFilmesViewModel>() {
    override val viewModel: FavoriteFilmesViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFavoriteFilmesBinding = FragmentFavoriteFilmesBinding.inflate(inflater, container, false)

}