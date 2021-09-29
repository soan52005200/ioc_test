package org.example;

public class RoboFactory
{
    private final RoboProductionLine productionLine;
    final int productionSize;

    public RoboFactory(RoboProductionLine productionLine, int productionSize) {
        this.productionLine = productionLine;
        this.productionSize = productionSize;
    }

    public void runProdution(){
        int robotsCompleted = 0;
        while (robotsCompleted < productionSize){
            productionLine.work();
            robotsCompleted++;
        }
    }
}
