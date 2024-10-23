package celestialGrammar;

import gen.PlanetaryGrammarLexer;
import gen.PlanetaryGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class PlanetaryGrammar {

    public static void main(String[] args) {
        // Sample input to parse
        String input = "FIND events WHERE TYPE = \"meteor shower\" SORT BY DATE ASC";

        // Step 1: Create a lexer from the input
        PlanetaryGrammarLexer lexer = new PlanetaryGrammarLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Step 2: Create a parser from the tokens
        PlanetaryGrammarParser parser = new PlanetaryGrammarParser(tokens);

        // Step 3: Parse the query and create a parse tree
        ParseTree tree = parser.query();

        // Step 4: Print the parse tree
        System.out.println(tree.toStringTree(parser));
    }
}
