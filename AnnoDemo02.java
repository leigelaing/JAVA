package com.demo03;
/*
JDK预定义的一些注解：
@Override:检测被该注解标注的方法，是否是继承父类的（父接口）
@Deprecated：将该注解标注的内容，表示已过时。
@SuppressWarnings：压制警告
   *一般传递参数all  @SuppressWarnings("all")
 */
@SuppressWarnings("all")//压制所有 类的警告
public class AnnoDemo02 {
    @Override
    public String toString() {
        return super.toString();
    }
    @Deprecated
    public void show01(){
        //有缺陷
    }
    @SuppressWarnings("all")//压制所有   方法的警告
    public void show02(){
      //用show02方法代替show01
    }
    public void demo(){
        show01();
    }

}
