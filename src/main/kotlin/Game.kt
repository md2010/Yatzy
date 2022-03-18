class Game (
    val dices: MutableList<Dice> = mutableListOf<Dice>(),
    val typesOfScore: MutableList<Score> = mutableListOf<Score>(Poker(), Jamb(), TwoPairs(), SmallStraight()) ,
    var rollNumber: Int = 1
){
    fun createDices(){
        for(i in 1 .. 6) {
            this.dices.add(Dice(i))
        }
    }

    fun rollDices(){
        for(dice in this.dices.filter { !it.sealed }) {
            dice.roll()
            println("Dice number: ${dice.index}, result is ${dice.result}.")
        }
    }

    fun sealDices(indexes: List<Int>?) {
        if (indexes != null) {
            for (i in indexes) {
                dices[i - 1].sealed = true
            }
        }
        printSealedDices()
    }

    fun printSealedDices() {
        println("Indexes of sealed dices:")
        for(dice in dices) {
            if(dice.sealed) {
                println("Dice ${dice.index} is sealed")
            }
        }
    }

    fun isScored() {
        for (score in typesOfScore) {
            score.getAllResults(this.dices)
            score.checkScore()
        }
    }
}