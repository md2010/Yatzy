import kotlin.random.Random

class Dice (
    val index: Int,
    var result: Int = 0,
    var sealed: Boolean = false
    ){

    fun roll() {
        this.result = Random.nextInt(1, 6)
    }

}