package variables

/**
 * Created by sami on 28/05/2017.
 */

fun main(args: Array<String>) {
    val anystr: String = "hello world"
    println(anystr)

    val anyint: Int = 764
    println(anyint)

    function_one()

}


fun function_one(){
    println("out of variables.main scope")
}
