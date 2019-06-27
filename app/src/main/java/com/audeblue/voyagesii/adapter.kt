package com.audeblue.voyagesii


import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.main_recycler_view.view.*


class MainVoyageAdapter(private var voyages: List<Travel>) :
    RecyclerView.Adapter<MainVoyageAdapter.VoyageViewHolder>() {


    override fun onBindViewHolder(holder: VoyageViewHolder, position: Int) {
        holder.bind(voyages.get(position))
        Log.i("ADAPTER", "I WAS CREATEd")

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VoyageViewHolder {

        return VoyageViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.main_recycler_view,
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return voyages.size
    }

    fun setVoyages(voyages: List<Travel>) {
        this.voyages = voyages
    }


    class VoyageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Travel) {

            itemView.txvTitre.text = item.title
            Log.i("ADAPTER", item.title)
            itemView.txtDate.text = item.date.toString()
            itemView.txvLieu.text = item.place
        }
    }

}

