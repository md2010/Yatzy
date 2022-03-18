fun main(args: Array<String>) {

    val game = Game()
    game.createDices()

    var i = 1;
    while(true){
        println("ROUND: $i")

        while(game.rollNumber <= 3){

            game.rollDices()

            if(game.rollNumber <= 2){
                println("Write numbers with commas of dices which you want to seal, if none type in 0")
                val indexes: String? = readLine()
                if(indexes != "0") {
                    val listString: List<String>? = indexes?.split(",")?.toList()
                    val listInt = listString?.map { it.toInt() }
                    game.sealDices(listInt)
                }
                println("Do you want to score your dices? Y/N")
                val answer = readLine()
                if(answer == "Y"){
                    game.isScored()
                    break
                }
            }
            if(game.rollNumber == 3){
                println("Scoring your roll...")
                game.isScored()
                break
            }

            if(game.rollNumber < 3) {
                println("New roll")
            }
            game.rollNumber++
        }
        println("Another round? Y/N")
        val anotherRound = readLine()
        if(anotherRound == "Y") {
            i++;
            continue
        } else if(anotherRound == "N") {
            println("Exiting game...")
            break
        }
    }
}


