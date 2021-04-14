package shengchanxiaofeiquan;
/*
    创建包子铺类
    创建的注意事项：
    1.包子铺线程与吃货线程的关系——>通信关系（互斥关系）
    2.必须同时同步技术保证两个线程只能有一个在执行
    3.锁对象必须保证唯一，可以使用包子对象作为锁对象
    4.包子铺和吃货的类就需要把包子对象作为参数传递进来
    （1）需要在成员位置创建一个包子变量
    （2）使用带参数的构造方法，为这个包子变量赋值
 */
public class Baozhipu extends  Thread{
     // （1）需要在成员位置创建一个包子变量
    private Baozhi bz;
      //（2）使用带参数的构造方法，为这个包子变量赋值
    public Baozhipu(Baozhi bz) {
        this.bz = bz;
    }
    //设置线程任务run()生产包子
    @Override
    public void run() {
        //定义一个变量
        int count = 0;
        //让包子铺一直生产包子
        while(true){
            //2.必须同时同步技术保证两个线程只能有一个在执行
            synchronized (bz){
                //对包子的状态进行判断
                if(bz.falg == true){
                    //包子铺调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行，包子铺生产包子
                // 增加趣味性，生产两种包子
                if(count%2 == 0){
                    //生产剥皮  三鲜陷  包子
                    bz.pi = "剥皮";
                    bz.xian = "三鲜陷";

                }
                else {
                    //生产冰皮 牛肉大葱陷 包子
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱";
                }
                count++;
                System.out.println("正在拉"+bz.pi+bz.xian+"包子");
                //生产包子需要3秒
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //生产好了，将包子的状态改为true（有）
                bz.falg = true;
                //唤醒吃货线程吃包子
                bz.notify();
                System.out.println("已经生产"+bz.pi+bz.xian+"包子，可以开始吃了");

            }

        }
    }
}
