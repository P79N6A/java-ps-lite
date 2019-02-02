package model.internal;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author chongfeng.xcf@alibaba-inc.com
 * @Date 2019/2/2
 **/
public class Env {
    private static Env instance;
    private Map<String, String> envMap;

    private Env(Map<String, String> envMap) {
        this.envMap = envMap;
    }

    public static void init(Map<String, String> envMap) {
        instance = new Env(envMap);
    }

    public static Env getInstance() {
        return instance;
    }

    public String getEnv(String key) {
        return envMap.containsKey(key) ? envMap.get(key) : System.getenv(key);
    }
}
