package co.edu.cue.singletonadapter.Adapter;

// Adaptador que convierte datos de XML a JSON
class XMLToJSONAdapter implements JSONData {
    private XMLData xmlData;

    public XMLToJSONAdapter(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public String getJSONData() {
        // Aquí se realiza la conversión de XML a JSON
        // Para este ejemplo, se simula la conversión
        String xml = xmlData.getXMLData();
        return "{\"symbol\": \"AAPL\", \"price\": 150}"; // Simulación de conversión
    }
}
