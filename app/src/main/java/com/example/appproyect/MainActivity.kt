package com.example.appproyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns

import android.widget.Button

import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Pattern


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {


    //utilizamos para validar que es una contraseña
    //public static final PASSWORD_PATTERN = Pattern.compile( ---en java----
     val PASSWORD_PATTERN = Pattern.compile(
        "^" + "(?=.*[0-9])" +
   "(?=.*[a-z])" + "(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$)" + ".{6,}" + "$"
    )

    //"^" +                   //at least 1 digit
    //"(?=.*[a-z])" +         //at least 1 lower case letter
    //"(?=.*[A-Z])" +         //at least 1 upper case letter
    //"(?=.*[a-zA-Z])" +      //any letter
    //"(?=.*[@#$%^&+=])" +    //at least 1 special character
    //"(?=\\S+$)" +           //no white spaces
    //".{6,}" +               //at least 6 characters






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Email = findViewById(R.id.txtEmail) as TextInputLayout
        val User = findViewById(R.id.txtUser) as TextInputLayout
        val Password = findViewById(R.id.txtPassword) as TextInputLayout
        val button = findViewById(R.id.BtnConfirmar) as Button


        button.setOnClickListener { (ValidarInputEmail(Email) or ValidarInputUser(User) or ValidarInputPass(Password)) }


    }


    fun ValidarInputEmail(Email: TextInputLayout?): Boolean {

        //    var email= Email?.editText?.text.toString().trim()
        val email = Email?.editText?.text.toString().trim()

        if (email.isEmpty()) {
            Email?.error = "Este campo es requerido"
            return false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Email?.error = "Los caracteres no pertenece a un correo electronico"
            return false
        } else {
            return true
        }
    }


    fun ValidarInputUser(User: TextInputLayout): Boolean {

        val user = User.editText?.text.toString().trim()

        return if (user.isEmpty()) {
            User.error = "Este campo es requerido"
            false
        } else if (user.length > 15) {
            User.error = "Supero el limite de caracteres"
            false
        } else {
            true
        }


    }


    fun ValidarInputPass(Password: TextInputLayout): Boolean {

        val pass = Password.editText?.text.toString().trim()

        if (pass.isEmpty()) {
            Password.error = "Este campo es requerido"
            return false

        } else  if(!PASSWORD_PATTERN.matcher(pass).matches()){
            Password.error="Poner una password seguro"
            return false
        }
        else {
            return true
        }


    }


}