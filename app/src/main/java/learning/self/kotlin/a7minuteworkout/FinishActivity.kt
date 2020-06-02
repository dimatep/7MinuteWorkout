package learning.self.kotlin.a7minuteworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

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
    }
}
