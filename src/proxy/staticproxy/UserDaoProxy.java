package proxy.staticproxy;

/**
 * @author Xu Zheng
 * @description 静态代理对象
 */
public class UserDaoProxy implements IUserDao{
    private IUserDao target;
    public UserDaoProxy(IUserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("extra sout");
        target.save();
        System.out.println("extra sout");
    }
}
