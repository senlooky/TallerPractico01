package udb.sv.tallerpractico01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import udb.sv.tallerpractico01.view.IusuarioVista


abstract class PromedioActivity : AppCompatActivity(), IusuarioVista {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.op_promedio)


        val Nota1 =findViewById<EditText>(R.id.editTextNumber)
        val Nota2= findViewById<EditText>(R.id.editTextNumber2)
        val Nota3= findViewById<EditText>(R.id.editTextNumber3)
        var Nota4= findViewById<EditText>(R.id.editTextNumber4)
        var Nota5= findViewById<EditText>(R.id.editTextNumber5)

        var btnCalProm= findViewById<Button>(R.id.button)



        btnCalProm.setOnClickListener(View.OnClickListener {

            var notafinal =  ( Nota1.text.toString().toDouble() +Nota2.text.toString().toDouble() + Nota3.text.toString().toDouble()+Nota4.text.toString().toDouble() +Nota5.text.toString().toDouble()) /5

            if (notafinal>= 6 ){

                Toast.makeText(this, "Usted a aprobado con nota de ${notafinal}", Toast.LENGTH_SHORT).show()
            }
            else{

                Toast.makeText(this, "Usted a reprobado con nota de ${notafinal}", Toast.LENGTH_SHORT).show()

            }


        })



    }

    override fun nota1(double: Double) {
        TODO("Not yet implemented")
    }

    override fun nota2(double: Double) {
        TODO("Not yet implemented")
    }

    override fun nota3(double: Double) {
        TODO("Not yet implemented")
    }

    override fun nota4(double: Double) {
        TODO("Not yet implemented")
    }

    override fun nota5(double: Double) {
        TODO("Not yet implemented")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if(id == R.id.promedioOp) {
            Toast.makeText(this, "Selecciono la opcion para obtener promedios", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PromedioActivity::class.java)
            startActivity(intent)
        }
        if (id == R.id.salarioOp) {
            Toast.makeText(this, "Selecciono la opcion para obtener salario base", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SalarioActivity::class.java)
            startActivity(intent)
        }
        if (id == R.id.calculadoraOp){
            Toast.makeText(this, "Selecciono la opcion de calculadora", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CalculadoraActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)

    }

}

