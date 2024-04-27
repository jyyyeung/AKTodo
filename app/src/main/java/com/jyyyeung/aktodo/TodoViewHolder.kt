package com.jyyyeung.aktodo

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvTodoTitle: TextView = itemView.findViewById(R.id.tvTodoTitle)
    val tvTodoDescription: TextView = itemView.findViewById(R.id.tvTodoDescription)
}