package exercise.inheritance

fun main(){
    val familyMember4 = Parent("father", "Tom")
    val familyMember5 = Children1("daughter", "Lisa")
    val familyMember6 = Children2("son", "Rick")

    println(familyMember4.status())
    println(familyMember5.status())
    println(familyMember6.status())
}

open class Family2(open var relation: String, open var name: String) {
    fun status(): String {
        return "$name is the $relation"
    }
}