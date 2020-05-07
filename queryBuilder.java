import java.sql.ResultSet;

import org.apache.jena.query.ParameterizedSparqlString;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;

class queryBuilder{
    public static void main(String[] args){
        ParameterizedSparqlString qs = new ParameterizedSparqlString(""
                + "prefix rdfs:    <http://www.w3.org/2000/01/rdf-schema#>\n"
                + "PREFIX dbo:     <http://dbpedia.org/ontology/>"
                + "\n"
                + "select distinct ?resource ?abstract where {\n"
                + "  ?resource rdfs:label 'Ibuprofen'@en.\n"
                + "  ?resource dbo:abstract ?abstract.\n"
                + "  FILTER (lang(?abstract) = 'en')}");

        QueryExecution exec = QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql", qs.asQuery());

        ResultSet results = exec.execSelect();

        while (results.hasNext()) {

            System.out.println(results.next().get("abstract").toString());
        }
    }
}