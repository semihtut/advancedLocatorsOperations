package DeisgnPatternsForHighQualityTestAutomation.DecoratorDesignTurkce;

public interface IDataSource {
    String getFileName();
    void writeData(Object data);
    void readData();
}
