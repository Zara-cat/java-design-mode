package singleton.example.lazysingleton;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : SingletonLazy
 * @description : [测试]
 * @createTime : [2021/9/17 10:35]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 10:35]
 * @updateRemark : [描述说明本次修改内容]
 */
public class SingletonLazy {
    public static void main(String[] args) {
        President zt1 = President.getInstance();
        //输出zt1的名字
        zt1.getName();
        President zt2 = President.getInstance();
        //输出zt2的名字
        zt2.getName();
        //检验是否是一个对象
        if (zt1 == zt2){
            System.out.println("他们是同一个人");
        }else {
            System.out.println("他们不是同一个人");
        }
    }
}
