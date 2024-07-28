package ir.anisa.client.discount;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("DISCOUNT")
public interface DiscountClient {

    @GetMapping("/api/v1/discount/get/{code}")
    CouponDTO findByCouponCode(@PathVariable("code") String code);

}
