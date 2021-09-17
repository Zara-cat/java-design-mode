package singleton.example.lazysingleton;

/**
 * @author : [王振宇‘]
 * @version : [v1.0]
 * @className : President
 * @description : [用懒汉式单例模式模拟产生美国当今总统对象。]
 * @createTime : [2021/9/17 10:37]
 * @updateUser : [王振宇‘]
 * @updateTime : [2021/9/17 10:37]
 * @updateRemark : [描述说明本次修改内容]
 */
public class President {
    private static volatile President instance = null;

    //private避免外部实例对象
    private President(){
        System.out.println("产生一个总统");
    }
    public static synchronized President getInstance(){
        if (instance == null){
            instance = new President();
        } else {
            System.out.println("已经有一个总统了，不能再创建了");
        }
        return instance;
    }
    public void getName() {
        System.out.println("我是美国总统：特朗普。");
    }
}
