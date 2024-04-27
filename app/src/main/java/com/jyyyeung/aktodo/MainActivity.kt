package com.jyyyeung.aktodo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jyyyeung.aktodo.ui.theme.AKTodoTheme

class MainActivity : ComponentActivity() {
    private lateinit var rvTodo: RecyclerView
    private lateinit var todoAdapter: TodoAdapter
    private lateinit var todoList: ArrayList<ItemTodo>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTodo = findViewById(R.id.rvTodo)
        todoList = ArrayList()

        val layoutManager = LinearLayoutManager(this)
        rvTodo.layoutManager = layoutManager

        // Create an instance of the adapter
        todoAdapter = TodoAdapter(todoList)
        // Set the adapter to be todoAdapter
        rvTodo.adapter = todoAdapter

        for (i in 1..10) {
            val title = "Todo Item $i"
            val description = "This is item $i"
            todoList.add(ItemTodo(title, description))
        }

        todoAdapter.notifyDataSetChanged()

    }
}
