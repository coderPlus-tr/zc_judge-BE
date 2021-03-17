package edu.zc.oj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author keep-looking
 * @date 2021/3/14 - 16:40
 */

@SpringBootApplication
@MapperScan("edu.zc.oj.mapper")
public class JudgeBEApplication {
    public static void main(String[] args) {
        SpringApplication.run(JudgeBEApplication.class, args);
    }
}
