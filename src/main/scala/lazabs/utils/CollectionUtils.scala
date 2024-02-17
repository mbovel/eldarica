package lazabs.utils

import scala.collection.mutable.ArrayBuffer

object CollectionUtils {
  def reduceToSize[T](b: ArrayBuffer[T], index: Int): b.type = {
    // https://contributors.scala-lang.org/t/removal-of-public-def-arraybuffer-reducetosize-n-int-in-2-13-x/5303
    b.remove(index, b.length - index)
    b
  }
}
