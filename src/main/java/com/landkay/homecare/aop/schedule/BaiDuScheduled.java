package com.landkay.homecare.aop.schedule;

import com.landkay.homecare.utils.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 90818
 */
@Slf4j
@Configuration
@EnableScheduling
public class BaiDuScheduled {

    /**
     * Description // 秒、分、时、日、月、年
     * @param
     * @Author landkay
     * @Date 10:38 2018/8/2
     * @return 
     **/
    @Scheduled(cron = "0/60 * * * * ?")
    public void pushDataScheduled() {

        String url = "http://baijiahao.baidu.com/s?id=1607639342822187726";
        Map<String, Object> paramsMap = new HashMap(8);
        try {
            StringBuffer stringBuffer = HttpUtils.URLGet(url, paramsMap);
            log.info("访问百家号响应参数: " + stringBuffer.toString());
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }
}