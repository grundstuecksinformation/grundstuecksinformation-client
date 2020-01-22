package ch.so.agi.grundstuecksinformation.client;

import com.google.gwt.i18n.client.Messages;

public interface MainMessages extends Messages {
    @DefaultMessage("Concerned Themes")
    String concernedThemes();
    
    @DefaultMessage("Real estate {0} in {1}")
    String resultHeader(String number, String municipality);
}
