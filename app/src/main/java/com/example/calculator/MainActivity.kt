package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import org.mariuszgromada.math.mxparser.*

class MainActivity : AppCompatActivity() {

    lateinit var clear: Button
    lateinit var bracketLeft: Button
    lateinit var bracketRight: Button
    lateinit var divide: Button
    lateinit var seven: Button
    lateinit var eight: Button
    lateinit var nine: Button
    lateinit var multiply: Button
    lateinit var four: Button
    lateinit var five: Button
    lateinit var six: Button
    lateinit var subtract: Button
    lateinit var one: Button
    lateinit var two: Button
    lateinit var three: Button
    lateinit var add: Button
    lateinit var zero: Button
    lateinit var decimal: Button
    lateinit var btnBackspace: Button
    lateinit var equalTo: Button
    lateinit var result: EditText
    var textString = ""
    var stringUseToParse = ""
    var finalResult = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clear = findViewById(R.id.btnClear)
        bracketLeft = findViewById(R.id.bracketLeft)
        bracketRight = findViewById(R.id.bracketRight)
        divide = findViewById(R.id.btnDivide)
        seven = findViewById(R.id.btnSeven)
        eight = findViewById(R.id.btnEight)
        nine = findViewById(R.id.btnNine)
        multiply = findViewById(R.id.btnMultiply)
        four = findViewById(R.id.btnFour)
        five = findViewById(R.id.btnFive)
        six = findViewById(R.id.btnSix)
        subtract = findViewById(R.id.btnMinus)
        one = findViewById(R.id.btnOne)
        two = findViewById(R.id.btnTwo)
        three = findViewById(R.id.btnThree)
        add = findViewById(R.id.btnAdd)
        zero = findViewById(R.id.btnZero)
        decimal = findViewById(R.id.btnDecimal)
        btnBackspace = findViewById(R.id.btnBackspace)
        equalTo = findViewById(R.id.btnEquals)
        result = findViewById(R.id.etInput)

        zero.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "0" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition+1)
        }

        one.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "1" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition+1)
        }

        two.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "2" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition+1)
        }
        three.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "3" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition+1)
        }


        four.setOnClickListener {
           var cursorPosition = result.selectionStart
           var leftSubstring = textString.substring(0, cursorPosition)
           var rightSubstring = textString.substring(cursorPosition)
           textString = leftSubstring + "4" + rightSubstring
           result.setText(textString)
           result.setSelection(cursorPosition+1)
        }
        five.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "5" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition+1)
        }
        six.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "6" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition+1)
        }
        seven.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "7" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition+1)
        }

        eight.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "8" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition+1)
        }
        nine.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "9" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition+1)
        }

        add.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "+" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition + 1)
        }
        subtract.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "-" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition + 1)
        }
        multiply.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "x" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition + 1)
        }
        divide.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "÷" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition + 1)
        }
        clear.setOnClickListener {
            textString = ""
            result.setText(textString)
        }
        decimal.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "." + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition + 1)
        }
        bracketLeft.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "(" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition + 1)
        }
        bracketRight.setOnClickListener {
            var cursorPosition = result.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + ")" + rightSubstring
            result.setText(textString)
            result.setSelection(cursorPosition + 1)
        }
        btnBackspace.setOnClickListener {
            var cursorPosition = result.selectionStart
            var rightSubstring = textString.substring(cursorPosition)
            if (textString.length != 0 && cursorPosition != 0) {
                var leftSubstring = textString.substring(0, cursorPosition - 1)
                textString = leftSubstring + rightSubstring
                result.setText(textString)
                result.setSelection(cursorPosition - 1)
            }
        }
        equalTo.setOnClickListener {
            stringUseToParse = result.text.toString()
            while (textString.indexOf("x") != -1) {
                stringUseToParse = textString.replace("x", "*")
                textString = stringUseToParse
            }

            while (textString.indexOf("÷") != -1) {
                stringUseToParse = textString.replace("÷", "/")
                textString = stringUseToParse
            }

            var expression = Expression(stringUseToParse)
            finalResult = expression.calculate().toString()
            textString = finalResult
            result.setText(textString)
            result.setSelection(textString.length)
        }
    }

}