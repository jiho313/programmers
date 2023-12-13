package level1.없는수더하기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int expected = 14;
        int answer1 = solution.solution1(numbers);
        int answer2 = solution.solution2(numbers);
        Assertions.assertThat(answer1).isEqualTo(expected);
        Assertions.assertThat(answer2).isEqualTo(expected);
    }
    @Test
    void solution2() {
        Solution solution = new Solution();
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};
        int expected = 6;
        int answer1 = solution.solution1(numbers);
        int answer2 = solution.solution2(numbers);
        Assertions.assertThat(answer1).isEqualTo(expected);
        Assertions.assertThat(answer2).isEqualTo(expected);
    }

}