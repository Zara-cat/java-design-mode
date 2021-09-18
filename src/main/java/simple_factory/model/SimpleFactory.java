package simple_factory.model;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : SimpleFactory
 * @description : [简单工厂]
 * @createTime : [2021/9/17 17:48]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/17 17:48]
 * @updateRemark : [描述说明本次修改内容]
 */
public class SimpleFactory {
    public static Product makeProduct(int kind) {
        switch (kind) {
            case Const.PRODUCT_A:
                return new ConcreteProduct1();
            case Const.PRODUCT_B:
                return new ConcreteProduct2();
        }
        return null;
    }
}
