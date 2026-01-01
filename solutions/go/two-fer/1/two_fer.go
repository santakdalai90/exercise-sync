// Package twofer yields funny statements to encourage sharing of resources among humans
package twofer

import (
	"fmt"
)

// ShareWith returns a statement of the syntax "One for X, one for me."
// where X is the name pased to it. If name is nil it returns 
// "One for you, one for me."
func ShareWith(name string) string {
	if name != "" {
		return fmt.Sprintf("One for %s, one for me.", name)
	} else {
		return "One for you, one for me."
	}
}
