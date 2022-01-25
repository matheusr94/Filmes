package matheusrodrigues.androidapps.filmes.ui.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import matheusrodrigues.androidapps.filmes.databinding.ItemFilmeBinding
import matheusrodrigues.androidapps.filmes.domain.model.Filme

class SearchAdapter(
    private val onClickListener: (view: View, filme: Filme, position: Int) -> Unit
) : ListAdapter<Filme, SearchAdapter.FilmeViewHolder>(SearchAdapter) {

    private val list = arrayListOf<Filme>()

    private companion object : DiffUtil.ItemCallback<Filme>() {
        override fun areItemsTheSame(oldItem: Filme, newItem: Filme): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Filme, newItem: Filme): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val biding = ItemFilmeBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return FilmeViewHolder(biding, onClickListener)
    }

    override fun onBindViewHolder(holderFilme: FilmeViewHolder, position: Int) {
        val filme = list[position]
        holderFilme.viewBindign(filme)
    }

    override fun getItemCount() = list.size


    inner class FilmeViewHolder(
        private val binding: ItemFilmeBinding,
        private val onClickListener: (view: View, filme: Filme, position: Int) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        fun viewBindign(filme: Filme) {
            binding.apply {
                tvNameFilme.text = filme.title
                tvType.text = filme.type
                tvYear.text = filme.year
                tvRuntime.text = filme.runtime
                tvGenre.text = filme.genre
            }
        }

    }

    override fun submitList(list: MutableList<Filme>?) {
        super.submitList(list?.distinct())
        list.let {
            it?.let { it1 -> this.list.addAll(it1) }
        }
    }

    fun clearList(){
        list.clear()
    }

    fun getList() = list

    fun removeItemList(position: Int) {
        list.removeAt(position)
        notifyItemRemoved(position)
    }

    fun modifyItemList(position: Int, filme: Filme) {
        list[position] = filme
        notifyItemChanged(position)
    }

}