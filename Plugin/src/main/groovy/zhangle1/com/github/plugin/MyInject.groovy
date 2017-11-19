package zhangle1.com.github.plugin

import javassist.ClassPool
import org.gradle.api.Project

/**
 * Created by lezi on 2017/11/19.
 */
class MyInject {

    private final static ClassPool pool=ClassPool.getDefault()


    static void injectDir(String path,String packageName,Project project){
        pool.appendClassPath(path)
        //project.android.bootClasspath 加入android.jar，否则找不到android相关的所有类
        pool.appendClassPath(project.android.bootClasspath[0].toString())
        Utils




    }



}
