package com.ikempf

import play.api.libs.json.{Json, Writes}

object Main extends App {

  sealed trait Foo
  case class Bar(a: String) extends Foo

  implicit val writesFoo: Writes[Foo] = Writes { case bar: Bar => Json.toJson(bar) }
  implicit val writesBar: Writes[Bar] = Json.writes[Bar]

  writesFoo.writes(Bar(""))

}