package br.com.lbomfim.dao.generic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lucas
 *
 */

public class SingletonMap {

    private static SingletonMap singletonMap;

    protected Map<Class, Map<?, ?>> map;

    private SingletonMap() {
        map = new HashMap<>();
    }

    public static SingletonMap getInstance() {
        if (singletonMap == null) {
            singletonMap = new SingletonMap();
        }
        return singletonMap;
    }

    public Map<Class, Map<?, ?>> getMap() {
        return this.map;
    }
}
