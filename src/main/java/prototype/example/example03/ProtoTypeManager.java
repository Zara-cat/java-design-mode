package prototype.example.example03;

import java.util.HashMap;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : ProtoTypeManager
 * @description : [原型管理器]
 * @createTime : [2021/9/17 14:18]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 14:18]
 * @updateRemark : [描述说明本次修改内容]
 */
public class ProtoTypeManager {
    private HashMap<String,IShape> ht = new HashMap<String,IShape>();

    //容器先new出对象存储map中
    public ProtoTypeManager(){
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void addshape(String key, IShape obj) {
        ht.put(key, obj);
    }

    public IShape getShape(String key) {
        IShape temp = ht.get(key);
        return (IShape) temp.clone();
    }
}
