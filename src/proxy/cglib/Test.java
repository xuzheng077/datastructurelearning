package proxy.cglib;

/**
 * @author Xu Zheng
 * @description
 */
public class Test {
    public static void main(String[] args) {
        UserDao target = new UserDao();
        System.out.println(target.getClass());
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save();
    }
}
