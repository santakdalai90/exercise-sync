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

// PlanetYears stores the year length of each planet in terms of earth year
var PlanetYears = map[Planet]float64{
	Mercury: 0.2408467,
	Venus:   0.61519726,
	Earth:   1.0,
	Mars:    1.8808158,
	Jupiter: 11.862615,
	Saturn:  29.447498,
	Uranus:  84.016846,
	Neptune: 164.79132,
}

// EarthYear represents earth year in seconds
const EarthYear = 31557600

// Age calculates age in terms of Earth years; given a time duration on a given planet.
func Age(seconds float64, planet Planet) float64 {
	age := seconds / (PlanetYears[planet] * EarthYear)
	return math.Round(age*100) / 100
}
