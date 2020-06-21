package kyu8

import org.junit.Test
import spock.lang.Specification

class SubtractTheSumTests extends Specification {

    @Test
    def "test SubtractTheSum"(int n, String s) {
        expect:
            SubtractTheSum.subtractSum(n) == s
        where:
            n    | s
            10   | "apple"
            8655 | "apple"
    }
}

