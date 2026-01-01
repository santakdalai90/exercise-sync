package raindrops

import "strconv"

func Convert(number int) string {
    ans := ""
    done := false
    if number % 3 == 0 {
        ans += "Pling"
        done = true
    }

    if number % 5 == 0 {
        ans += "Plang"
        done = true
    }

    if number % 7 == 0 {
        ans += "Plong"
        done = true
    }

    if !done {
        return strconv.Itoa(number)
    }
    
	return ans
}
