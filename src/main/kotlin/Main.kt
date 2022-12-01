import kotlin.random.Random

fun main() {
    /*Задача: Массив предназначен для хранения значений ростов двенадцати человек.
С помощью датчика случайных чисел заполнить массив целыми значениями,
лежащими в диапазоне от 163 до 190 включительно.*/
    val mansHeight = arrayOf (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    for (i in mansHeight.indices){
        val randomHeit = Random.nextInt(163,190)
        mansHeight[i] = randomHeit
    }
    for (i in mansHeight.indices) {
        print("${mansHeight[i]},")
    }


}