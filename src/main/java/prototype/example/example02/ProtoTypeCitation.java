package prototype.example.example02;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : ProtoTypeCitation
 * @description : [描述说明该类的功能]
 * @createTime : [2021/9/17 13:58]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 13:58]
 * @updateRemark : [描述说明本次修改内容]
 */
public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation stu1 = new Citation("张三", "同学：在2021学年第一学期中，表现优秀，被评为三号学生", " java学院");
        stu1.display();
        //拷贝对象
        Citation stu2 = (Citation) stu1.clone();
        //name重新赋值
        stu2.setName("李四");
        stu2.display();
    }
}
/**
 * 在克隆对象中，如果个别属性不一样，可以在具体原型类中 set方式来进行部分属性的修改
 *
 */