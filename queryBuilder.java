
import org.apache.jena.query.ParameterizedSparqlString;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.sparql.engine.http.QueryEngineHTTP;


class queryBuilder{

    public static String query(){
        ParameterizedSparqlString qs = new ParameterizedSparqlString();
        //this builds the query template
        qs.append("PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>");
        qs.append("PREFIX foaf: <http://xmlns.com/foaf/0.1/>");
        qs.append("PREFIX dbpedia-owl: <http://dbpedia.org/ontology/>");
        qs.append("PREFIX dbpprop: <http://dbpedia.org/property/>");
        qs.append("PREFIX dbo: <http://dbpedia.org>");
        qs.append("SELECT ?album ?albumName ?Artist ?abstract ");
        qs.append("{\n");
        qs.append("?album a dbpedia-owl:Album .");
        qs.append("?album dbo:abstract ?abstract .");
        qs.append("?album rdfs:label ?albumName .");
        qs.append("?album dbpedia-owl:artist ?Artist .");
        qs.append("FILTER regex(");
        qs.append("?album, 'Mezmerize'");
        qs.append(")");
        qs.append("}");
        qs.append("LIMIT 100");

        QueryEngineHTTP qe = new QueryEngineHTTP("http://dbpedia.org/sparql", qs.toString());
        String output = ResultSetFormatter.asText(qe.execSelect());
        System.out.println(output);
        qe.close();
        
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