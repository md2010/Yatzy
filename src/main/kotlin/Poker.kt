class Poker : Score() {

    override fun checkScore() {
        val pokerNumbers = (1.. 6).toList()
        if(results == pokerNumbers){
            println("Poker SCORED")
        }
    }

}