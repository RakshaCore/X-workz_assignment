package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AIPersonalizedShoppingAssistant;
import com.xworkz.afterYudagi.Internal.ShoppingAssistant;

public class AmazonBot
{
    public void useBot(ShoppingAssistant assistant)
    {
        assistant.recommendProducts();
        assistant.comparePrices();
        assistant.analyzeShoppingTrends();
        assistant.provideDiscountAlerts();
        assistant.offerPersonalizedSuggestions();
        if (assistant instanceof AIPersonalizedShoppingAssistant)
        {
            AIPersonalizedShoppingAssistant APSA= (AIPersonalizedShoppingAssistant) assistant;
            APSA.rate();
        }
    }
}
