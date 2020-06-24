package kyu7

class AlphabeticalAddition {
    static String addLetters(List<String> letters) {
        def z = ['z'] + ('a'..'y')
        letters == [] ? 'z' : z[letters.collect{('a'..'z').indexOf(it)+1}.sum() % 26]
    }
}

