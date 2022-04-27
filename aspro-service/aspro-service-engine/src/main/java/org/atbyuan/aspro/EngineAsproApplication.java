package org.atbyuan.aspro;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author atbyuan
 * @since 2022/4/25 09:25
 */
@Slf4j
@EnableAsync
@SpringBootApplication
public class EngineAsproApplication {

    public static void main(String[] args) {
        SpringApplication.run(EngineAsproApplication.class, args);
        log.info("=====>>> engine-aspro start success <<<=====");
    }

}
