package conditionals.when_conditional

/**
 * Created by sami on 28/05/2017.
 */

fun main(args: Array<String>){
    val anyInt: Int = 54

    when(anyInt){
        1 -> println("Not correct")
        2 -> println("Still not correct")
        54-> println("Correct!")

        else-> println("Number match is not found")
    }

}