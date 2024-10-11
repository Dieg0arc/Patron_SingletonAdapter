package co.edu.cue.singletonadapter.Adapter;

// Clase de análisis que solo acepta datos en formato JSON
class AnalysisLibrary {
    public void analyze(JSONData jsonData) {
        System.out.println("Analizando datos: " + jsonData.getJSONData());
    }
}
