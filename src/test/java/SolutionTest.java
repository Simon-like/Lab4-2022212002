import org.junit.Test;

import static org.junit.Assert.assertEquals;


/*
 * 测试用例设计原则：
 * - 等价类划分原则：确保覆盖不同的版本比较情况，包括相同、不同、前导零等。
 * - 边界值分析：测试版本号的边界情况，如缺少修订号的版本。
 */
public class SolutionTest {
    // 测试目的：比较相同版本号，预期输出0
    @Test
    public void testEqualVersions() {
        Solution solution = new Solution();
        assertEquals(0, solution.compareVersion("1.0", "1.0.0"));
        assertEquals(0, solution.compareVersion("1.01", "1.001"));
    }

    // 测试目的：比较不同版本号，预期输出1
    @Test
    public void testVersion1Greater() {
        Solution solution = new Solution();
        assertEquals(1, solution.compareVersion("1.2", "1.1"));
        assertEquals(1, solution.compareVersion("2.0.1", "2.0"));
    }

    // 测试目的：比较不同版本号，预期输出-1
    @Test
    public void testVersion2Greater() {
        Solution solution = new Solution();
        assertEquals(-1, solution.compareVersion("0.1", "1.0"));
        assertEquals(-1, solution.compareVersion("1.0", "1.0.1"));
    }

    // 测试目的：边界值测试，预期输出0
    @Test
    public void testEmptyVersionParts() {
        Solution solution = new Solution();
        assertEquals(0, solution.compareVersion("1.0.0", "1.0"));
        assertEquals(0, solution.compareVersion("1", "1.0"));
    }
}
