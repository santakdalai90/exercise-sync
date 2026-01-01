package wordy

import (
    "strings"
    "strconv"
)

type Operation func(a,b int) (int, bool)

func plus(a,b int) (int, bool ){
    return a+b, true
}

func minus(a,b int) (int, bool) {
    return a-b, true
}

func multipliedBy(a,b int) (int, bool) {
    return a*b, true
}

func dividedBy(a,b int) (int, bool) {
    if b == 0 {
        return 0, false
    }
    return a/b, true
}

func Answer(question string) (int, bool) {
    funcMap := map[string]Operation {
        "plus": plus,
        "minus": minus,
        "multiplied": multipliedBy,
        "divided": dividedBy,
    }

    if !strings.HasPrefix(question, "What is ") || !strings.HasSuffix(question, "?") {
        return 0, false
    }
    question = strings.TrimSuffix(strings.TrimPrefix(question, "What is "), "?")

    items := strings.Split(question, " ")
    
    for len(items) > 1 {
        if len(items) < 3 {
            return 0, false
        }

        operand1, err := strconv.Atoi(items[0])
        if err != nil {
            return 0, false
        }
        
        opString := items[1]
        op, exists := funcMap[opString]
        if !exists {
            return 0, false
        }
        
        op2Idx := 2
        if opString == "multiplied" || opString == "divided" {
            if len(items) < 4 || items[2] != "by" {
                return 0, false
            }
            op2Idx = 3
        }
        
        if op2Idx >= len(items) {
            return 0, false
        }
        
        operand2, err := strconv.Atoi(items[op2Idx])
        if err != nil {
            return 0, false
        }
        
        result, ok := op(operand1, operand2)
        if !ok {
            return 0, false
        }

        items[op2Idx] = strconv.Itoa(result)
        items = items[op2Idx:]
    }

    result, err := strconv.Atoi(items[0])
    if err != nil {
        return 0, false
    }
    
    return result, true
}
