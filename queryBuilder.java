
import org.apache.jena.JenaRuntime;
import org.apache.jena.atlas.json.JsonString;
import org.apache.jena.query.ParameterizedSparqlString;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.sparql.engine.http.QueryEngineHTTP;
import org.json.*;


class queryBuilder{

    public static String queryAlbumXML(String userInput){
        ParameterizedSparqlString qs = new ParameterizedSparqlString(""
        //this builds the query template
        +"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
        +"PREFIX foaf: <http://xmlns.com/foaf/0.1/>\n"
        +"PREFIX dbpedia-owl: <http://dbpedia.org/ontology/>\n"
        +"PREFIX dbpprop: <http://dbpedia.org/property/>\n\n"
        +"SELECT ?album ?albumName ?Artist ?abstract \n"
        +"WHERE{\n"
        +"?album a dbpedia-owl:Album .\n"
        +"?album dbo:abstract ?abstract .\n"
        +"?album rdfs:label ?albumName .\n"
        +"?album dbpedia-owl:artist ?Artist .\n"
        +"FILTER regex(\n"
        +"?album, '" + userInput +"'\n"
        +")\n"
        +"}\n"
        +"LIMIT 100");

        //System.out.println(qs);

        QueryEngineHTTP qe = new QueryEngineHTTP("http://dbpedia.org/sparql", qs.toString());
        String output = ResultSetFormatter.asXMLString(qe.execSelect());
        //System.out.println(output);
        qe.close();
        
        return output;
    }
    public static String queryArtistXML(String userInput){
        ParameterizedSparqlString qs = new ParameterizedSparqlString(""
        //this builds the query template
        +"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
        +"PREFIX foaf: <http://xmlns.com/foaf/0.1/>\n"
        +"PREFIX dbpedia-owl: <http://dbpedia.org/ontology/>\n"
        +"PREFIX dbpprop: <http://dbpedia.org/property/>\n\n"
        +"SELECT ?album ?albumName ?Artist ?abstract \n"
        +"WHERE{\n"
        +"?album a dbpedia-owl:Album .\n"
        +"?album dbo:abstract ?abstract .\n"
        +"?album rdfs:label ?albumName .\n"
        +"?album dbpedia-owl:artist ?Artist .\n"
        +"FILTER regex(\n"
        +"?album, '" + userInput +"'\n"
        +")\n"
        +"}\n"
        +"LIMIT 100");

        //System.out.println(qs);

        QueryEngineHTTP qe = new QueryEngineHTTP("http://dbpedia.org/sparql", qs.toString());
        String output = ResultSetFormatter.asXMLString(qe.execSelect());
        //System.out.println(output);
        qe.close();
        
        return output;
    }

    public static String XMLtoJSON(String XMLString){
        int ppif = 4;
        JSONObject xmlJSONObj = XML.toJSONObject(XMLString);
        String jsonString = xmlJSONObj.toString(ppif);
        System.out.println(jsonString);
        return jsonString;
    }
}