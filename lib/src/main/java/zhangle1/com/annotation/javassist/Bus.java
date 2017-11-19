package zhangle1.com.annotation.javassist;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lezi on 2017/11/19.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Bus {

    int DEFAULT=-1;
    int UI=0;
    int BG=1;

    int thread() default  DEFAULT;


    int value();
}
