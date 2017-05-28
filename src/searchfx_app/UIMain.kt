package searchfx_app

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.ListView
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import javafx.stage.Stage

/**
 * Created by sami on 28/05/2017.
 */


class Anyapp: Application(){
    override fun start(anyStage: Stage) {
        val edit =  TextField()
        val completionList = ListView<String>()

        val vbox = VBox(edit, completionList).apply {
            spacing = 15.0
            padding = Insets(15.0)
        }
        anyStage.scene = Scene(vbox)
        anyStage.show()
    }
}


fun main(args: Array<String>){
    Application.launch(Anyapp::class.java, *args)
}