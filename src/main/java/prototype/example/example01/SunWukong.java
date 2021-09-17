package prototype.example.example01;

import javax.swing.*;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : SunWukong
 * @description : [案例一具体原型实现类]
 * @createTime : [2021/9/17 12:00]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 12:00]
 * @updateRemark : [描述说明本次修改内容]
 */
public class SunWukong extends JPanel implements Cloneable{
    private static final long serialVersionUID = 5543049531872119328L;

    public SunWukong(){
        JLabel l1 = new JLabel(new ImageIcon("src/main/resources/image/Wukong.jpg"));
        this.add(l1);
    }

    public  Object clone(){
        SunWukong sunWukong = null;
        try {
            sunWukong = (SunWukong) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("拷贝孙悟空发送异常，失败了！！！");

        }
        return sunWukong;
    }
}
/**
 * 用原型模式模拟“孙悟空”复制自己。
 *      分析：孙悟空拔下猴毛轻轻一吹就变出很多孙悟空，这实际上是用到了原型模式。
 *      这里的孙悟空类 SunWukong 是具体原型类，而 Java 中的 Cloneable 接口是抽象原型类。
 */
