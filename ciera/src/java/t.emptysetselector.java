if ( is_many ) {
T_b("    ");
T_b("@Override");
T_b("\n");
T_b("    ");
T_b("public ");
T_b(type_name);
T_b(" ");
T_b(name);
T_b("( IWhere condition ) {");
T_b("\n");
T_b("        ");
T_b("return new ");
T_b(type_name);
T_b("();");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
} else {
T_b("    ");
T_b("@Override");
T_b("\n");
T_b("    ");
T_b("public ");
T_b(type_name);
T_b(" ");
T_b(name);
T_b("( IWhere condition ) {");
T_b("\n");
T_b("        ");
T_b("return ");
T_b(type_name);
T_b(".EMPTY_");
T_b(T_underscore(T_u(type_name)));
T_b(";");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
}