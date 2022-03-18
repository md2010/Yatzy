abstract class Score (
    var results: MutableList<Int> = mutableListOf<Int>(),
){

    abstract fun checkScore()

    fun getAllResults(dices: List<Dice>) {
        for(dice in dices){
            this.results.add(dice.result)
        }
    }
}