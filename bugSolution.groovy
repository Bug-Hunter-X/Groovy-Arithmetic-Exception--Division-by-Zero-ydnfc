```groovy
def calculate(a, b) {
  if (b == 0) {
    println "Error: Cannot divide by zero"
    return Double.NaN // Or throw a custom exception
  } else {
    return a / b
  }
}

println calculate(10, 0) // Prints "Error: Cannot divide by zero" and NaN
println calculate(10, 2) // Prints 5.0
```