package com.revature.temp;

public class Primitives {
    //              class   package     subclass    global
    // public       x       x           x           x
    // protected    x       x           x
    // default      x       x
    // private      x

    private byte b; //8 bit integer

    // TODO: refactor this to be private
    public short s; //16 bit integer
    int i; //32 bit integer
    protected long l; //64 bit integer
    private float f; //32 bit floating point
    private double d; //64 bit floating point
    private boolean boo; // true or false
    private char c; //16 bit unicode character


    public Primitives(){

    }

    // constructor
    public Primitives(byte b, short s, int i, long l) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
    }

    // overloaded constructor
    public Primitives(byte b, short s, int i, long l, float f, double d, boolean boo, char c) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
        this.boo = boo;
        this.c = c;
    }

    public byte getB(){
        return b;
    }

    public void setB(byte b){
        this.b = b;
    }
}