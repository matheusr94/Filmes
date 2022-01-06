package matheusrodrigues.androidapps.filmes.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import matheusrodrigues.androidapps.filmes.data.model.filme.FilmeModel
import matheusrodrigues.androidapps.filmes.databinding.ItemFilmeBinding

class FilmesAdapter : RecyclerView.Adapter<FilmesAdapter.FilmesViewHolder>() {

    inner class FilmesViewHolder(val binding: ItemFilmeBinding): RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<FilmeModel>(){
        override fun areItemsTheSame(oldItem: FilmeModel, newItem: FilmeModel): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

        override fun areContentsTheSame(oldItem: FilmeModel, newItem: FilmeModel): Boolean {
            return oldItem.imdbID == newItem.imdbID && oldItem.title == newItem.title &&
                    oldItem.year == newItem.year && oldItem.country == newItem.country &&
                    oldItem.director == newItem.director && oldItem.genre == newItem.genre
        }

    }

    private val differ = AsyncListDiffer(this, differCallback)

    var filmes: List<FilmeModel>
        get() = differ.currentList
        set(value) = differ.submitList(value)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmesViewHolder {
        return FilmesViewHolder(
            ItemFilmeBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int = filmes.size

    override fun onBindViewHolder(holder: FilmesViewHolder, position: Int) {
        val filme = filmes[position]
        holder.binding.apply {
            tvNameFilme.text = filme.title
            tvRating.text = filme.rated
            tvType.text = filme.type
            tvYear.text = filme.year
            tvRuntime.text = filme.runtime
            tvGenre.text = filme.genre
        }
    }


}