package prototype.example.example03;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : IShape
 * @description : [抽象出方法，具体原型类继承就ok]
 * @createTime : [2021/9/17 14:11]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 14:11]
 * @updateRemark : [描述说明本次修改内容]
 */
public interface IShape extends Cloneable{
    //拷贝
    public Object clone();
    //计算面积
    public void countArea();
}
