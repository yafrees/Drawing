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


//        /**
//         *绘制椭圆
//         * */
//        Paint paint = new Paint();
//        //去锯齿
//        paint.setAntiAlias(true);
//        //设置颜色
//        paint.setColor(getResources().getColor(android.R.color.holo_orange_dark));
//        //绘制椭圆
//        canvas.drawOval(100, 100, 500, 300, paint);
//        //设置空心Style
//        paint.setStyle(Paint.Style.STROKE);
//        //设置空心边框的宽度
//        paint.setStrokeWidth(20);
//        //绘制空心椭圆
//        canvas.drawOval(100, 400, 600, 800, paint);


//        /**
//         * 绘制弧
//         * */
//        Paint paint = new Paint();
//        //去锯齿
//        paint.setAntiAlias(true);
//        //设置颜色
//        paint.setColor(getResources().getColor(android.R.color.holo_orange_dark));
//        RectF rel = new RectF(100, 100, 300, 300);
//        //实心圆弧
//        canvas.drawArc(rel, 0, 270, false, paint);
//        //实心圆弧 将圆心包含在内
//        RectF rel2 = new RectF(100, 400, 300, 600);
//        canvas.drawArc(rel2, 0, 270, true, paint);
//        //设置空心Style
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(20);
//
//        RectF rel3 = new RectF(100, 700, 300, 900);
//        canvas.drawArc(rel3, 0, 270, false, paint);
//
//        RectF rel4 = new RectF(100, 1000, 300, 1200);
//        canvas.drawArc(rel4, 0, 270, true, paint);



//        /**
//         * 绘制文本
//         * */
//        Paint paint = new Paint();
//        //去锯齿
//        paint.setAntiAlias(true);
//        //设置颜色
//        paint.setColor(getResources().getColor(android.R.color.holo_orange_dark));
//        paint.setTextSize(100);
//        //绘制文本
//        canvas.drawText("jEh", 80, 150, paint);
        

    }
}
