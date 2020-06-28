package kyu6

class BinaryToText {
    static def binaryToString(input) {
        input.toList().collate(8).collect{Character.toString((char)Integer.parseInt(it.join(), 2))}.join()
    }
}