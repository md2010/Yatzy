class TwoPairs : Score() {

    var pairs: MutableList<Int> = mutableListOf<Int>(0,0,0,0,0,0)

    override fun checkScore() {
        for(result in this.results){
            when(result){
                1 -> {pairs[0]++}
                2 -> {pairs[1]++}
                3 -> {pairs[2]++}
                4 -> {pairs[3]++}
                5 -> {pairs[4]++}
                6 -> {pairs[5]++}
            }
        }
        checkPairs()
    }

    fun checkPairs() {
        val isScored = pairs.count {it >= 2} >= 2
        if(isScored) {
            var indexesOfPairs = pairs.mapIndexed ({index, value -> if(value >= 2) index else null}).filterNotNull()
            println("Two Pairs is SCORED, pairs of ${indexesOfPairs[0]+1} and ${indexesOfPairs[1]+1}")
        }
    }
}