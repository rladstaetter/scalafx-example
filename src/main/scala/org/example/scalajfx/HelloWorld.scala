package org.example.scalajfx

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.shape.Rectangle
import scalafx.stage.Stage

import javafx.scene.paint.Color

object World extends JFXApp {
  stage = new Stage {
    title = "Hello World"
    width = 600
    height = 450
    scene = new Scene {
      fill = Color.LIGHTGREEN
      content = new Rectangle {
        x = 25
        y = 40
        width = 100
        height = 100
        fill <== when(hover) then Color.GREEN otherwise Color.RED
      }
    }
  }
}
