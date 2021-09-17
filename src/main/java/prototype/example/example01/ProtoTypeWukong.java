package prototype.example.example01;

import javax.swing.*;
import java.awt.*;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : ProtoTypeWukong
 * @description : [案例一访问类]
 * @createTime : [2021/9/17 12:06]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 12:06]
 * @updateRemark : [描述说明本次修改内容]
 */
public class ProtoTypeWukong {
    public static void main(String[] args) {
        JFrame jf = new JFrame("原型模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        //第一次new出来对象
        SunWukong obj1 = new SunWukong();
        //obj1添加到视图中
        contentPane.add(obj1);
        //使用SunWuKong的clone复制对象
        SunWukong obj2 = (SunWukong) obj1.clone();
        //obj2添加到视图中
        contentPane.add(obj2);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//结果显示两个一样的孙悟空 ，说明我们复制成功并且两个孙悟空不是同一个对象

//这个例子用原型模式除了可以生成相同的对象，还可以生成相似的对象（如example02例子）
