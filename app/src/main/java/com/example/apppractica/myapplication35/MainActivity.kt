package com.example.apppractica.myapplication35

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


private operator fun TextView.invoke(value: () -> Unit) {

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val palabra1:TextView
        val palabra2:TextView
        val resultado:TextView
        val button:Button


        palabra1=findViewById(R.id.palabra1)
        palabra2=findViewById(R.id.palabra2)
        resultado=findViewById(R.id.resultado)
        button=findViewById(R.id.button)
        button.setOnClickListener{
            if(palabra1==palabra2){
                  resultado.text=("Son iguales")
            }
            else{
                resultado.text=("Son distintas")
            }

        }
    }
}