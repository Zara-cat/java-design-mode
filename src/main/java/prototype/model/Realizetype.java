package prototype.model;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : Realizetype
 * @description : [使用浅拷贝，原型模式克隆对象]
 * @createTime : [2021/9/17 11:51]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 11:51]
 * @updateRemark : [描述说明本次修改内容]
 */
public class Realizetype implements Cloneable{

    public Realizetype(){
        System.out.println("具体原型对象创建成功！");
    }

    public Object clone () throws CloneNotSupportedException{
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }

}
/**
 * java 中的 Object 类提供了浅克隆的 clone() 方法，具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆，这里的 Cloneable 接口就是抽象原型类
 */
