package learning.self.kotlin.a7minuteworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_history.*

class HistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        setSupportActionBar(toolbar_history_activity)
        val actionBar = supportActionBar
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true)//set back button
        }

        // set back button action
        toolbar_history_activity.setNavigationOnClickListener {
            onBackPressed()
        }

        getAllCompletedDates()
    }

    private fun getAllCompletedDates(){
        val dbHandler = SqliteOpenHelper(this,null)
        val allCompletedDatesList = dbHandler.getAllCompletedDatesList()

        if(allCompletedDatesList.isEmpty()){
            history_rv.visibility = View.GONE
            no_data_tv.visibility = View.VISIBLE
        }else{
            history_rv.visibility = View.VISIBLE
            no_data_tv.visibility = View.GONE

            // SET ADAPTER
            history_rv.layoutManager = LinearLayoutManager(this)
            val historyAdapter = HistoryAdapter(this,allCompletedDatesList)
            history_rv.adapter = historyAdapter
        }
    }
}
