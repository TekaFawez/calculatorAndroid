package eniso.IA21.tp1Fawez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_compute.*

class ComputeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compute)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId){
                SumButton.id ->{
                    val1ID.text="value1"
                    editVal1.hint="value1"
                    val1ID.visibility=View.VISIBLE;
                    editVal1.visibility=View.VISIBLE
                    Value2ID.visibility=View.VISIBLE
                    editVal2.visibility=View.VISIBLE
                }
                SquraButton.id->{
                    Value2ID.visibility=View.INVISIBLE
                    editVal2.visibility=View.INVISIBLE
                    val1ID.visibility=View.VISIBLE
                    editVal1.visibility=View.VISIBLE
                    val1ID.text="Value"
                    editVal1.hint="Value"
                }
            }
        }
        calculID.setOnClickListener {
            if (SumButton.isChecked){
                val a = editVal1.text.toString().toInt()
                val b = editVal2.text.toString().toInt()

                resultID.text="$(a+b)"
            }
            else if(SquraButton.isChecked){
                val r=editVal1.text.toString().toInt()
                resultID.text="$(r*r)"
            }
            else{
                Toast.makeText(this,"choisir une operation",Toast.LENGTH_LONG).show()
            }
        }
    }
}