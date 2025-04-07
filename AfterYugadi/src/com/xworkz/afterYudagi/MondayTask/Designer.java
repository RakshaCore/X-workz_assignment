package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AIVirtualInteriorDesigner;
import com.xworkz.afterYudagi.Internal.InteriorDesign;

public class Designer {
    public void almostDone(InteriorDesign design)
    {
        design.analyzeRoomLayout();
        design.suggestFurnitureArrangement();
        design.recommendColorSchemes();
        design.generate3DVisualization();
        design.provideBudgetEstimation();

        if (design instanceof AIVirtualInteriorDesigner)
        {
            AIVirtualInteriorDesigner aiVirtualInteriorDesigner=(AIVirtualInteriorDesigner) design;
            aiVirtualInteriorDesigner.design();
        }
    }
}
