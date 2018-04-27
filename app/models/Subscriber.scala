package models

import play.api.libs.json._
import java.time.LocalDateTime

case class Subscriber(id: Long, phone: String, language: Option[String], state: String, createdAt: LocalDateTime)

object Subscriber {
  implicit val subscriberFormat = Json.format[Subscriber]

}
