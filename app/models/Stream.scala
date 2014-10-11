package models

/**
 * Created by christopher on 2014-10-07.
 */
case class TimeStream(
  time: Time,
  distance: Distance)

case class LatLngStream(
  latlng: LatLng,
  distance: Distance)

case class AltitudeStream(
  distance: Distance,
  altitude: Altitude)

case class VelocityStream(
  distance: Distance,
  velocity: Velocity)

case class HeartrateStream(
  distance: Distance,
  heartrate: Heartrate)

case class CadenceStream(
  distance: Distance,
  cadence: Cadence)

case class WattsStream(
  distance: Distance,
  watts: Watts)

case class TempStream(
  distance: Distance,
  temp: Temp)

case class MovingStream(
  distance: Distance,
  moving: Moving)

case class GradeStream(
  distance: Distance,
  grade: Grade)

case class LatLng(
  `type`: String = "latlng",
  data: List[List[Double]] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high")

case class Distance(
  `type`: String = "distance",
  data: List[Float] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high")

case class Time(
  `type`: String = "time",
  data: List[Int] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high")

case class Altitude(
  `type`: String = "altitude",
  data: List[Float] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high")

case class Velocity(
  `type`: String = "velocity",
  data: List[Float] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high")

case class Heartrate(
  `type`: String = "heartrate",
  data: List[Int] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high")

case class Cadence(
  `type`: String = "cadence",
  data: List[Int] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high")

case class Watts(
  `type`: String = "watts",
  data: List[Int] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high")

case class Temp(
  `type`: String = "temp",
  data: List[Int] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high")

case class Moving(
  `type`: String = "moving",
  data: List[Boolean] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high")

case class Grade(
  `type`: String = "grade_smooth",
  data: List[Float] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high")