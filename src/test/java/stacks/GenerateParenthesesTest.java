package stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GenerateParenthesesTest {
    GenerateParentheses solver;

    @BeforeEach
    void setUp() {
        solver = new GenerateParentheses();
    }

    @Test
    void test1() {
        var actual = solver.generateParentheses(1);
        assertThat(actual).containsExactlyInAnyOrder("()");
    }

    @Test
    void test2() {
        var actual = solver.generateParentheses(3);
        assertThat(actual).containsExactlyInAnyOrder(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"
        );
    }
}