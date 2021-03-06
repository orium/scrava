package kiambogo.scrava.models

/**
 * Created by christopher on 2014-09-15.
 */

sealed trait Activity

case class PersonalDetailedActivity(
  id: Int,
  resource_state: Int,
  external_id: Option[String],
  upload_id: Option[Int],
  athlete: Map[String, Int],
  name: String,
  distance: Float,
  moving_time: Int,
  elapsed_time: Int,
  total_elevation_gain: Float,
  `type`: String,
  start_date: String,
  start_date_local: String,
  timezone: String,
  start_latlng: Option[List[Float]],
  end_latlng: Option[List[Float]],
  location_city: Option[String],
  location_state: Option[String],
  location_country: Option[String],
  achievement_count: Int,
  kudos_count: Int,
  comment_count: Int,
  athlete_count: Int,
  photo_count: Int,
  map: Polyline,
  trainer: Boolean,
  commute: Boolean,
  manual: Boolean,
  `private`: Boolean,
  flagged: Boolean,
  gear_id: Option[String],
  gear: Option[Gear],
  average_speed: Float,
  max_speed: Float,
  weighted_average_watts: Option[Int] = None,
  device_watts: Option[Boolean] = None,
  average_cadence: Option[Float] = None,
  average_temp: Option[Int] = None,
  kilojoules: Option[Float] = None,
  average_heartrate: Option[Float] = None,
  max_heartrate: Option[Float] = None,
  has_kudoed: Boolean,
  description: Option[String] = None,
  calories: Option[Float] = None,
  segment_efforts: List[SegmentEffort],
  splitsMetric: List[SplitMetrics],
  splitsStandard: List[SplitStandard],
  best_efforts: List[SegmentEffort]) extends Activity

case class DetailedActivity(
  id: Int,
  resource_state: Int,
  external_id: Option[String],
  upload_id: Option[Int],
  athlete: AthleteSummary,
  name: String,
  distance: Float,
  moving_time: Int,
  elapsed_time: Int,
  total_elevation_gain: Float,
  `type`: String,
  start_date: String,
  start_date_local: String,
  timezone: String,
  start_latlng: Option[List[Float]],
  end_latlng: Option[List[Float]],
  location_city: Option[String],
  location_state: Option[String],
  location_country: Option[String],
  achievement_count: Int,
  kudos_count: Int,
  comment_count: Int,
  athlete_count: Int,
  photo_count: Int,
  map: Polyline,
  trainer: Boolean,
  commute: Boolean,
  manual: Boolean,
  `private`: Boolean,
  flagged: Boolean,
  gear_id: Option[String],
  gear: Option[Gear],
  average_speed: Float,
  max_speed: Float,
  weighted_average_watts: Option[Int] = None,
  device_watts: Option[Boolean] = None,
  average_cadence: Option[Float] = None,
  average_temp: Option[Int] = None,
  kilojoules: Option[Float] = None,
  average_heartrate: Option[Float] = None,
  max_heartrate: Option[Float] = None,
  has_kudoed: Boolean,
  description: Option[String] = None,
  calories: Option[Float] = None,
  segment_efforts: List[SegmentEffort],
  splitsMetric: List[SplitMetrics],
  splitsStandard: List[SplitStandard],
  best_efforts: List[SegmentEffort]) extends Activity

case class PersonalActivitySummary(
  id: Int,
  resource_state: Int,
  external_id: Option[String],
  upload_id: Option[Int],
  athlete: Map[String, Int],
  name: String,
  distance: Float,
  moving_time: Int,
  elapsed_time: Int,
  total_elevation_gain: Float,
  `type`: String,
  start_date: String,
  start_date_local: String,
  timezone: String,
  start_latlng: List[Float],
  end_latlng: Option[List[Float]],
  location_city: Option[String],
  location_state: Option[String],
  location_country: Option[String],
  achievement_count: Int,
  kudos_count: Int,
  comment_count: Int,
  athlete_count: Int,
  photo_count: Int,
  map: Polyline,
  trainer: Boolean,
  commute: Boolean,
  manual: Boolean,
  `private`: Boolean,
  flagged: Boolean,
  gear_id: Option[String],
  average_speed: Float,
  max_speed: Float,
  average_cadence: Option[Float],
  average_temp: Option[Int],
  average_watts: Option[Float],
  kilojoules: Option[Float],
  device_watts: Option[Boolean] = None,
  average_heartrate: Option[Float],
  max_heartrate: Option[Float],
  total_photo_count: Int,
  has_kudoed: Boolean,
  workout_type: Option[Int]) extends Activity

case class ActivitySummary(
  id: Int,
  resource_state: Int,
  external_id: Option[String],
  upload_id: Option[Int],
  athlete: AthleteSummary,
  name: String,
  distance: Float,
  moving_time: Int,
  elapsed_time: Int,
  total_elevation_gain: Float,
  `type`: String,
  start_date: String,
  start_date_local: String,
  timezone: String,
  start_latlng: Option[List[Float]],
  end_latlng: Option[List[Float]],
  location_city: Option[String],
  location_state: Option[String],
  location_country: Option[String],
  achievement_count: Int,
  kudos_count: Int,
  comment_count: Int,
  athlete_count: Int,
  photo_count: Int,
  map: Polyline,
  trainer: Boolean,
  commute: Boolean,
  manual: Boolean,
  `private`: Boolean,
  flagged: Boolean,
  gear_id: Option[String],
  average_speed: Float,
  max_speed: Float,
  average_cadence: Option[Float],
  average_temp: Option[Int],
  average_watts: Option[Float],
  kilojoules: Option[Float],
  average_heartrate: Option[Float],
  max_heartrate: Option[Float],
  total_photo_count: Int,
  has_kudoed: Boolean,
  workout_type: Option[Int]) extends Activity


case class ActivityComments(
  id: Int,
  activity_id: Int,
  resource_state: Int,
  text: String,
  athlete: AthleteSummary,
  created_at: String)

case class ActivityZones(
  score: Option[Int],
  distribution_buckets: List[Map[String, Int]],
  `type`: String,
  resource_state: Int,
  sensor_based: Boolean,
  points: Option[Int],
  custom_zones: Option[Boolean],
  max: Option[Int])
