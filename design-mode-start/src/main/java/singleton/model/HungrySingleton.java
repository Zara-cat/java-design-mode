package singleton.model;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : HungrySingleton
 * @description : [描述说明该类的功能]
 * @createTime : [2021/9/16 17:22]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/16 17:22]
 * @updateRemark : [描述说明本次修改内容]
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}

/**
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
 */