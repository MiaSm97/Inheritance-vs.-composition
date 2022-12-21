package exercise.interfaces

class Parent (override var relation: String, override var name: String) : Family{
    override fun status(){
        println("$name is the $relation")
    }
}