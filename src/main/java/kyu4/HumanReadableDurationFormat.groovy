package kyu4

class HumanReadableDurationFormat {
    static String formatDuration(seconds){
        if (seconds == 0) return "now"
        def YEAR = 31536000
        def DAY = 86400
        def HOUR = 3600
        def MINUTE = 60
        def lst = []
        lst << seconds.intdiv(YEAR)
        lst << seconds.mod(YEAR).intdiv(DAY)
        lst << seconds.mod(YEAR).mod(DAY).intdiv(HOUR)
        lst << seconds.mod(YEAR).mod(DAY).mod(HOUR).intdiv(MINUTE)
        lst << seconds.mod(YEAR).mod(DAY).mod(HOUR).mod(MINUTE)
        def res = ""
        for (int i = 0; i < lst.size(); i++) {
            res += formStr(lst, i)
        }
        res
    }

    static int elemsCount(idx, lst) {
        def res = 0
        for (int i = idx + 1; i < lst.size(); i++) if (lst[i] != 0) res++
        res
    }

    static String formStr(lst, idx) {
        if (lst[idx] == 0) return ""
        def res = ""
        def str = ""
        def elems = elemsCount(idx, lst)
        switch (idx) {
            case 0: str = "year"; break
            case 1: str = "day"; break
            case 2: str = "hour"; break
            case 3: str = "minute"; break
            case 4: str = "second"
        }
        switch (elems) {
            case 0: res = lst[idx] == 1 ? "${lst[idx]} ${str}" : "${lst[idx]} ${str}s"; break
            case 1: res = lst[idx] == 1 ? "${lst[idx]} ${str} and " : "${lst[idx]} ${str}s and "; break
            case 2..4: res = lst[idx] == 1 ? "${lst[idx]} ${str}, " : "${lst[idx]} ${str}s, "
        }
        res
    }
}