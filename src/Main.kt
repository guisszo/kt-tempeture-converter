fun main() {
    // Fill in the code.
    val celciusToFahrenheits: (t:Double)->Double = {
        (9.0/5.0 *it + 32)
    }
    val kelvinToCelsius: (Double) -> Double = {
        it - 273.15
    }
    val fahrenheitsToKelvin: (t:Double)->Double = {
        5.0/9.0 * (it - 32) + 273.15
    }
    printFinalTemperature(
        initialMeasurement = 27.0,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit",
        conversionFormula = celciusToFahrenheits
    )

    printFinalTemperature(
        initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celsius",
        conversionFormula = kelvinToCelsius
    )
    printFinalTemperature(
        initialMeasurement = 10.0,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = fahrenheitsToKelvin
    )
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}