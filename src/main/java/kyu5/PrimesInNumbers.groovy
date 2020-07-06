package kyu5

class PrimesInNumbers {
    static String factors(int n) {
        primeFactors(n).groupBy{it}.collect{ k,v -> v.size() == 1 ? "(${k})" : "(${k}**${v.size()})"}.join()
    }

    static def primeFactors(int n){
        def result = []
        for (int candidate = 2; n > 1; candidate++) {
            while (n % candidate == 0) {
                result << candidate
                n /= candidate
            }
        }
        result
    }
}
