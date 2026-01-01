package cryptosquare

import (
    "strings"
    "math"
)

func min(x,y int) int {
    if x < y {
        return x
    }
    return y
}

func removeSpaceAndPunctuation(s string) string {
    var result strings.Builder
    for i:=0; i<len(s); i++ {
        if (s[i] >= '0' && s[i] <= '9') || (s[i] >= 'a' && s[i] <= 'z') {
            result.WriteByte(s[i])
        }
    }
    return result.String()
}

func Encode(pt string) string {
    pt = strings.ToLower(pt)
    pt = removeSpaceAndPunctuation(pt)

    n := len(pt)
    r := int(math.Round(math.Sqrt(float64(n))))
    c := int(math.Ceil(float64(n) / float64(r)))

    matrix := make([]string, 0)
    for i:=0; i < n; {
        l := min(i+c, n)
        row := pt[i:l] + strings.Repeat(" ", c - len(pt[i:l]))
        matrix = append(matrix, row)
        i = l
    }

	var result strings.Builder
    for idx := 0; idx < c; idx++{
        for i:=0; i< len(matrix); i++ {
            result.WriteByte(matrix[i][idx])
        }
        if idx != c-1 {
            result.WriteByte(' ')
        }
    }

    return result.String()
}
