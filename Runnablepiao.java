package com.gaga;

/*
实现买票案例
线程安全问题解决方案二：
        同步方法  来解决线程安全问题
    使用步骤：
    1.把访问了共享数据的代码抽取出来，放到一个方法中
    2.在方法上添加synchronized修饰符
    格式
    修饰符  synchronized  返回值类型 方法名（参数列表）{
     可能出现线程安全问题的代码，（访问了共享数据的代码）
    }
    
    定义一个同步方法
    同步方法也会把方法内部的代码锁住
    只让一个线程执行
    同步方法的锁对象是谁？
    就实现类对象new RUnnable()



 */
public class Runnablepiao implements Runnable {
    //定义一个多个线程共享的票源
    private static int tic = 100;

    @Override
    public void run() {
        while (true) {
            jingtaitongbu();
        }
    }

    //静态方法代码同步
   /*
       静态的同步方法
       锁对象是谁？
       不能是this
       因为this是创建对象之后产生的，静态方法优先于对象。
       静态方法的锁对象是本类中的class属性——>class文件对象（反射）。
    */
    public static synchronized void jingtaitongbu() {
        //先判断票是否有剩余
        if (tic > 0) {     //静态方法只能访问静态变量
            try {
                //提高安全问题出现的概率，让程序睡眠一下
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //票有剩余tic--
            System.out.println(Thread.currentThread().getName() + "正在卖第" + tic + "票");
            tic--;
        }

    }
}







    /*
    //定义一个同步方法
    public synchronized  void tongbu(){
        //先判断票是否有剩余
        if(tic > 0){
            try {
                //提高安全问题出现的概率，让程序睡眠一下
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //票有剩余tic--
            System.out.println(Thread.currentThread().getName()+"正在卖第"+tic+"票");
            tic--;
        }


    }
*/

