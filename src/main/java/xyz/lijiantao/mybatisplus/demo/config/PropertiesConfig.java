package xyz.lijiantao.mybatisplus.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jiantao Li on 2018/12/29 15:04
 */
@Component
@ConfigurationProperties()
public class PropertiesConfig {

    public Map<String,String> properties = new HashMap<String, String>();


}
