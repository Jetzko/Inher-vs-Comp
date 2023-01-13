fun main(){
    val children1 = Children("Andrea")
    children1.family()
}
open class Parent (open var name : String){
    fun family(){
    println("I'm $name and I'm a member of this family!")
}
}
class Children(override var name: String) :Parent(name){
}
