package controllers

import akka.actor._

import play.api._
import play.api.mvc._
import play.api.libs.json._

import play.api.Play.current

object Application extends Controller {
  def index = Action {
    Ok(views.html.index())
  }
}