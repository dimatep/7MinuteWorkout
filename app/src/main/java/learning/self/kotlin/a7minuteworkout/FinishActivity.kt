package learning.self.kotlin.a7minuteworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import java.text.SimpleDateFormat
import java.util.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        setSupportActionBar(toolbar_finish_activity)
        val actionBar = supportActionBar
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true)//set back button
        }

        //set the back btn on toolbar
        toolbar_finish_activity.setNavigationOnClickListener {
            onBackPressed() //go back to main activity, because I finished the exercise activity
        }


        finish_btn.setOnClickListener{
            finish() // finish this activity and go back to main activity
        }

        addDateToDB()
    }

    private fun addDateToDB(){
        val calendar = Calendar.getInstance()
        val dateTime = calendar.time
        val sdf = SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault())
        val date = sdf.format(dateTime)

        val dbHandler = SqliteOpenHelper(this,null)
        dbHandler.addDate(date)
    }
}
