package com.revature.nesting;

public class C extends B {

    private D d;

    private class D{
        String something = "something";

        public String getSomething(){
            return something;
        }


        private class E{


            private class F{


            }
        }
    }

    public C(){
        d = new D();
    }

    public String getSomething(){
        return d.getSomething();
    }

}
