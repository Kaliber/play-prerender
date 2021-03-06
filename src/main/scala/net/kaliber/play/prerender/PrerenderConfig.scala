package net.kaliber.play.prerender

case class PrerenderConfig(
  enabled: Boolean,
  service: String,
  ssl: Boolean,
  token: Option[String] = None,
  maximumAttempts: Int = 1,
  additionalAgents: Seq[String],
  limitedParams: Option[Set[String]] = None,
  excludeRegex: Option[String] = None
)
