package zhangle1.com.github.plugin.helper

import javassist.CtClass
import javassist.CtMethod
import org.gradle.api.Project

/**
 * Created by lezi on 2017/11/19.
 */
class LogTimeHelper {

    final static String prefix = "\nlong startTime = System.currentTimeMillis();\n"
    final static String postfix = "\nlong endTime = System.currentTimeMillis();\n"
    final static String LogTimeAnnotation="zhangle1.com.annotation.javassist.LogTime"




    static void initLogTime(Project project, String methodName, String className, CtMethod ctmethod, CtClass c, String path) {
        //开始修改class文件

        project.logger.error "开始修改class文件!" + className + "." + methodName


    }



}
