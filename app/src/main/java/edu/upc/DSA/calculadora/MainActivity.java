package edu.upc.DSA.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView pantalla;
    float v1 = 0.0f; //inicializar valores
    float v2 = 0.0f;
    String operacion = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = findViewById(R.id.pantalla);
        pantalla.setText("0");
    }

    public void NumeroCero(View view) {
        if (pantalla.getText() == "0"){
            pantalla.setText("0"); //si teniamos un 0 ponemos un 0
        }
        else{
            pantalla.setText(pantalla.getText() + "0");// si tenemos otro numero antes, añadiremos el 0
        }

    }

    public void NumeroUno(View view) {
        if (pantalla.getText() == "0"){
            pantalla.setText("1"); //si teniamos un 0 ponemos un 1
        }
        else{
            pantalla.setText(pantalla.getText() + "1");// si tenemos otro numero antes, añadiremos el 1
        }
    }

    public void NumeroDos(View view) {
        if (pantalla.getText() == "0"){
            pantalla.setText("2"); //si teniamos un 0 ponemos un 2
        }
        else{
            pantalla.setText(pantalla.getText() + "2");// si tenemos otro numero antes, añadiremos el 2
        }
    }

    public void NumeroTres(View view) {
        if (pantalla.getText() == "0"){
            pantalla.setText("3"); //si teniamos un 0 ponemos un 3
        }
        else{
            pantalla.setText(pantalla.getText() + "3");// si tenemos otro numero antes, añadiremos el 3
        }
    }

    public void NumeroCuatro(View view) {
        if (pantalla.getText() == "0"){
            pantalla.setText("4"); //si teniamos un 0 ponemos un 4
        }
        else{
            pantalla.setText(pantalla.getText() + "4");// si tenemos otro numero antes, añadiremos el 4
        }
    }

    public void NumeroCinco(View view) {
        if (pantalla.getText() == "0"){
            pantalla.setText("5"); //si teniamos un 0 ponemos un 5
        }
        else{
            pantalla.setText(pantalla.getText() + "5");// si tenemos otro numero antes, añadiremos el 5
        }
    }

    public void NumeroSeis(View view) {
        if (pantalla.getText() == "0"){
            pantalla.setText("6"); //si teniamos un 0 ponemos un 6
        }
        else{
            pantalla.setText(pantalla.getText() + "6");// si tenemos otro numero antes, añadiremos el 6
        }
    }

    public void NumeroSiete(View view) {
        if (pantalla.getText() == "0"){
            pantalla.setText("7"); //si teniamos un 0 ponemos un 7
        }
        else{
            pantalla.setText(pantalla.getText() + "7");// si tenemos otro numero antes, añadiremos el 7
        }
    }

    public void NumeroOcho(View view) {
        if (pantalla.getText() == "0"){
            pantalla.setText("8"); //si teniamos un 0 ponemos un 8
        }
        else{
            pantalla.setText(pantalla.getText() + "8");// si tenemos otro numero antes, añadiremos el 8
        }
    }

    public void NumeroNueve(View view) {
        if (pantalla.getText() == "0"){
            pantalla.setText("9"); //si teniamos un 0 ponemos un 9
        }
        else{
            pantalla.setText(pantalla.getText() + "9");// si tenemos otro numero antes, añadiremos el 9
        }
    }

    public void Borrar(View view) {
        pantalla.setText("0"); //cuando la calculadora no este mostrando nada, va a mostrar un 0
        v1 = 0.0f; //igualar a cero para reinciar valores.
        v2 = 0.0f;
        operacion = ""; //reinciar con string vacio.
    }

    public void Dividir(View view) {

        v1 = Float.parseFloat(pantalla.getText().toString()); //guardar el primer numero que escribes en la variable 1
        operacion = "/"; //indicar la operacion que queremos realizar
        //pantalla.setText(pantalla.getText() + "/");
        pantalla.setText("0"); //ponemos la pantalla a 0 antes de poner otro valor

    }

    public void Multiplicar(View view) {
        v1 = Float.parseFloat(pantalla.getText().toString()); //guardar el primer numero que escribes en la variable 1
        operacion = "X"; //indicar la operacion que queremos realizar
        //pantalla.setText(pantalla.getText() + "/");
        pantalla.setText("0"); //ponemos la pantalla a 0 antes de poner otro valor
    }

    public void Sumar(View view) {
        v1 = Float.parseFloat(pantalla.getText().toString()); //guardar el primer numero que escribes en la variable 1
        operacion = "+"; //indicar la operacion que queremos realizar
        //pantalla.setText(pantalla.getText() + "/");
        pantalla.setText("0"); //ponemos la pantalla a 0 antes de poner otro valor

    }

    public void Restar(View view) {
        v1 = Float.parseFloat(pantalla.getText().toString()); //guardar el primer numero que escribes en la variable 1
        operacion = "-"; //indicar la operacion que queremos realizar
        //pantalla.setText(pantalla.getText() + "/");
        pantalla.setText("0"); //ponemos la pantalla a 0 antes de poner otro valor

    }

    public void Seno(View view) {
        v1 = Float.parseFloat(pantalla.getText().toString()); //guardar el primer numero que escribes en la variable 1
        operacion = "sen"; //indicar la operacion que queremos realizar
        //pantalla.setText(pantalla.getText() + "/");
        pantalla.setText("0"); //ponemos la pantalla a 0 antes de poner otro valor

    }

    public void Coseno(View view) {
        v1 = Float.parseFloat(pantalla.getText().toString()); //guardar el primer numero que escribes en la variable 1
        operacion = "cos"; //indicar la operacion que queremos realizar
        //pantalla.setText(pantalla.getText() + "/");
        pantalla.setText("0"); //ponemos la pantalla a 0 antes de poner otro valor

    }

    public void Tangente(View view) {
        v1 = Float.parseFloat(pantalla.getText().toString()); //guardar el primer numero que escribes en la variable 1
        operacion = "tan"; //indicar la operacion que queremos realizar
        //pantalla.setText(pantalla.getText() + "/");
        pantalla.setText("0"); //ponemos la pantalla a 0 antes de poner otro valor

    }

    public void Equals(View view) {
        v2 = Float.parseFloat(pantalla.getText().toString()); //guardar el primer numero que escribes en la variable 2
        if(operacion.equals("/")) { //si la operacion es una division...
            if (v2 == 0.0f) {  //como no podemos dividir entre 0, hacemos un if de "si el denominador es = 0...
                pantalla.setText("0");
                Toast.makeText(this, "syntax error", Toast.LENGTH_LONG).show();
            }
            else{
                float result = v1/v2;
                pantalla.setText(result + ""); //para convertirlo en string ponemos el string vacio ""
            }


        }

        else if (operacion.equals("X"))
        {
            float result = v1*v2;
            pantalla.setText(result + "");
        }

        else if (operacion.equals("+"))
        {
            float result = v1+v2;
            pantalla.setText(result + "");
        }

        else if (operacion.equals("-"))
        {
            float result = v1-v2;
            pantalla.setText(result + "");
        }

        else if (operacion.equals("sen"))
        {
            double result = Math.sin(v1);
            pantalla.setText(result + "");
        }
        else if (operacion.equals("cos"))
        {
            double result = Math.cos(v1);
            pantalla.setText(result + "");
        }
        else if (operacion.equals("tan"))
        {
            double result = Math.tan(v1);
            pantalla.setText(result + "");
        }
        v1 = 0.0f; //igualar a cero para reinciar valores.
        v2 = 0.0f;
        operacion = ""; //reinciar con string vacio.
    }
}