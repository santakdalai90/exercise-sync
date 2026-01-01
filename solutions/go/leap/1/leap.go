// Package leap has utility methods around leap year
package leap

// IsLeapYear returns true if a given year is a leap year, otherwise it returns false.
func IsLeapYear(year int) bool {
	if year%400 == 0 {
		return true
	}

	if year%100 == 0 {
		return false
	}

	if year%4 == 0 {
		return true
	}

	return false
}
