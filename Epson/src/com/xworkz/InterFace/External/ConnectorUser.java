package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Connector;

public class ConnectorUser {
private Connector connector;

public ConnectorUser(Connector connector)
{
    System.out.println("Running Connector in Connector user");
    this.connector=connector;
}
public void random()
{
    if(this.connector!=null)
    {
        this.connector.run();
        this.connector.stop();
    }
    else
        System.err.println("NULLLLL");
}
}
