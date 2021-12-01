package codingTest

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class SolutionTest {

    companion object {
        @JvmStatic
        fun provideTestCase() = Stream.of(1 to 1)
            .map { Arguments.of(it.first, it.second) }
    }

    private val solution = Solution()

    @Test
    fun example_test() {
    }

    @MethodSource("provideTestCase")
    @ParameterizedTest
    fun example_parameterized_test(value: Int, expected: Int) {
        assertThat(value).isEqualTo(expected)
    }
}