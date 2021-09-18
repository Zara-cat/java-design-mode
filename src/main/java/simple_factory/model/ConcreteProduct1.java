package simple_factory.model;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : ConcreteProduct1
 * @description : [具体产品1]
 * @createTime : [2021/9/17 17:43]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 17:43]
 * @updateRemark : [描述说明本次修改内容]
 */
public class ConcreteProduct1 implements Product{
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
