grammar ourGrammar;
options {
language=Java;
}

start   :   'settings[\n' option+ ']\n' workspace+;

option :   ID '=' value '\n';


workspace    :   'workspace' NUM '[\n' application+ ']\n';

application  :   ID nl '{' nl option+ nl '}' nl;

ID  :   ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z'| NUM)+;

value   : ID | NUM | (SYMBOLS | ID | NUM)+;

SYMBOLS :   '&'|'*'|'^'|'%'|'_'|'-'|'#'|'"'|':';

NUM     :   [0-9]+;

nl      : NL | ;

NL      :   '\n';

WS : [ \r\t]+ { skip();};
