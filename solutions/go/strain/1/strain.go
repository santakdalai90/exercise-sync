package strain

// Implement the "Keep" and "Discard" function in this file.

// You will need typed parameters (aka "Generics") to solve this exercise.
// They are not part of the Exercism syllabus yet but you can learn about
// them here: https://go.dev/tour/generics/1

func Discard[T any](list []T, predicate func(x T) bool) []T {
    ans := make([]T,0)
    for _, t := range list {
        if !predicate(t) {
            ans = append(ans, t)
        }
    }
    return ans
}


func Keep[T any](list []T, predicate func(x T) bool) []T {
    ans := make([]T,0)
    for _, t := range list {
        if predicate(t) {
            ans = append(ans, t)
        }
    }
    return ans
}