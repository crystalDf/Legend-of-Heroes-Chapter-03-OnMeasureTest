package com.star.onmeasuretest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;


public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        setMeasuredDimension(measureWidth(widthMeasureSpec), measureHeight(heightMeasureSpec));
    }

    private int measureWidth(int widthMeasureSpec) {

        int result = 0;

        int specMode = MeasureSpec.getMode(widthMeasureSpec);
        int specSize = MeasureSpec.getSize(widthMeasureSpec);

        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else if (specMode == MeasureSpec.AT_MOST) {
            result = Math.min(200, specSize);
        }

        return result;
    }

    private int measureHeight(int heightMeasureSpec) {

        int result = 0;

        int specMode = MeasureSpec.getMode(heightMeasureSpec);
        int specSize = MeasureSpec.getSize(heightMeasureSpec);

        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else if (specMode == MeasureSpec.AT_MOST) {
            result = Math.min(200, specSize);
        }

        return result;
    }

}
