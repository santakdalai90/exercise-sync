// Package proverb provides utility methods around proverbs
package proverb

import "fmt"

// Proverb returns an array of string which is full text of proverbial rhyme
func Proverb(rhyme []string) []string {
	soln := make([]string, 0)
	if len(rhyme) == 0 {
		return soln
	}
	sentence := "For want of a %s the %s was lost."
	for i := 0; i < len(rhyme)-1; i++ {
		soln = append(soln, fmt.Sprintf(sentence, rhyme[i], rhyme[i+1]))
	}

	soln = append(soln, fmt.Sprintf("And all for the want of a %s.", rhyme[0]))
	return soln
}
