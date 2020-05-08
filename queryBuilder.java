import org.apache.jena.query.ParameterizedSparqlString;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.ResourceFactory;

class queryBuilder{

    public String query(String input){
        ParameterizedSparqlString qs = new ParameterizedSparqlString(""
                + "prefix rdfs:    <http://www.w3.org/2000/01/rdf-schema#>\n"
                + "PREFIX dbo:     <http://dbpedia.org/ontology/>"
                + "\n"
                + "select distinct ?performer ?abstract where {\n"
                + "  ?resource rdfs:label 'Ibuprofen'@en.\n"
                + "  ?resource dbo:abstract ?abstract.\n"
                + "  FILTER (lang(?abstract) = 'en')}");

        QueryExecution exec = QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql", qs.asQuery());

        ResultSet results = exec.execSelect();
        String output = new String();

        while (results.hasNext()) {

            output += results.next().get("abstract").toString();

        }
        
        return output;
    }

    public String toXML(){
        String XML = new String();
        return XML;
    }

    public String toHTML(){
        String HTML = new String();
        return HTML;
    }

}