fun main(){
    val children2 = Children2 ("Maria")
    children2.person()
}
interface Parent2 {
    val name : String
    fun person(){}
}
class Children2(override val name : String) :Parent2{
    override fun person() {
        println("I'm $name and I'm a person!")
    }
}