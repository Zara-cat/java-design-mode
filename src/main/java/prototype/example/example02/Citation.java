package prototype.example.example02;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : Citation
 * @description : [奖状模板]
 * @createTime : [2021/9/17 13:54]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 13:54]
 * @updateRemark : [描述说明本次修改内容]
 */
public class Citation implements Cloneable {
    private String name;
    private String info;
    private String college;
    public Citation(String name,String info,String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功！！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println(name+info+college);
    }
    //克隆
    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！！！");
        return (Citation) super.clone();
    }
}
