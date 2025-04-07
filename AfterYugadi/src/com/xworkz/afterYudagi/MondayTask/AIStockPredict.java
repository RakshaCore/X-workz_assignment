package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AIStockPrediction;
import com.xworkz.afterYudagi.Internal.Airline;
import com.xworkz.afterYudagi.Internal.StockMarket;

public class AIStockPredict {
    public void predict(StockMarket stockMarket)
    {
        stockMarket.getStockPrices();
        stockMarket.analyzeTrends();
        stockMarket.predictFuturePrices();
        stockMarket.provideInvestmentAdvice();
        stockMarket.saveTransactionHistory();
        if(stockMarket instanceof AIStockPrediction)
        {
            AIStockPrediction aiStockPrediction=(AIStockPrediction)stockMarket;
            aiStockPrediction.generateReport();
        }
    }
}
