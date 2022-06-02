package proxy.staticproxy;

/**
 * @author Xu Zheng
 * @description 目标对象
 */
public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("save........");
    }
}
