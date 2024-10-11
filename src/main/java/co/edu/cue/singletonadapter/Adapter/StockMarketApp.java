package co.edu.cue.singletonadapter.Adapter;

public class StockMarketApp {
    public static void main(String[] args) {
        // Datos en formato XML
        XMLData stockData = new StockXMLData();

        // Crear un adaptador para convertir XML a JSON
        JSONData jsonAdapter = new XMLToJSONAdapter(stockData);

        // Integrar la biblioteca de análisis
        AnalysisLibrary analysisLibrary = new AnalysisLibrary();
        analysisLibrary.analyze(jsonAdapter);
    }
}
