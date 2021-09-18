package simple_factory.model;

/**
 * @author : [王振宇]
 * @version : [v1.0]
 * @className : SimpleFactoryTest
 * @description : [简单工厂测试]
 * @createTime : [2021/9/18 10:36]
 * @updateUser : [王振宇]
 * @updateTime : [2021/9/18 10:36]
 * @updateRemark : [描述说明本次修改内容]
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Product product01 = SimpleFactory.makeProduct(0);
        product01.show();
        Product product02 = SimpleFactory.makeProduct(1);
        product02.show();
    }
}

