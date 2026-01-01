// Package triangle implements utility methods for triangles
package triangle

import "math"

// Kind represents kind of a triangle, whether it's scalene, isosceles or equilateral
type Kind int

// Various kinds of triangles
const (
	NaT Kind = iota // not a triangle
	Equ             // equilateral
	Iso             // isosceles
	Sca             // scalene
)

// KindFromSides determines the kind of triangle given its three sides
func KindFromSides(a, b, c float64) Kind {
	// check for NaN
	if math.IsNaN(a) || math.IsNaN(b) || math.IsNaN(c) {
		return NaT
	}

	// check for +Inf and -Inf
	if math.IsInf(a, 0) || math.IsInf(b, 0) || math.IsInf(c, 0) {
		return NaT
	}

	// check for triangle inequality theorem
	if a+b < c || b+c < a || c+a < b {
		return NaT
	}

	// check for equilateral triangle
	if a == b && b == c {
		// check for zero length
		if a == 0 {
			return NaT
		}
		return Equ
	}

	// check for isosceles triangle
	if a == b || b == c || c == a {
		return Iso
	}

	// return scalene otherwise
	return Sca
}
