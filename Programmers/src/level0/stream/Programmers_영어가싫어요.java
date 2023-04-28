package level0.stream;

import java.util.Map;

class Solution {
    private final Map<String, Integer> NUMBERS = Map.of(
            "zero", 0,
            "one", 1,
            "two", 2,
            "three", 3,
            "four", 4,
            "five", 5,
            "six", 6,
            "seven", 7,
            "eight", 8,
            "nine", 9);

    public long solution(String numbers) {
        return Long.parseLong(NUMBERS.keySet().stream()
                .reduce(numbers, (before, current) -> before.replaceAll(current, String.valueOf(NUMBERS.get(current)))));
    }
}