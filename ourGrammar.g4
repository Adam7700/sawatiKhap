grammar ourGrammar;
options {
    language=Java;
}

start   :   'settings' '[' option+ ']' workspace*;

option :   ID '=' value;

workspace    :   'workspace' NUM '[' application+ ']';

application  :   ID '{' appoption* '}';

appoption :   ID '=' appvalue;

ID  :   ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z'| NUM | SYMBOLS)+;

value   : ID | NUM | (SYMBOLS | ID | NUM)+;

appvalue   : '\'' (~'\'')* '\'' ;

SYMBOLS :   '/'|'&'|'*'|'^'|'%'|'_'|'-'|'#'|'"'|':'|'.'|',';

NUM     :   [0-9]+;

WS : [ \r\t\n]+ -> skip;
