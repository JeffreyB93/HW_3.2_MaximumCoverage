fun main() {
    println(translation( 100.0, "Visa"))
}
fun translation(transferAmount: Double, cardType: String = "VK Pay", amountOfPreviousTransfers: Double = 0.0): String {

    when(cardType) {
        "Mastercard", "Maestro", "Visa", "Мир" -> if (transferAmount > 150000.0 || amountOfPreviousTransfers > 600000.0) return "Превышен лимит!"
        "VK Pay" -> if (transferAmount > 15000.0 || amountOfPreviousTransfers > 40000.0) return "Превышен лимит!"
    }

    val commission = when(cardType) {
        "Mastercard", "Maestro" -> if (amountOfPreviousTransfers > 75000.0) transferAmount * 0.006 + 20 else 0.0
        "Visa", "Мир" -> if (transferAmount * 0.0075 > 35) transferAmount * 0.0075 else 35.0
        "VK Pay" -> 0.0
        else -> 0.0
    }
    return (transferAmount - commission).toString()
}