package matheusrodrigues.androidapps.filmes.ui.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import matheusrodrigues.androidapps.filmes.data.api.DataState
import matheusrodrigues.androidapps.filmes.data.model.filme.FilmeModel
import matheusrodrigues.androidapps.filmes.data.model.filme.FilmeResponse
import matheusrodrigues.androidapps.filmes.data.repository.RemoteRepository
import matheusrodrigues.androidapps.filmes.data.repository.Repository
import javax.inject.Inject

@HiltViewModel
class ListFilmesViewModel @Inject constructor(
    private val repository: RemoteRepository
) : ViewModel() {

    private val _list = MutableStateFlow<DataState<FilmeModel>>(DataState.Loading())
    val list: StateFlow<DataState<FilmeModel>> = _list

    /*init {
        fetch()
    }

    private fun fetch() = viewModelScope.launch {
        //safeFetch()
    }*/

    /*private suspend fun safeFetch() {

        try {
            val response = repository.
        }

    }*/

}