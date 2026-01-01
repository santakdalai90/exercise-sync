// Package strand deals with utility functions around DNA and RNA
package strand

// ToRNA returns the RNA complement of a given DNA string
func ToRNA(dna string) string {
	ans := make([]rune, 0)
	transformMap := map[rune]rune{
		'G': 'C',
		'C': 'G',
		'T': 'A',
		'A': 'U',
	}
	for _, r := range dna {
		ans = append(ans, transformMap[r])
	}
	return string(ans)
}
