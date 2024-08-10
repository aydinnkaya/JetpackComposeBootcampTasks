package com.aydinkaya.jetpackcomposebootcamptasks.tasks.task2



fun main() {
    val task2Class = Task2Class()

    println("-----1-------")

    val calculateInteriorAngles = task2Class.calculateInteriorAngles(6)
    println("Calculate Interior Angles : $calculateInteriorAngles")


    println("-----2-------")

    val calculateSalary = task2Class.calculateSalary(90)

    println("Calculate Salary: $calculateSalary₺")

    println("-----3-------")


    val fahrenheit = Task2Class().celsiusToFahrenheit(25.0)
    println("25°C in Fahrenheit is: $fahrenheit")  // Should print: 77.0

    println("-----4-------")


    val perimeter = Task2Class().rectanglePerimeter(9.0, 10.0)
    println("Perimeter of the rectangle is: $perimeter")  // Should print: 30.0

    println("-----5-------")

    val fact = Task2Class().factorial(6)
    println("Factorial of 5 is: $fact")  // Should print: 120


    println("-----6-------")

    val count = Task2Class().countAInWord("banana")
    println("The letter 'a' appears in 'banana' $count times.")  // Should print: 3
}


