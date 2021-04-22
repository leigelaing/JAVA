package com.demo01;
/*
    子父类的异常：
     1.如果父类抛出多个异常，子类重写父类的方法时，
     抛出和父类相同的异常或者是父类异常的子类或者不抛出异常
     2.父类方法没有抛出异常，子类重写父类的方法时也不可以抛出异常。此时子类产生该异常，只能捕获处理，
     不能声明处理
    总结：
      父类异常是什么样，子类异常就什么样。
 */
public class Fu {
    public void  show01() throws NullPointerException,ClassCastException{

    }
    public void  show02() throws IndexOutOfBoundsException{

    }
    public void  show03() throws IndexOutOfBoundsException{

    }
    public void  show04(){

    }
    class Zi extends Fu{
      //子类重写父类的方法时,抛出和父类相同的异常
      public void  show01() throws NullPointerException,ClassCastException{

      }
        //子类重写父类的方法时,父类异常的子类
        //ArrayIndexOutOfBoundsException异常是IndexOutOfBoundsException
        //的子异常
        public void  show02() throws ArrayIndexOutOfBoundsException{

        }
        //子类重写父类的方法时,不抛出异常
        public void  show03(){

        }
        //父类方法没有抛出异常，子类重写父类的方法时也不可以抛出异常。
       // public void  show04(){

       // }
        //此时子类产生该异常，只能捕获处理，不能声明处理。
        public void  show04(){
            try {
                throw new Exception("编译器异常");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
