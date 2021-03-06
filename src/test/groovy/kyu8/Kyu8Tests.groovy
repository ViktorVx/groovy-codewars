package kyu8

import org.junit.Test
import spock.lang.Specification

class Kyu8Tests extends Specification {

    @Test
    def "test SubtractTheSum"(int n, String s) {
        expect:
            SubtractTheSum.subtractSum(n) == s
        where:
            n    | s
            10   | "apple"
            8655 | "apple"
    }

    @Test
    def "How do I compare numbers?"(int n, String s) {
        expect:
            CompareInts.whatIs(n) == s
        where:
            n       | s
            0       | "nothing"
            123     | "nothing"
            -1      | "nothing"
            42      | "everything"
            42 * 42 | "everything squared"
    }

    @Test
    def "Is n divisible by x and y?"(int n, int x, int y, boolean b) {
        expect:
            DivisibleBy.isDivisible(n, x, y) == b
        where:
            n  |  x  |  y  | b
            3  |  3  |  4  | false
            8  |  3  |  4  | false
            12 |  3  |  4  | true
    }

    @Test
    def "Reversed Strings"(String s, String sr) {
        expect:
            ReverseString.reverse(s) == sr
        where:
            s        |  sr
            "Hello"  |  "olleH"
            "world"  |  "dlrow"
    }

    @Test
    def "Expressions Matter"(a, b, c, s) {
        expect:
            ExpressionsMatter.expressionMatter(a, b, c) == s
        where:
            a | b | c | s
            1 | 2 | 3 | 9
            1 | 1 | 1 | 3
    }

    @Test
    def "Odd or Even?"(l, s) {
        expect:
            OddOrEven.oddOrEven(l) == s
        where:
            l           | s
            [0]         | "even"
            []          | "even"
            [1, 1]      | "even"
            [1]         | "odd"
            [0, 1, 4]   | "odd"
            [0, -1, -4] | "odd"
            [0,  1, -4] | "odd"
    }
}

