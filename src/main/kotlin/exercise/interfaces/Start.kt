package exercise.interfaces

fun main(){
    val familyMember1 = Parent("mother", "Jane")
    val familyMember2 = Children1("daughter", "Lily")
    val familyMember3 = Children2("son", "John")


    familyMember1.status()
    familyMember2.status()
    familyMember3.status()

}

interface Family{
    var relation: String
    var name: String
    fun status()
}



/*Write two different implementations of 1 parent and 2 children classes that override one method
- one using inheritance and another using interfaces.
 */