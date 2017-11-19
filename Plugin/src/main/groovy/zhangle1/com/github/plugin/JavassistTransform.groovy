package zhangle1.com.github.plugin

import com.android.build.api.transform.Context
import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform
import com.android.build.api.transform.TransformException
import com.android.build.api.transform.TransformInput
import com.android.build.api.transform.TransformOutputProvider
import com.google.common.collect.Sets
import org.gradle.api.Project

/**
 * Created by lezi on 2017/11/19.
 */
class JavassistTransform extends  Transform {
    private Project project


    JavassistTransform(Project project) {
        this.project = project
    }

    @Override
    String getName() {
        return "JavassistTrans"
    }

    @Override
    Set<QualifiedContent.ContentType> getInputTypes() {
        return Sets.immutableEnumSet(QualifiedContent.DefaultContentType.CLASSES)
    }

    @Override
    Set<? super QualifiedContent.Scope> getScopes() {

        return Sets.immutableEnumSet(QualifiedContent.Scope.PROJECT, QualifiedContent.Scope.PROJECT_LOCAL_DEPS,
                QualifiedContent.Scope.SUB_PROJECTS, QualifiedContent.Scope.SUB_PROJECTS_LOCAL_DEPS,
                QualifiedContent.Scope.EXTERNAL_LIBRARIES)
    }

    @Override
    boolean isIncremental() {
        return false
    }

    @Override
    void transform(Context context, Collection<TransformInput> inputs,
                   Collection<TransformInput> referencedInputs,
                   TransformOutputProvider outputProvider, boolean isIncremental)
            throws IOException, TransformException, InterruptedException {


        def startTime=System.currentTimeMillis();

        inputs.each {TransformInput input->
            try{

            }catch (Exception e){
                input.jarInputs.each {




                }
            }


        }

        super.transform(context, inputs, referencedInputs, outputProvider, isIncremental)
    }
}
