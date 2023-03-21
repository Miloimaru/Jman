package nl.tudelft.jpacman.ui;

public class ThemeConfig {
    private static String config;

    public void setConfig(String config) {
        ThemeConfig.config = config;
        System.out.println(config);
    }

    public static String getConfig() {
        return config;
    }
}
