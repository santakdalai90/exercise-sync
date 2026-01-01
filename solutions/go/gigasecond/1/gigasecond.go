// Package gigasecond deals with time.Time in the order of 10^9 seconds
package gigasecond

import "time"

// AddGigasecond adds 10^9 seconds to the given time
func AddGigasecond(t time.Time) time.Time {
	return t.Add(time.Second * 1e9)
}
