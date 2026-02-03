package com.hk.boot.module.infra.framework.file.config;

import com.hk.boot.module.infra.framework.file.core.client.FileClientFactory;
import com.hk.boot.module.infra.framework.file.core.client.FileClientFactoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文件配置类
 *
 * @author maxiaodong
 */
@Configuration(proxyBeanMethods = false)
public class HuikeFileAutoConfiguration {

    @Bean
    public FileClientFactory fileClientFactory() {
        return new FileClientFactoryImpl();
    }

}
