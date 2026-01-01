// Package leap has utility methods around leap year
package leap

// IsLeapYear returns true if a given year is a leap year, otherwise it returns false.
func IsLeapYear(year int) bool {
	return year%4 == 0 && year%100 != 0 || year%400 == 0
}
