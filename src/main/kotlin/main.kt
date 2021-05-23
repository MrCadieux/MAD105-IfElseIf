fun main(){
    var temperature: Double

    print("Please enter a temperature: ")
    temperature = readLine()!!.toDouble()

    if (temperature > 99.5)
        println("$temperature is considered High")
    else if (temperature < 97.5)
        println("$temperature is considered Low")
    else
        println("$temperature is considered Normal")

}