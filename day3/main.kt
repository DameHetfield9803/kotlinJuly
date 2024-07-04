import java.lang.System
import java.util.Scanner

fun main() {
    var reader = Scanner(java.lang.System.`in`)
    print("Enter your age this year > ")
    var age = reader.nextByte()
    println("------------------------------------")
    print("Enter your salary per month in SGD > ")
    var salary = reader.nextInt()
    println("------------------------------------")
    if (age < 55) {
        var remainingSalary = salary * 0.80
        var CPF = salary * 0.370
        println("Your remaining salary would be $remainingSalary and your CPF will be $CPF")
    }
    else if (age >= 55 && age < 60) {
        var remainingSalary = salary * 0.83
        var CPF = salary * 0.310
        println("Your remaining salary would be $remainingSalary and your CPF will be $CPF")
    }

    else if (age >= 60 && age < 65) {
        var remainingSalary = salary * 0.885
        var CPF = salary * 0.220
        println("Your remaining salary would be $remainingSalary and your CPF will be $CPF")
    }

    else if (age >= 65 && age < 70) {
        var remainingSalary = salary * 0.075
        var CPF = salary * 0.165
        println("Your remaining salary would be $remainingSalary and your CPF will be $CPF")
    }

    else if (age > 70) {
        var remainingSalary = salary * 0.05
        var CPF = salary * 0.125
        println("Your remaining salary would be $remainingSalary and your CPF will be $CPF")
    }
}
