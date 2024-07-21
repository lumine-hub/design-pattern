import com.alibaba.fastjson.JSON;
import com.xlm.chain.base.AuthController;
import com.xlm.chain.base.AuthService;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import org.slf4j.Logger;
import java.util.Date;
/**
 * @author xlm
 * 2024/7/20 下午4:58
 */
public class TestOld {

    private Logger logger = LoggerFactory.getLogger(TestOld.class);


    @Test
    public void test_AuthController() throws ParseException {
        AuthController authController = new AuthController();

        // 模拟三级负责人审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("xlm", "1000998004813441", new Date())));
        logger.info("测试结果：{}", "模拟三级负责人审批，王工");
        AuthService.auth("1000013", "1000998004813441");

        // 模拟二级负责人审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("xlm", "1000998004813441", new Date())));
        logger.info("测试结果：{}", "模拟二级负责人审批，张经理");
        AuthService.auth("1000012", "1000998004813441");

        // 模拟一级负责人审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("xlm", "1000998004813441", new Date())));
        logger.info("测试结果：{}", "模拟一级负责人审批，段总");
        AuthService.auth("1000011", "1000998004813441");

        logger.info("测试结果：{}", "审批完成");
    }
}
