package sextant;

import android.support.annotation.IdRes;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.CLASS;
import static java.lang.annotation.ElementType.TYPE;

/**
 * Created by dombhuphaibool on 10/27/15.
 */
@Retention(CLASS) @Target(TYPE)
public @interface NavigationFlow {
    @IdRes int containerViewId();
}
