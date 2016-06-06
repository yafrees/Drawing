package com.yf.drawing;

import android.content.Context;
import android.graphics.Canvas;
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

//        /**
//         * 绘制圆形
//         * */
//        Paint paint = new Paint();
//        //去锯齿
//        paint.setAntiAlias(true);
//        //设置颜色
//        paint.setColor(getResources().getColor(android.R.color.holo_blue_light));
//        //绘制普通圆形
//        canvas.drawCircle(200 , 200 , 100 , paint);
//        //设置空心的style
//        paint.setStyle(Paint.Style.STROKE);
//        //设置空心边框的宽度
//        paint.setStrokeWidth(20);
//        //绘制空心圆
//        canvas.drawCircle(200 , 500 , 90 , paint);


//        /**
//         * 绘制矩形
//         * */
//        Paint paint = new Paint();
//        paint.setAntiAlias(true);
//        paint.setColor(getResources().getColor(android.R.color.holo_orange_light));
//        //绘制正方形
//        canvas.drawRect(100,100,300,300,paint);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(10);
//        //绘制空心矩形
//        canvas.drawRect(100,400,400,800,paint);


//        /**
//         * 绘制圆角矩形
//         * */
//        Paint paint = new Paint();
//        paint.setAntiAlias(true);
//        paint.setColor(getResources().getColor(android.R.color.holo_green_light));
//        //绘制圆角矩形
//        canvas.drawRoundRect(100,100,300,300,30,30,paint);
//        //设置空心style
//        paint.setStyle(Paint.Style.STROKE);
//        //设置空心宽度的边框
//        paint.setStrokeWidth(20);
//        //绘制空心圆矩形
//        canvas.drawRoundRect(100,400,600,800,30,30,paint);








    }
}
