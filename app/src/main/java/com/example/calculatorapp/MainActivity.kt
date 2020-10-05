package com.example.calculatorapp
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isNewOp = true
    var oldNumber = ""
    var op = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberEvent(view: View) {
        if(isNewOp)
            editText.setText("")
        isNewOp = false
        var buclick:String = editText.text.toString()
        var buselect:Button = view as Button
        when(buselect.id) {
            bu1.id -> {
                buclick += "1"
            }
            bu2.id -> {
                buclick += "2"
            }
            bu3.id -> {
                buclick += "3"
            }
            bu4.id -> {
                buclick += "4"
            }
            bu5.id -> {
                buclick += "5"
            }
            bu6.id -> {
                buclick += "6"
            }
            bu7.id -> {
                buclick += "7"
            }
            bu8.id -> {
                buclick += "8"
            }
            bu9.id -> {
                buclick += "9"
            }
            bu0.id -> {
                buclick += "0"
            }
            buDot.id -> {
                buclick += "."
            }
        }
        editText.setText(buclick)
    }

    fun operatorEvent(view: View) {
        isNewOp = true
        oldNumber = editText.text.toString()
        if(isNewOp)
            editText.setText("")
        var buclick:String = editText.text.toString()
        var buselect = view as Button
        when(buselect.id){
            buMultiply.id -> {
                op = "*"
                buclick += "*"
            }
            buPlus.id -> {
                op = "+"
                buclick += "+"
            }
            buDivide.id -> {
                op = "/"
                buclick += "/"
            }
            buMinus.id -> {
                op = "-"
                buclick += "-"
            }
        }
        editText.setText(buclick)
    }

    fun equalEvent(view: View) {
        var newnumber = editText.text.toString()
        var result = 0.0
        when(op){
            "+"->{result = oldNumber.toDouble() + newnumber.toDouble()}
            "-"->{result = oldNumber.toDouble() - newnumber.toDouble()}
            "*"->{result = oldNumber.toDouble() * newnumber.toDouble()}
            "/"->{result = oldNumber.toDouble() / newnumber.toDouble()}
            "sin"->{result = Math.sin(newnumber.toDouble())}
            "cos"->{result = Math.cos(newnumber.toDouble())}
            "tan"->{result = Math.tan(newnumber.toDouble())}
        }
        editText.setText(result.toString())
    }

    fun acEvent(view: View) {
        editText.setText("0")
        isNewOp = true
    }

    fun trigEvent(view: View) {
        isNewOp = true
        if(isNewOp)
            editText.setText("")
        var buclick:String = editText.text.toString()
        var buselect = view as Button
        when(buselect.id){
            buSin.id -> {
                op = "sin"
                buclick += "sin"
            }
            buCosine.id -> {
                op = "cos"
                buclick += "cos"
            }
            buTangent.id -> {
                op = "tan"
                buclick += "tan"
            }
        }
        editText.setText(buclick)
    }

}