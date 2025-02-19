# Groovy Arithmetic Exception: Division by Zero

This example demonstrates a common runtime error in Groovy (and many other languages) that occurs when attempting to divide a number by zero.  The code is straightforward but highlights the importance of input validation and error handling.

## The Bug
The `calculate` function performs division.  However, it lacks error handling for the case where the divisor (`b`) is zero.  Calling `calculate` with a divisor of zero results in an `ArithmeticException`.

## The Solution
The solution involves adding input validation to check for a zero divisor before performing the division. If the divisor is zero, a more informative message or a different value (like `Double.NaN`) can be returned to avoid the exception.
