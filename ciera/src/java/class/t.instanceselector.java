T_b("    ");
T_b("public ");
T_b(type_name);
T_b(" ");
T_b(self->name);
T_b("() throws XtumlException {");
T_b("\n");
if ( returns_set ) {
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
T_b("Set<IRelationship> R");
T_b(T_s(self->rel_num));
T_b("set = ((");
T_b(self->relationship_cast);
T_b("Set)population().getRelationshipSet( ");
T_b(T_s(self->rel_num));
T_b(" )).getBy");
T_b(T_c(self->src_class));
T_b("Id( getInstanceId() );");
T_b("\n");
if ( unconditional ) {
T_b("        ");
T_b("if ( R");
T_b(T_s(self->rel_num));
T_b("set.isEmpty() ) throw new ModelIntegrityException( \"Unconditional association has no related instances.\" );");
T_b("\n");
} else {
if ( ! returns_set ) {
T_b("        ");
T_b("if ( R");
T_b(T_s(self->rel_num));
T_b("set.isEmpty() ) return ");
T_b(type_name);
T_b(".EMPTY_");
T_b(T_underscore(T_u(type_name)));
T_b(";");
T_b("\n");
}
}
if ( returns_set ) {
T_b("        ");
T_b("for ( IRelationship r");
T_b(T_s(self->rel_num));
T_b(" : R");
T_b(T_s(self->rel_num));
T_b("set ) {");
T_b("\n");
T_b("            ");
T_b(T_l(type_name));
T_b(".add( population().");
T_b(target_class_name);
T_b("instances().getByInstanceId( ((");
T_b(self->relationship_cast);
T_b(")r");
T_b(T_s(self->rel_num));
T_b(").get");
T_b(T_c(self->dst_class));
T_b("() ) );");
T_b("\n");
T_b("        ");
T_b("}");
T_b("\n");
T_b("        ");
T_b("return ");
T_b(T_l(type_name));
T_b(".toImmutableSet();");
T_b("\n");
} else {
T_b("        ");
T_b("if ( 1 == R");
T_b(T_s(self->rel_num));
T_b("set.size() ) {");
T_b("\n");
T_b("            ");
T_b("return (");
T_b(type_name);
T_b(")population().");
T_b(target_class_name);
T_b("instances().getByInstanceId( ((");
T_b(self->relationship_cast);
T_b(")R");
T_b(T_s(self->rel_num));
T_b("set.iterator().next()).get");
T_b(T_c(self->dst_class));
T_b("() );");
T_b("\n");
T_b("        ");
T_b("}");
T_b("\n");
T_b("        ");
T_b("else throw new ModelIntegrityException( \"Association with multiplicity 'one' has more than one related instance.\" );");
T_b("\n");
}
T_b("    ");
T_b("}");
T_b("\n");
