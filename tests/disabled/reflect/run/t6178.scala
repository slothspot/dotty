import scala.reflect.runtime.universe._
import scala.reflect.runtime.{currentMirror => cm}

object Test extends dotty.runtime.LegacyApp {
  val plus = typeOf[java.lang.String].member(TermName("$plus")).asMethod
  println(cm.reflect("").reflectMethod(plus).apply("2"))
}
