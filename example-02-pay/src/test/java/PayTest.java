import com.xlm.example.PayFactory;
import com.xlm.example.PayService;
import com.xlm.example.entity.PayParams;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author xlm
 * 2024/7/19 下午11:10
 */

public class PayTest {

    @Autowired
    private PayFactory payFactory;

    @Test
    public void test() {
        Map<PayFactory.PayType, PayService> payTypePayServiceMap = payFactory.openPay();
        PayService payService = payTypePayServiceMap.get(PayFactory.PayType.ALI_PAY);
        PayParams payParams = new PayParams();
        payParams.setAmount(new BigDecimal(100));
        payService.pay(payParams);

    }
}
