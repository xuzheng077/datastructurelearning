package proxy.staticproxy;

/**
 * @author Xu Zheng
 * @description
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }
}
