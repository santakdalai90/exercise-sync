// Package twofer yields funny statements to encourage sharing of resources among humans
package twofer

import (
	"fmt"
)

// ShareWith returns a statement of the syntax "One for X, one for me."
// where X is the name passed to it. If name is nil it returns
// "One for you, one for me."
func ShareWith(name string) string {
	msg := "One for %s, one for me."
	if name == "" {
		name = "you"
	}

	return fmt.Sprintf(msg, name)
}
