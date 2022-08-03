package com.company.Behavioral.ChainOfResponsibility;

public class Danger
{
    public static void main(String[] args)
    {
    DangerReport dangerReport = new NormalDanger(Priority.Normal);
    DangerReport dangerMediumReport = new MediumDanger(Priority.Medium);
    DangerReport dangerImportantReport = new ImportantDanger(Priority.Important);

    dangerReport.setNextReport(dangerMediumReport);
    dangerMediumReport.setNextReport(dangerImportantReport);

    dangerReport.notifyDanger(" Мала кількість ворогів", Priority.Normal);
    dangerReport.notifyDanger(" Середня кількість ворогів", Priority.Medium);
    dangerReport.notifyDanger(" Велика кількість ворогів", Priority.Important);


    }
}
