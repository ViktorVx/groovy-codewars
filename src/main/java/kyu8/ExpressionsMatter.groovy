package kyu8

class ExpressionsMatter {
    static def expressionMatter(a, b, c) {
        [a*b*c, a*(b+c), (a+b)*c, a+b+c].max()
    }
}
