package zhangle1.com.github.plugin.helper

import javassist.ClassPool

/**
 * Created by lezi on 2017/11/19.
 */
class Utils {

    static String BusErr = "大哥注意哦，非Activity和Fragment中使用@BusRegister必须和@BusUnRegister一起使用，才能自动生成注册和反注册代码"


    static void importBaseClass(ClassPool pool){
        pool.importPackage()


    }

}
