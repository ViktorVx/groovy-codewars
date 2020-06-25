package kyu8

class OddOrEven {
    static String oddOrEven(list){
        (list.sum()?:0) % 2 ? 'odd' : 'even'
    }
}

