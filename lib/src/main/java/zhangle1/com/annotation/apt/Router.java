package zhangle1.com.annotation.apt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lezi on 2017/11/19.
 */

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Router {

    String value();
}
