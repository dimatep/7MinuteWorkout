package learning.self.kotlin.a7minuteworkout

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_history_row.view.*

class HistoryAdapter (val context: Context,val items : ArrayList<String>) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val llHistory = view.history_item_main_ll
        val tvItem = view.date_item_tv
        val tvPosition = view.position_tv
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater
                .from(context)
                .inflate(
                    R.layout.item_history_row,
                    parent,
                    false
                )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val date: String = items.get(position)

        holder.tvPosition.text = (position + 1).toString()
        holder.tvItem.text = date

        //change background colors
        if(position % 2 ==0){
            holder.llHistory.setBackgroundColor(
                Color.parseColor("#EBEBEB")
            )
        }else{
            holder.llHistory.setBackgroundColor(
                Color.parseColor("#FFFFFF")
            )
        }
    }
}