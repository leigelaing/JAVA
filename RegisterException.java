package Demo01;
/*
自定义了一个  业务逻辑异常
 */
public class RegisterException extends Exception {
    //添加一个空参数的构造方法；
    public RegisterException() {
        super();//调用父类的空参构造方法
    }
    /*
    // 添加一个带异常信息的构造方法；
      查看源码发现，所有的异常类都会有一个带异常信息的构造方法，方法内部会调用父类带异常信息的构造方法
      ，让父类来处理异常信息。
     */
    public RegisterException(String message) {
        super(message);
    }
}
