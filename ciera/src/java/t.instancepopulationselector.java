T_b("    ");
T_b("public ");
T_b(type_name);
T_b(" ");
T_b(name);
T_b("() {");
T_b("\n");
T_b("        ");
T_b("return ");
T_b(name);
T_b("( null );");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("public ");
T_b(type_name);
T_b(" ");
T_b(name);
T_b("( IWhere condition ) {");
T_b("\n");
if ( is_many ) {
T_b("        ");
T_b("// TODO shortcut for when the condition is null");
T_b("\n");
T_b("        ");
T_b(type_name);
T_b(" ");
T_b(T_l(type_name));
T_b(" = new ");
T_b(type_name);
T_b("();");
T_b("\n");
}
T_b("        ");
T_b("Iterator<IModelInstance> iter = getInstanceSet( \"");
T_b(class_key_letters);
T_b("\" ).iterator();");
T_b("\n");
T_b("        ");
T_b("while ( iter.hasNext() ) {");
T_b("\n");
T_b("            ");
T_b("IModelInstance candidate = iter.next();");
T_b("\n");
T_b("            ");
T_b("if ( null == condition || condition.passes( candidate ) ) ");
if ( is_many ) {
T_b(T_l(type_name));
T_b(".add( candidate );");
T_b("\n");
} else {
T_b("return (");
T_b(type_name);
T_b(")candidate;");
T_b("\n");
}
T_b("        ");
T_b("}");
T_b("\n");
if ( is_many ) {
T_b("        ");
T_b("return ");
T_b(T_l(type_name));
T_b(";");
T_b("\n");
} else {
T_b("        ");
T_b("return ");
T_b(type_name);
T_b(".empty");
T_b(type_name);
T_b(";");
T_b("\n");
}
T_b("    ");
T_b("}");
T_b("\n");
