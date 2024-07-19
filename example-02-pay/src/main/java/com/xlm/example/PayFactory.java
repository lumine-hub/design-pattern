package com.xlm.example;

import com.xlm.example.annotation.Pay;
import com.xlm.example.impl.PayServiceAbstract;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PayFactory {
	public Map<PayType, PayService> payServiceMap = new ConcurrentHashMap<>();

	public PayFactory(List<PayService> payServices) {
		// todo 这里目前传递的为空，不知道为什么
		payServices.forEach(payService -> {
			Pay annotation = AnnotationUtils.findAnnotation(payService.getClass(), Pay.class);
			if (annotation != null) {
				payServiceMap.put(annotation.payType(), payService);
			}
		});
	}

    public Map<PayType, PayService> openPay() {
		return this.payServiceMap;
	}

	@Getter
	@AllArgsConstructor
	public enum PayType {

		WX_PAY("wx_pay","微信支付"),
		ALI_PAY("ali_pay","支付宝支付"),
		;

		private final String code;
		private final String info;

	}




}
