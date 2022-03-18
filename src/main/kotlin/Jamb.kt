class Jamb : Score() {

    override fun checkScore() {
        if (this.results.distinct().count() == 1) {
            println("Jamb SCORED")
        }
    }
}