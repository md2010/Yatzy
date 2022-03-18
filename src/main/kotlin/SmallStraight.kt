class SmallStraight: Score() {

    override fun checkScore() {
        val small1 = (1.. 4).toList()
        val small2 =(2..5).toList()
        val small3 = (3..6).toList()
        if(results == small1 || results == small2 || results == small3){
            println("Small Straight SCORED")
        }
    }

}