package shengchanxiaofeiquan;
/*

 */
public class ChiHuo extends Thread {
    // （1）需要在成员位置创建一个包子变量
    private Baozhi bz;
    //（2）使用带参数的构造方法，为这个包子变量赋值
    public ChiHuo (Baozhi bz) {
        this.bz = bz;
    }
    //重载run方法 ：吃包子
    @Override
    public void run() {
        //使用死循环，一直吃包子
        while(true){
           // 2.必须同时同步技术保证两个线程只能有一个在执行
            synchronized (bz){
               //对包子的状态进行判断
               if(bz.falg == false){
                   //吃货调用wait方法进行等待状态
                   try {
                       bz.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }

               }
               //被唤醒之后执行代码，吃包子
                System.out.println("正在吃"+bz.pi+bz.xian+"包子");
                //吃完包子修改包子的状态  false（没有）
                bz.falg = false;
                //唤醒包子铺继续生产
                bz.notify();
                System.out.println("已经吃完"+bz.pi+bz.xian+"包子，赶紧生产");
                System.out.println("--------------------------------------------");
            }
        }
    }
}
