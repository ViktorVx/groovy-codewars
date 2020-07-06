package kyu5

import org.junit.Test
import spock.lang.Specification

class Kyu5Tests extends Specification {

    @Test
    def "Primes in numbers"(int input, String s){
        expect:
            PrimesInNumbers.factors(input) == s
        where:
            input    | s
            7775460  | "(2**2)(3**3)(5)(7)(11**2)(17)"
    }
}