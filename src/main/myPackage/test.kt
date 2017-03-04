/*
import kotlinx.html.*
import kotlinx.html.dom.*
import kotlinx.html.js.*
import kotlin.browser.document
*/

fun main(args: Array<String>) {
    println("Hello JavaScript!")
    X.x()
}

object X {

    var num = 0;
    val mainDiv = jQuery("<div id=\"main\"/>",null as JQuery?)

    init{
        jQuery("body",null as JQuery?).append(mainDiv)
    }

    fun x() {

        num+=1;
        with(mainDiv) {
            html("counter = $num")
            fadeIn(200)
            delay(600)
            fadeOut(200, { x() })
        }
    }

}