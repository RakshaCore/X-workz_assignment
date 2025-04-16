package com.xworkz.HeavyDriver.Internal;

public class HtmlMessageFormatter implements MessageFormatter {
    @Override
    public String formatMessage() {
        return "<html><body><h1>Message</h1></body></html>";
    }

    @Override
    public String formatError() {
        return "<html><body><h1>Error</h1></body></html>";
    }

    @Override
    public String formatWarning() {
        return "<html><body><h1>Warning</h1></body></html>";
    }

}
