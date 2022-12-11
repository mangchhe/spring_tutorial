package me.hajoo.async.v2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class ThreadPoolConfig2 {


    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 25;
    private static final int QUEUE_CAPACITY = 10;
    private static final String THREAD_NAME_PREFIX = "SnackV2-";

    @Bean("threadPoolTaskExecutor2")
    public Executor threadPoolTaskExecutor2() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(CORE_POOL_SIZE);
        taskExecutor.setMaxPoolSize(MAX_POOL_SIZE);
        taskExecutor.setQueueCapacity(QUEUE_CAPACITY);
        taskExecutor.setThreadNamePrefix(THREAD_NAME_PREFIX);
        taskExecutor.initialize();
        return taskExecutor;
    }
}
