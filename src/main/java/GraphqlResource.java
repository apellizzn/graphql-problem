import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class GraphqlResource {

    @Query
    public Fruit fruit() {
        return new Fruit("apple");
    }
}
