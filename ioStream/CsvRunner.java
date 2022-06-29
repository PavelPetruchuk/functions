package ioStream;

import java.nio.file.Path;
import java.util.List;

public class CsvRunner {
    public static void main(String[] args) {
        Path pathPriceFile = Path.of("src", "oiStream", "resourses ", "items-price.csv");
        Path pathNameFile = Path.of("src", "oiStream", "resourses ", "items-name.csv");
        Path pathResultFile = Path.of("src", "oiStream", "resourses", "result.csv");
        Path pathErrorsFile = Path.of("src", "oiStream", "resourses ", "errors.csv");
        List<Record> records = CsvFileUtils.getDataFromTwoFiles(pathPriceFile, pathNameFile);
        CsvFileUtils.writeDataToResultFile(pathResultFile, records);
        CsvFileUtils.writeDataToErrorsFile(pathErrorsFile, records);
    }
}
