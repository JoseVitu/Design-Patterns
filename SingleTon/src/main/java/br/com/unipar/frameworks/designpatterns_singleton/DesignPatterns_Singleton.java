package br.com.unipar.frameworks.designpatterns_singleton;


public class DesignPatterns_Singleton {

    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("printer", "elgin i9");
        
        ConfigManager otherManager = ConfigManager.getInstance();
        System.out.println(otherManager.get("printer"));
    }
}
