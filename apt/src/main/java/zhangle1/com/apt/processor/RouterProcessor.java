package zhangle1.com.apt.processor;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Modifier;

import zhangle1.com.apt.AnnotationProcessor;
import zhangle1.com.apt.inter.IProcessor;



import static com.squareup.javapoet.TypeSpec.classBuilder;
import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.PUBLIC;
import static javax.lang.model.element.Modifier.STATIC;
/**
 * Created by lezi on 2017/11/15.
 */

public class RouterProcessor  implements IProcessor{
    @Override
    public void process(RoundEnvironment roundEnv, AnnotationProcessor mAbstractProcessor) {
        
        String  CLASS_NAME="TRouter";
        String javaDocComments = "@ 全局路由器 此类由apt自动生成";
        TypeSpec.Builder tb = classBuilder(CLASS_NAME).addModifiers(PUBLIC, FINAL).addJavadoc(javaDocComments);

        FieldSpec extraField = FieldSpec.builder(ParameterizedTypeName.get(HashMap.class, String.class, Object.class), "mCurActivityExtra")
                .addModifiers(PUBLIC,STATIC)
                .build();

        tb.addField(extraField);

        MethodSpec.Builder goMethod = MethodSpec.methodBuilder("go")
                .addJavadoc(javaDocComments)
                .addModifiers(PUBLIC, STATIC)
                .addParameter(String.class, "name").addParameter(HashMap.class, "extra")
                .addParameter(ClassName.get("android.view", "View"), "view");

        MethodSpec.methodBuilder("bind")
                .addJavadoc(javaDocComments)
                .addModifiers(PUBLIC,STATIC)
                .addParameter(ClassName.get("android.app","Activity"),",Context");

        List<ClassName> mList=new ArrayList<>();
        CodeBlock.Builder blockBuilderGo=CodeBlock.builder();
        CodeBlock.Builder blockBuilderBind = CodeBlock.builder();



    }
}
