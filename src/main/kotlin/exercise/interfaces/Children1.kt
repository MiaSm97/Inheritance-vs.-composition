package exercise.interfaces

class Children1 (override var relation: String, override var name: String) : Family {
    override fun status() {
        println("$name is the $relation")
    }
}