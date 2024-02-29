package pages;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OrderReleasePage {
    private static final Map<String, String> ELEMENT_XPATHS = mainIframeMap();

    private static Map<String, String> mainIframeMap() {
        Map<String, String> map = new HashMap<>();
        map.put("mainIFrameStr", "//iframe[@id='mainIFrame']");

        map.put("orderReleaseIDInput", "//input[@aria-label='Order Release ID']");
        map.put("searchBtn", "//button[@name='search_button']");

        return Collections.unmodifiableMap(map);
    }

    public static String getWebElementMainIframe(String elementKey) {
        return ELEMENT_XPATHS.getOrDefault(elementKey, "");
    }
}

