package com.example.ai.gamelife;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by AI on 26.05.16.
 */
public class LifeCycle {
    private Integer[] array;
    private int id;
    private int item;
    private int size;

    LifeCycle(int initSize) {
        this.size = initSize;
    }

    public Integer[] getArray() {
        return this.array;
    }

    public int getItem(int id) {
        return this.array[id];
    }

    public void setItem(int item, int id) {
        this.array[id] = item;
    }

    public void setNewStartArray(boolean rand) {
        int num;
        this.array = new Integer[this.size*this.size];
        Random r = new Random();
        for (int i = 0; i < this.size * this.size; i++) {
            if (rand) {
                num = r.nextInt(1);
            } else {
                num = 0;
            }
            this.array[i] = num;
        }
    }
    public void toggleItem(int id)
    {
        int num;
        if (this.array[id]==1){
            num = 0;
        } else {
            num = 1;
        }
        this.setItem(num, id);
    }

    public int getColor(int id)
    {
        int clr;
        if (this.array[id]==1){
            clr = Color.BLACK;
        } else {
            clr = Color.WHITE;
        }
        return clr;
    }
}
