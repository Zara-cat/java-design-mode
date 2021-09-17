package prototype.example.example03;

import java.util.Scanner;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : Circle
 * @description : [具体原型对象02，圆]
 * @createTime : [2021/9/17 14:16]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 14:16]
 * @updateRemark : [描述说明本次修改内容]
 */
public class Circle implements IShape {
    @Override
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("圆拷贝失败！！！");
        }
        return circle;
    }

    @Override
    public void countArea() {
        int r = 0;
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆的面积=" + 3.1415 * r * r + "\n");
    }
}
