package prototype.model;

/**
 * @author : []
 * @version : [v1.0]
 * @className : PrototypeTest
 * @description : [原型模式测试]
 * @createTime : [2021/9/17 11:55]
 * @updateUser : []
 * @updateTime : [2021/9/17 11:55]
 * @updateRemark : [描述说明本次修改内容]
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println("obj1 == obj2 ?" + (obj1 == obj2));
    }
}
