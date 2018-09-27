package com.ikempf

import play.api.libs.json.{Json, Writes}

object Main extends App {

  sealed trait Foo
  case class Bar(a: String) extends Foo

  implicit val writesBar: Writes[Bar] = Json.writes[Bar]

  implicit val writesFoo: Writes[Foo] = Writes {
    case bar: Bar => Json.toJson(bar)
  }

  writesFoo.writes(Bar(""))

}