package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.ECommerce;
import com.xworkz.afterYudagi.Internal.OnlineECommerce;
import com.xworkz.afterYudagi.Internal.OnlineLogistics;

public class Flipkart {
    public void use(ECommerce ecommerce)
    {
        ecommerce.browseProducts();
        ecommerce.addToCart();
        ecommerce.checkout();
        ecommerce.makePayment();
        ecommerce.trackOrder();
if(ecommerce instanceof OnlineECommerce)
{
    OnlineECommerce onlineecommerce=(OnlineECommerce) ecommerce;
    onlineecommerce.returnProduct();
}
    }
}
