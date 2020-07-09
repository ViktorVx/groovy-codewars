package kyu4

import org.junit.Test
import spock.lang.Specification

class Kyu4Tests extends Specification {

    @Test
    def "Human readable duration format"(int n, String s){
        expect:
            HumanReadableDurationFormat.formatDuration(n) == s
        where:
            n         | s
            1         | "1 second"
            62        | "1 minute and 2 seconds"
            120       | "2 minutes"
            3600      | "1 hour"
            3662      | "1 hour, 1 minute and 2 seconds"
            31536004  | "1 year and 4 seconds"
            0         | "now"
            6070432   | "70 days, 6 hours, 13 minutes and 52 seconds"
    }

}