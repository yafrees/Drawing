package com.yf.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by YF on 2016/6/6.
 */
public class CustomView extends View {

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        //去锯齿
        paint.setAntiAlias(true);
        //设置颜色
        paint.setColor(getResources().getColor(android.R.color.holo_blue_light));
        //绘制普通圆形
        canvas.drawCircle(200 , 200 , 100 , paint);
        //设置空心的style
        paint.setStyle(Paint.Style.STROKE);
        //设置空心边框的宽度
        paint.setStrokeWidth(20);
        //绘制空心圆
        canvas.drawCircle(200 , 50 , 90 , paint);






    }
}
