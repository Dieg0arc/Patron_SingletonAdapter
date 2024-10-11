package co.edu.cue.singletonadapter.Adapter;

// Clase que representa los datos de bolsa en formato XML
class StockXMLData implements XMLData {
    @Override
    public String getXMLData() {
        return "<stock><symbol>AAPL</symbol><price>150</price></stock>";
    }
}
