package com.company.Behavioral.ChainOfResponsibility;

public abstract class DangerReport
{
    private int priority;
    private DangerReport nextReport;

    public void setNextReport(DangerReport nextReport) {
        this.nextReport = nextReport;
    }

    DangerReport(int priority)
    {
        this.priority = priority;
    }

    public void notifyDanger(String message,int level)
    {
        if(level >= priority)
        {
            write(message);
        }

        if(nextReport!=null)
        {
            nextReport.notifyDanger(message, level);
        }
    }
    public abstract void write(String message);
}
