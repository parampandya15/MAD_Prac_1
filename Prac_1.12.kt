fun main() {
var student1 = Student("Mustakim") student1.info()
}

open class Person(var name: String = "X") { fun info (){
println("20012011070 \n") println(name + " is a student.")
println(name + " is currently in 3rd year of B.Tech .")
}
}

class Student(name: String): Person("Nagori Mustakim") {

}
