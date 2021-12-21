// This file was automatically generated from Ior.kt by Knit tool. Do not edit.
package arrow.core.examples.exampleIor08

import arrow.core.Ior

fun main() {
  val right = Ior.Right(12).padNull()         // Result: Pair(null, 12)
  val left = Ior.Left(12).padNull()           // Result: Pair(12, null)
  val both = Ior.Both("power", 12).padNull()  // Result: Pair("power", 12)

  println("right = $right")
  println("left = $left")
  println("both = $both")
}
