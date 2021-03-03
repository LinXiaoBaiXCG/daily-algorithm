package io.github.linxiaobaixcg;

/**
 * @program: daily-algorithm
 * @description: 整数反转
 * @author: LCQ
 * @create: 2021-03-03 22:38
 **/
public class willpower20210303 {

    /**
     * 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
     *
     * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
     *
     * 假设环境不允许存储 64 位整数（有符号或无符号）。
     *
     * 示例 1：
     *
     * 输入：x = 123
     * 输出：321
     * 示例 2：
     *
     * 输入：x = -123
     * 输出：-321
     * 示例 3：
     *
     * 输入：x = 120
     * 输出：21
     * 示例 4：
     *
     * 输入：x = 0
     * 输出：0
     * @param x
     * @return
     */
    public int reverse(int x) {
        int result = 0;
        while(x != 0) {
            int tmp = result; // 保存计算之前的结果
            result = (result * 10) + (x % 10);
            x /= 10;
            // 将计算之后的结果 / 10，判断是否与计算之前相同，如果不同，证明发生溢出，返回0
            if (result / 10 != tmp) return 0;
        }
        return result;
    }
}
