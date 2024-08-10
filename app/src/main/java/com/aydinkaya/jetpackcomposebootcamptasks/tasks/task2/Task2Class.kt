package com.aydinkaya.jetpackcomposebootcamptasks.tasks.task2

class Task2Class {


// 1-    Write a method that takes the number of sides as a parameter and calculates the sum of the interior angles, returning the result.
//Sum of interior angles = (Number of sides - 2) x 180


    fun calculateInteriorAngles(sides: Int): Int {
        return (sides - 2) * 180
    }


// 2-Write a method that takes the number of days as a parameter and calculates the salary based on the given conditions, returning the obtained value.
//8 hours can be worked in 1 day.
//Hourly wage: 10 ₺
//Overtime hourly wage: 20 ₺
//Anything over 160 hours is considered overtime.,

    fun calculateSalary(days: Int): Int {
        val hoursPerDay = 8
        val hourlyRate = 10
        val overtimeRate = 20
        val regularHours = 160
        val totalHours = days * hoursPerDay

        return if (totalHours > regularHours) {
            val overtimeHours = totalHours - regularHours
            (regularHours * hourlyRate) + (overtimeHours * overtimeRate)
        } else {
            totalHours * hourlyRate
        }

    }


    // 3- Write a method that takes the quota amount as a parameter, calculates the fee based on the given conditions, and returns the result.
//50 GB = 100 ₺
//After exceeding the quota, each additional 1 GB costs 4 ₺.
    fun calculateQuotaFee(quota: Int): Int {
        val baseQuota = 50
        val baseFee = 100
        val additionalFeePerGB = 4

        return if (quota > baseQuota) {
            val extraQuota = quota - baseQuota
            baseFee + (extraQuota * additionalFeePerGB)
        } else {
            baseFee
        }
    }


    // 1. Function to convert the given Celsius degree to Fahrenheit and return the result
    fun celsiusToFahrenheit(celsius: Double): Double {
        // Formula: F = C x 1.8 + 32
        return celsius * 1.8 + 32
    }

    // 2. Function to calculate the perimeter of a rectangle given its sides as parameters
    fun rectanglePerimeter(length: Double, width: Double): Double {
        // Perimeter formula: 2 * (length + width)
        return 2 * (length + width)
    }

    // 3. Function to calculate the factorial of a given number and return the result
    fun factorial(n: Int): Long {
        // Factorial of a number n: n * (n-1) * ... * 1
        var result: Long = 1
        for (i in 2..n) {
            result *= i
        }
        return result
    }

    // 4. Function to count how many times the letter 'a' appears in a given word
    fun countAInWord(word: String): Int {
        // Using the count method to find occurrences of 'a'
        return word.count { it == 'a' }
    }

}