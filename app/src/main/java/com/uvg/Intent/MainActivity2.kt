package com.uvg.Intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main2.*


//este se usara para la suma
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //val bundle = intent.extras
        //Toast.makeText(this,"valor2",Toast.LENGTH_SHORT).show()
        //if(bundle != null){
            /*val texto = bundle.getString("valor")
            txtTexto.text = texto

            val valor2 = bundle.getString("valor2")
            Toast.makeText(this,valor2,Toast.LENGTH_SHORT).show()

            /*val valor3 = bundle.getString("valor3")
            if(valor3!=null){
                Toast.makeText(this,valor2,Toast.LENGTH_SHORT).show()
            }*/
            val valor3 = bundle.getString("valor3","no hay valor")*/


        //}

        btnRegresar.setOnClickListener {
            //obtener los dos string del edit text, convertirlos en un float y sumar y regresar el dato
            val data1: EditText = valor1
            val num1: String = data1.text.toString()
            val val1:Float =num1.toFloat()
            val data2: EditText = valor2
            val num2: String = data2.text.toString()
            val val2:Float = num2.toFloat()
            val suma: Float = val1 + val2
            val resultadoString: String = suma.toString()

            val intent: Intent = Intent(this,MainActivity::class.java)
            intent.putExtra("resultado",resultadoString)
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}