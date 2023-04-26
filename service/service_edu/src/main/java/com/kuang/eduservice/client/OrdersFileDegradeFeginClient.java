package com.kuang.eduservice.client;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: YangSong
 * @Date: 2023-4-4 13:12
 */
@Component
public class OrdersFileDegradeFeginClient implements OrdersClient{

    @Override
    public boolean isBuyCourse(String courseId, String memberId) {
        return false;
    }
}
