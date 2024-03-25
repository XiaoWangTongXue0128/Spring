package domain;

public class Student {
    private Integer sid;
    private String sname;
    private String ssex;
    private Integer sage;

    public Student() {
        System.out.println("Student无参数的构造方法");
    }

    public Student(Integer sid, String sname, String ssex, Integer sage) {
        this.sid = sid;
        this.sname = sname;
        this.ssex = ssex;
        this.sage = sage;
        System.out.println("Student带参数的构造方法");
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "sid=" + sid +
//                ", sname='" + sname + '\'' +
//                ", ssex='" + ssex + '\'' +
//                ", sage=" + sage +
//                '}';
//    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
        System.out.println("sid方法赋值");
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }
}
