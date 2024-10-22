grammar PlanetaryGrammar;

// Main rule for the query
query: 'FIND' 'events' whereClause? sortClause? EOF;

// WHERE clause
whereClause: 'WHERE' condition (logicalOp condition)*;

// Logical operators (AND, OR)
logicalOp: 'AND' | 'OR';

// Condition for filtering
condition: field operator value;

// Fields that can be used in conditions
field: 'TYPE' | 'DATE' | 'VISIBILITY';

// Comparison operators
operator: '=' | '!=' | '<' | '>' | '<=' | '>=';

// Values can be strings or dates in double quotes
value: STRING | DATE;

// Sorting clause
sortClause: 'SORT BY' field sortOrder?;

// Sort order (ASC, DESC)
sortOrder: 'ASC' | 'DESC';

// Tokens for strings
STRING: '"' [a-zA-Z0-9_ ]+ '"';

// Adjusted DATE rule to prevent action generation
DATE: '"' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT '"';

// Define DIGIT as a lexer rule for simplicity
fragment DIGIT: [0-9];

// Whitespace handling
WS: [ \t\r\n]+ -> skip;
