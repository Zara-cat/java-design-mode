package prototype.example.example03;

import java.util.Scanner;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : Square
 * @description : [原型具体类01，正方形]
 * @createTime : [2021/9/17 14:13]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 14:13]
 * @updateRemark : [描述说明本次修改内容]
 */
public class Square implements IShape {
    @Override
    public Object clone() {
        Square square = null;
        try {
            square = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("正方形拷贝失败！！！");
        }
        return square;
    }

    @Override
    public void countArea() {
        int a = 0;
        System.out.print("这是一个正方形，请输入它的边长：");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("该正方形的面积=" + a * a + "\n");
    }
}
