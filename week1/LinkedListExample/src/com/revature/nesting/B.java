package com.revature.nesting;


/*
    B is an A that has an A and a B
 */
public class B extends A{

    private A a;
    private B b;

    public String getSomethingPrivate(){
        return super.getSomethingPrivate();
    }


    @Override
    public void printSomething() {
        super.printSomething();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
