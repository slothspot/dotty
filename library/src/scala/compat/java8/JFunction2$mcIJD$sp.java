
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package scala.compat.java8;

@FunctionalInterface
public interface JFunction2$mcIJD$sp extends JFunction2 {
    abstract int apply$mcIJD$sp(long v1, double v2);

    default Object apply(Object v1, Object v2) { return (Integer) apply$mcIJD$sp(scala.runtime.BoxesRunTime.unboxToLong(v1), scala.runtime.BoxesRunTime.unboxToDouble(v2)); }
}
