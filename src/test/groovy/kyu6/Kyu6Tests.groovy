package kyu6

import org.junit.Test
import spock.lang.Specification

class Kyu6Tests extends Specification {

    @Test
    def "Binary to Text (ASCII) Conversion"(String input, String s){
        expect:
            BinaryToText.binaryToString(input) == s
        where:
            input                                       | s
            "0100100001100101011011000110110001101111"  | "Hello"
            "00110001001100000011000100110001"          | "1011"
    }
}