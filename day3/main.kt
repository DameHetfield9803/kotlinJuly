import java.lang.System
import java.util.Scanner
fun main(){
    val reader = Scanner(java.lang.System.`in`);
    print("Enter your age this year > ")
    Byte age = reader.nextByte();
    println("------------------------------------")
    print("Enter your salary per month in SGD > ");
    Int salary = reader.nextInt();
    println("------------------------------------")
    if(age >= 18 && age < 55){
        Int remainingSalary = salary * 0.80;
        Float CPF = salary * 0.37;
        println("Your salary would be $remainingSalary and your CPF will be $CPF");
    }
}