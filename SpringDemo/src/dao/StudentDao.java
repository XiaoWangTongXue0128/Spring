package dao;

public class StudentDao {
    private String xx;
    public void daoMethod() {
        System.out.println("dao Method"+getXx());

    }

    public StudentDao() {
        System.out.println("dao 无参构造方法");
    }

    public StudentDao(String xx) {
        this.xx = xx;
    }

    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }
}
