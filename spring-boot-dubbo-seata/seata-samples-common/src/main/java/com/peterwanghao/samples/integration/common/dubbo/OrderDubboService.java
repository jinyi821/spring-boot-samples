package com.peterwanghao.samples.integration.common.dubbo;

import com.peterwanghao.samples.integration.common.dto.OrderDTO;
import com.peterwanghao.samples.integration.common.response.ObjectResponse;

/**
 * @Author: heshouyou
 * @Description  订单服务接口
 * @Date Created in 2019/1/13 16:28
 */
public interface OrderDubboService {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
