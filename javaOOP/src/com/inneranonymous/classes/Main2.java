package com.inneranonymous.classes;

public class Main2 {

    public interface Showable {
        public void print(int x);
    };

    class p implements Showable{
        @Override
        public void print(int y) {
            System.out.println("showable " +y);
        }
    }



    public static void main(String[] args) {
        Showable showable;
        new Showable(){
            @Override
            public void print(int x) {
                System.out.println("showable" +x);
            }
        };

        showable = (y) ->System.out.println("print" + y);
        showable.print(6);

    }
}
