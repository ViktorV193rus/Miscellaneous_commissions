import kotlin.math.max

const val ERROR_LIMIT = -1
const val ERROR_TYPE = -2

fun main() {

}

fun translationBankCard(cardBank: String, previous: Int, transfer: Int): Int {
    val cardBank = "Visa"

    return when (cardBank) {
        "VkPay" -> if (transfer <= 15_000 && transfer + previous <= 40_000) transfer else ERROR_LIMIT
        "Visa", "Mir" -> if (transfer <= 150_000 && previous + transfer <= 600_000) max(
            35,
            (transfer * 0.0075).toInt()
        ) else ERROR_LIMIT

        "MasterCard", "Maestro" -> if (transfer <= 150_000 && previous + transfer <= 600_000 && transfer < 75_000) transfer else (transfer * 0.006).toInt() + 20
        else -> ERROR_TYPE
    }
}
