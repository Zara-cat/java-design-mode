package prototype.example.example03;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : ProtoTypeShape
 * @description : [使用原型管理器创建对象测试类]
 * @createTime : [2021/9/17 14:22]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 14:22]
 * @updateRemark : [描述说明本次修改内容]
 */
public class ProtoTypeShape {
    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Circle circle = (Circle) pm.getShape("Circle");
        circle.countArea();
        Square square = (Square) pm.getShape("Square");
        square.countArea();
    }
}
/**
 * 原型模式可扩展为带原型管理器的原型模式，它在原型模式的基础上增加了一个原型管理器 PrototypeManager 类。该类用 HashMap 保存多个复制的原型
 */
