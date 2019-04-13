package functional

import java.math.BigInteger

@JvmOverloads
tailrec fun fibonacci(n: Int, a: Int = 0, b: Int = 1): Int =
    if (n == 1) b else fibonacci(n - 1, b, a + b)

//        when (n) {
//            0 -> a
//            1 -> b
//            else -> fibonacci(n - 1, b, a + b)
//        }

@JvmOverloads
tailrec fun factorial(
    n: Long,
    acc: BigInteger = BigInteger.ONE
): BigInteger =
    when (n) {
        0L -> BigInteger.ONE
        1L -> acc
        else -> factorial(n - 1, acc * BigInteger.valueOf(n))
    }

fun BigInteger.length() = Math.log10(this.toDouble()).toLong() + 1