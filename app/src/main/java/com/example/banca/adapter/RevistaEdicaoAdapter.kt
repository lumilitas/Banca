package com.example.banca.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.banca.R
import com.example.banca.model.joinclasses.RevistaEdicao

class RevistaEdicaoAdapter
internal constructor(context: Context) :
        RecyclerView.Adapter<RevistaEdicaoAdapter.RevistaEdicaoViewHolder>() {

    private var revistaEdicao = emptyList<RevistaEdicao>()
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    inner class RevistaEdicaoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val coluna1 : TextView = itemView.findViewById(R.id.campo1)
        val coluna2 : TextView = itemView.findViewById(R.id.campo2)
        val coluna3 : TextView = itemView.findViewById(R.id.campo3)
        val coluna4 : TextView = itemView.findViewById(R.id.campo4)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RevistaEdicaoViewHolder {
        val layoutInflater = inflater.inflate(R.layout.view_holder, parent, false)
        return RevistaEdicaoViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int = revistaEdicao.size

    override fun onBindViewHolder(holder: RevistaEdicaoViewHolder, position: Int) {

    }

    fun setList(revistaEdicao: List<RevistaEdicao>) {
        this.revistaEdicao = revistaEdicao
        notifyDataSetChanged()
    }
}