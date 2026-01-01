package hamming

import "fmt"

// Distance calculates Hamming Distance between two strings
func Distance(a, b string) (int, error) {
	runesA := []rune(a)
	runesB := []rune(b)
	if len(runesA) != len(runesB) {
		return 0, fmt.Errorf("length mismatch of the input string")
	}
	distance := 0
	for pos := 0; pos < len(runesA); pos++ {
		if runesA[pos] != runesB[pos] {
			distance++
		}
	}
	return distance, nil
}
