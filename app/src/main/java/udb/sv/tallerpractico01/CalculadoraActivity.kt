package udb.sv.tallerpractico01

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.op_calculadora)


        val num1 = findViewById<EditText>(R.id.editTextNumber)
        val num2 = findViewById<EditText>(R.id.editTextNumber2)
        val suma = findViewById<RadioButton>(R.id.radioButton)
        val resta = findViewById<RadioButton>(R.id.radioButton2)
        val divicion = findViewById<RadioButton>(R.id.radioButton3)
        val multiplicacion = findViewById<RadioButton>(R.id.radioButton4)
        val btncalcular = findViewById<Button>(R.id.button)
        val respuesta =findViewById<TextView>(R.id.textView)


        btncalcular.setOnClickListener{

            if (suma.isChecked)
                respuesta.text =( "${num1.text.toString().toInt() + num2.text.toString().toInt()}")

            if (resta.isChecked)
                respuesta.text =( "${num1.text.toString().toInt() - num2.text.toString().toInt()}")

            if (multiplicacion.isChecked)
                respuesta.text =( "${num1.text.toString().toInt() * num2.text.toString().toInt()}")

            if (divicion.isChecked)
                respuesta.text =( "${num1.text.toString().toInt() / num2.text.toString().toInt()}")





        }

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