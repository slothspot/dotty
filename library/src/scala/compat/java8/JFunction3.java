
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package scala.compat.java8;

import scala.MatchError;

@FunctionalInterface
public interface JFunction3<T1, T2, T3, R> extends scala.Function3<T1, T2, T3, R> {
    default void $init$() {
    };

    @SuppressWarnings("unchecked")
    default scala.Function1<T1, scala.Function1<T2, scala.Function1<T3, R>>> curried() {
      return x1 -> x2 -> x3 -> apply(x1, x2, x3);
    }

    @SuppressWarnings("unchecked")
    default scala.Function1<scala.Tuple3<T1, T2, T3>, R> tupled() {
        return x0$1 -> {
            if (x0$1 == null) {
                throw new MatchError(x0$1);
            }
            T1 x1 = x0$1._1();
            T2 x2 = x0$1._2();
            T3 x3 = x0$1._3();
            R r = this.apply(x1, x2, x3);
            return r;
        }
        ;
    }


}
