package kindergarten

import (
    "strings"
    "fmt"
    "sort"
)

// Define the Garden type here.
type Garden struct {
    firstRow string
    secondRow string
    kidsIdxMap map[string]int
}

var plantNameMap = map[byte]string{
    'V': "violets",
    'R': "radishes",
    'C': "clover",
    'G': "grass",
}

func checkCupCodes(s string) bool {
    for i:=0; i< len(s); i++ {
        if _, ok := plantNameMap[s[i]]; !ok {
            return false
        }
    }
    return true
}

func NewGarden(diagram string, children []string) (*Garden, error) {
    rows := strings.Split(diagram, "\n")
    
    if len(rows) != 3 {
        return nil, fmt.Errorf("invalid number of rows")
    }
    if len(rows[1]) != len(rows[2]) {
        return nil, fmt.Errorf("mismatch row size")
    }
    if len(rows[1]) % 2 != 0 {
        return nil, fmt.Errorf("odd cups")
    }
    if !checkCupCodes(rows[1]) || !checkCupCodes(rows[2]) {
        return nil, fmt.Errorf("invalid cup codes")
    }

    sortedChildren := make([]string, len(children))
    copy(sortedChildren, children)
    sort.Strings(sortedChildren)
    kidsIdxMap := make(map[string]int)
    for i:=0; i< len(sortedChildren); i++ {
        if _, ok := kidsIdxMap[sortedChildren[i]]; ok {
            return nil, fmt.Errorf("duplicate names")
        }
        kidsIdxMap[sortedChildren[i]] = i*2
    }

    g := new(Garden)
    g.firstRow = rows[1]
    g.secondRow = rows[2]
    g.kidsIdxMap = kidsIdxMap
    return g, nil
}

func (g *Garden) Plants(child string) ([]string, bool) {
    plantIdx, ok := g.kidsIdxMap[child]
    if ok {
        plants := []string{
            plantNameMap[g.firstRow[plantIdx]],
            plantNameMap[g.firstRow[plantIdx+1]],
            plantNameMap[g.secondRow[plantIdx]],
            plantNameMap[g.secondRow[plantIdx+1]],
        }
        return plants, true
    }
    return nil, false
}
