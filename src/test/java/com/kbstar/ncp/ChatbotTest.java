 package com.kbstar.ncp;

import com.shop.util.ChatbotUtil;
import com.kbstar.dto.Cust;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

 @Slf4j
@SpringBootTest
class ChatbotTest {

    @Test
    void contextLoads() throws IOException {
        String txt = "채팅하자";

        String result = ChatbotUtil.chat(txt);

        log.info("--------------------------------------------");
        log.info(result);
        log.info("--------------------------------------------");
    }
}
