import com.xlm.strategy.event.MJCouponDiscount;
import com.xlm.strategy.event.ZJCouponDiscount;
import com.xlm.strategy.old.Context;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 * @author xlm
 * 2024/7/19 下午4:07
 */

@Slf4j
public class StrategyTest {

    @Test
    public void test_zj() {
        // 直减；100-10，商品100元
        Context<Double> context = new Context<Double>(new ZJCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(10D, new BigDecimal(100));
        log.info("测试结果：直减优惠后金额 {}", discountAmount);
    }
}
