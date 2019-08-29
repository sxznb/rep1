package aop;

public class UserImpl implements User{
    public void work() {
        System.out.println("我爱加班");
    }

    public void addUser() {
        System.out.println("我爱加班1");
    }

    public void deleteUser() {
        System.out.println("我爱加班2");
    }

    public void updateUser() {
        int i = 0/0;
        System.out.println("我爱加班3");
    }

    public void queryUser() {
        System.out.println("我爱加班4");
    }

    public void batchDeleteUser() {
       int i = 0/0;
        System.out.println("我爱加班5");

    }
}
