package com.octiq.test.app;

import com.google.gson.Gson;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "octiq";
        Map<String, String> payload = Map.of(
                "greeting", "Hello, " + StringUtils.capitalize(name) + "!",
                "reversed", StringUtils.reverse(name));
        System.out.println(new Gson().toJson(payload));
    }
}
