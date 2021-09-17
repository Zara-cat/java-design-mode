package singleton.example.hungrysingleton;

import javax.swing.*;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : Bajie
 * @description : [用饿汉式单例模式模拟产生猪八戒对象。]
 * @createTime : [2021/9/17 10:51]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 10:51]
 * @updateRemark : [描述说明本次修改内容]
 */
public class Bajie extends JPanel {
    private static Bajie instance = new Bajie();
    private Bajie(){
        JLabel label = new JLabel(new ImageIcon("src/main/resources/image/bajie.png"));
        this.add(label);
    }
    public static Bajie getInstance(){
        return instance;
    }
}
