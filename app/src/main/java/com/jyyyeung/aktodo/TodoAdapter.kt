package com.jyyyeung.aktodo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(private val todoList: ArrayList<ItemTodo>) :
    RecyclerView.Adapter<TodoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        // When the view holder is created,
        // create a new view "container" that inflates the layout from R.layout.item_todo to the ViewGroup, but do not bind it to the root view
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        // return the new view "container" as a view holder
        return TodoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        // When binded to ViewHolder, set the content in the View Holder to be content from the i th item
        holder.tvTodoTitle.text = todoList[position].todoTitle
        holder.tvTodoDescription.text = todoList[position].todoDescription
    }

    override fun getItemCount(): Int {
        return todoList.size
    }
}