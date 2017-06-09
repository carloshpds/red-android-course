package com.gestta.gestta_app.widgets;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by carloshenrique on 08/06/17.
 */

public class MyTextView extends AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
        initialize();
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    private void initialize(){
        if(!isInEditMode()) {
        }
    }
}
