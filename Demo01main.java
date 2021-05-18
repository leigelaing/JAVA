package Demo01;

public class Demo01main {
    public static void main(String[] args) {

         new jiekou() {
            @Override
            public void method1() {
                System.out.println("实现");
            }
        };
    }
}

