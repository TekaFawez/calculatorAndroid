package eniso.IA21.tp1Fawez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_authentication.*
import java.text.DateFormat
import java.util.*

class AuthenticationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)
        afficher_date()
        UpdateID.setOnClickListener{
    afficher_date()
}
        SignInID.setOnClickListener {
            val login = TextLogin.text.toString()
            val  pass = TextPassword.text.toString()
            if(pass=="PW$login"){
                Toast.makeText(this,"données correct",Toast.LENGTH_LONG).show()
                val i = Intent(this,ComputeActivity::class.java)
                startActivity(i) ;
            } else {
                Toast.makeText(this,"données eronnées",Toast.LENGTH_LONG).show()
            }
        }

    }
    fun afficher_date (){
        val d = Date()
        val df= DateFormat.getDateInstance(DateFormat.LONG)
        val fd= df.format(d)

        val tf = DateFormat.getTimeInstance(DateFormat.LONG)
        val ft=tf.format(d)
        DateID.text=fd +"\n"+ft

    }
}