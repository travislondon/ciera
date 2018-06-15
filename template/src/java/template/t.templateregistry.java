T_b("package ");
T_b(self->package);
T_b(";");
T_b("\n");
T_b(imports);
T_b("\n");
T_b("public class ");
T_b(self->name);
T_b(" implements ITemplateRegistry {");
T_b("\n");
T_b("    ");
T_b("private ");
T_b(self->comp_name);
T_b(" population;");
T_b("\n");
T_b("    ");
T_b("public ");
T_b(self->name);
T_b("( ");
T_b(self->comp_name);
T_b(" population ) {");
T_b("\n");
T_b("        ");
T_b("this.population = population;");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("@Override");
T_b("\n");
T_b("    ");
T_b("public ITemplate getTemplate( String filename ) {");
T_b("\n");
T_b("        ");
T_b("switch ( filename ) {");
T_b("\n");
T_b(template_initializers);
T_b("        default:");
T_b("\n");
T_b("            ");
T_b("return () -> {};");
T_b("\n");
T_b("        ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("}");
T_b("\n");