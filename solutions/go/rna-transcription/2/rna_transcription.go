// Package strand deals with utility functions around DNA and RNA
package strand

import "strings"

// ToRNA returns the RNA complement of a given DNA string
func ToRNA(dna string) string {
	return strings.NewReplacer(
		"G", "C",
		"C", "G",
		"T", "A",
		"A", "U",
	).Replace(dna)
}
