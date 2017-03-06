/*
import kotlinx.html.*
import kotlinx.html.dom.*
import kotlinx.html.js.*
import kotlin.browser.document
*/


fun main(args: Array<String>) {
    println("Hello JavaScript!")
    Main.incrementAndShow()
}

object Main {

    var num = 0
    val mainDiv : JQuery =
        jQuery("<div id=\"main\"/>").apply {
            jQuery("body").append(this)
        }


    fun incrementAndShow() {
        num += 1;
        with(mainDiv) {
            html("counter = $num")
            fadeIn(200)
            delay(600)
            fadeOut(200, { incrementAndShow() })
        }
    }

}