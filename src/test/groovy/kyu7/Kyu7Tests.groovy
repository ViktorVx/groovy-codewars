package kyu7


import org.junit.Test
import spock.lang.Specification

class Kyu7Tests extends Specification {

    @Test
    def "Ordered Count of Characters"(String input, s){
        expect:
            OrderedCountOfCharacters.orderedCount(input) == s
        where:
            input             | s
            "10"              | [['1', 1], ['0', 1]]
            "8655"            | [['8', 1], ['6', 1], ['5', 2]]
            "abracadabra"     | [['a', 5], ['b', 2], ['r', 2], ['c', 1], ['d', 1]]
            "Code Wars"       | [['C', 1], ['o', 1], ['d', 1], ['e', 1], [' ', 1], ['W', 1], ['a', 1], ['r', 1], ['s', 1]]
    }

}