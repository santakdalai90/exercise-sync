package space

import "math"

// Planet represents a planet in the solar system
type Planet string

// Constant for available planets
const (
	Mercury Planet = "Mercury"
	Venus          = "Venus"
	Earth          = "Earth"
	Mars           = "Mars"
	Jupiter        = "Jupiter"
	Saturn         = "Saturn"
	Uranus         = "Uranus"
	Neptune        = "Neptune"
)

func (p Planet) getYearLength() float64 {
	const EarthYear = 31557600
	yearLengthMap := make(map[Planet]float64)
	yearLengthMap[Mercury] = 0.2408467 * EarthYear
	yearLengthMap[Venus] = 0.61519726 * EarthYear
	yearLengthMap[Earth] = 1.0 * EarthYear
	yearLengthMap[Mars] = 1.8808158 * EarthYear
	yearLengthMap[Jupiter] = 11.862615 * EarthYear
	yearLengthMap[Saturn] = 29.447498 * EarthYear
	yearLengthMap[Uranus] = 84.016846 * EarthYear
	yearLengthMap[Neptune] = 164.79132 * EarthYear

	return yearLengthMap[p]
}

// Age calculates age in terms of Earth years; given a time duration on a given planet.
func Age(seconds float64, planet Planet) float64 {
	age := seconds / planet.getYearLength()
	return math.Round(age*100) / 100
}
