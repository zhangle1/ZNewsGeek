package zhangle1.com.github.znewsgeek.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

import zhangle1.com.github.znewsgeek.R;
import zhangle1.com.github.znewsgeek.view.widget.SwipeBackLayout;

/**
 * Created by lezi on 2017/11/19.
 */

public abstract class DataBindingActivity<B extends ViewDataBinding> extends AppCompatActivity {

    protected Toolbar toolbar;
    public Context mContext;
    public B mViewBinding;

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View rootView = getLayoutInflater().inflate(this.getLayoutId(), null, false);
        mViewBinding = DataBindingUtil.bind(rootView);
        this.setContentView(getLayoutId(), rootView);
        initView();
    }


    public void setContentView(int layoutResID, View rootView) {
        boolean isNotSwipeBack = layoutResID == R.layout.activity_main || layoutResID == R.layout.activity_flash;
        super.setContentView(isNotSwipeBack ? rootView : getContainer(rootView));
    }


    private View getContainer(View rootView) {
        rootView.setBackgroundColor(getResources().getColor(R.color.alpha_white));
        View container = getLayoutInflater().inflate(R.layout.activity_base, null, false);
        SwipeBackLayout swipeBackLayout = (SwipeBackLayout) container.findViewById(R.id.swipeBackLayout);
        View ivShadow = container.findViewById(R.id.iv_shadow);
        swipeBackLayout.addView(rootView);
        swipeBackLayout.setOnScroll((fs) -> ivShadow.setAlpha(1 - fs));
        return container;
    }




    protected abstract int getLayoutId();


    protected abstract void initView();

}
