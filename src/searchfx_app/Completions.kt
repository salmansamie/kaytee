package searchfx_app

import java.util.TreeSet

/**
 * Created by sami on 28/05/2017.
 */

data class NGram(val words: String, val freq: Int = -1) : Comparable<NGram>{

    override fun compareTo(other: NGram): Int {

        val x = words.compareTo(other.words)

        if (x != 0 || freq == -1)
            return x

        else
            return freq.compareTo(other.freq)
    }
}


class Test{
    val ngrams = TreeSet(setOf(
            NGram("whatever", 3),
            NGram("a very common thing", 2),
            NGram("welcome to the", 0)
    ))

}