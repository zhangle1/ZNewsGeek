package zhangle1.com.apt.inter;

import javax.annotation.processing.RoundEnvironment;

import zhangle1.com.apt.AnnotationProcessor;

/**
 * Created by lezi on 2017/11/15.
 */

public interface IProcessor {
    void process(RoundEnvironment roundEnv, AnnotationProcessor mAbstractProcessor);
}
