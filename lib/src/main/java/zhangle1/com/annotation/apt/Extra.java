package zhangle1.com.annotation.apt;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Created by lezi on 2017/11/19.
 */

@Retention(CLASS)
@Target(FIELD)
public @interface Extra {

    String value();
}
