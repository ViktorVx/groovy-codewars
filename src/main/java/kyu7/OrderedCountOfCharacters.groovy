package kyu7

class OrderedCountOfCharacters {
    static def orderedCount(String input) {
        input.toList().groupBy{it}.collect{ k,v -> [k,v.size()]}
    }
}