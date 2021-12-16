package solution

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun solutionTest() {
        assertThat(solution.solution()).isEqualTo(0)
    }
}