package com.nata.duckhunt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Duck2 extends Duck1{

    Bitmap[]duck = new Bitmap[6];

    public Duck2(Context context) {
        super(context);
        duck[0]= BitmapFactory.decodeResource(context.getResources(),R.drawable.duck2_0);
        duck[1]= BitmapFactory.decodeResource(context.getResources(),R.drawable.duck2_1);
        duck[2]= BitmapFactory.decodeResource(context.getResources(),R.drawable.duck2_2);
        duck[3]= BitmapFactory.decodeResource(context.getResources(),R.drawable.duck2_3);
        duck[4]= BitmapFactory.decodeResource(context.getResources(),R.drawable.duck2_4);
        duck[5]= BitmapFactory.decodeResource(context.getResources(),R.drawable.duck2_5);
        resetPosition();
    }

    @Override
    public Bitmap getBitmap() {
        return duck[duckFrame];
    }

    @Override
    public int getWidth() {
        return duck[0].getWidth();
    }

    @Override
    public int getHeight() {
        return duck[0].getHeight();
    }

    @Override
    public void resetPosition() {
        duckX = GameView.dWidht + random.nextInt(1500);
        duckY = random.nextInt(400);
        velocity = 16 + random.nextInt(19);
    }
}
