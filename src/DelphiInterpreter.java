import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class DelphiInterpreter extends delphiBaseListener {
    private Map<String, ClassInfo> classes = new HashMap<>();
    private Map<String, Object> variables = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String inputFile = args.length > 0 ? args[0] : "test/test1.pas";
        InputStream is = new FileInputStream(inputFile);

        // Create a lexer and parser for the input
        delphiLexer lexer = new delphiLexer(CharStreams.fromStream(is));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        delphiParser parser = new delphiParser(tokens);

        // Parse the input and create a parse tree
        ParseTree tree = parser.program();

        // Walk the parse tree with your custom listener
        ParseTreeWalker walker = new ParseTreeWalker();
        DelphiInterpreter interpreter = new DelphiInterpreter();
        walker.walk(interpreter, tree);
    }

    @Override
    public void enterClassDeclaration(delphiParser.ClassDeclarationContext ctx) {
        String className = ctx.identifier(0).getText();
        classes.put(className, new ClassInfo(className));
    }

    @Override
    public void enterConstructorDeclaration(delphiParser.ConstructorDeclarationContext ctx) {
        String className = ctx.identifier(0).getText();
        ClassInfo classInfo = classes.get(className);
        if (classInfo != null) {
            classInfo.setConstructor(ctx);
        }
    }

    @Override
    public void enterObjectInstantiation(delphiParser.ObjectInstantiationContext ctx) {
        String objectName = ctx.identifier(0).getText();
        String className = ctx.identifier(1).getText();
        ClassInfo classInfo = classes.get(className);
        if (classInfo != null) {
            variables.put(objectName, new ObjectInfo(classInfo));
        }
    }

    @Override
    public void enterVariableDeclaration(delphiParser.VariableDeclarationContext ctx) {
        String varName = ctx.id.getText(); // Updated to use named subrule "id"
        variables.put(varName, null);
    }

    public void handleInput(String varName) {
        System.out.print("Enter an integer: ");
        int value = scanner.nextInt();
        variables.put(varName, value);
    }

    public void handleOutput(String varName) {
        Object value = variables.get(varName);
        System.out.println(varName + " = " + value);
    }

    private static class ClassInfo {
        String name;
        delphiParser.ConstructorDeclarationContext constructor;

        ClassInfo(String name) {
            this.name = name;
        }

        void setConstructor(delphiParser.ConstructorDeclarationContext constructor) {
            this.constructor = constructor;
        }
    }

    private static class ObjectInfo {
        ClassInfo classInfo;

        ObjectInfo(ClassInfo classInfo) {
            this.classInfo = classInfo;
        }
    }
}

/*
 * import org.antlr.v4.runtime.*;
 * import org.antlr.v4.runtime.tree.*;
 * import java.io.FileInputStream;
 * import java.io.InputStream;
 * import java.util.*;
 * 
 * public class DelphiInterpreter extends delphiBaseListener {
 * private Map<String, ClassInfo> classes = new HashMap<>();
 * private Map<String, Object> variables = new HashMap<>();
 * private Scanner scanner = new Scanner(System.in);
 * 
 * public static void main(String[] args) throws Exception {
 * // Use a default file or take input from command line arguments
 * String inputFile = args.length > 0 ? args[0]
 * :
 * "/Users/yashbhalla/Documents/GitHub/Delphi-Pascal_Interpreter/test/test1.pas";
 * InputStream is = new FileInputStream(inputFile);
 * 
 * // Create a lexer and parser for the input file
 * delphiLexer lexer = new delphiLexer(CharStreams.fromStream(is));
 * CommonTokenStream tokens = new CommonTokenStream(lexer);
 * delphiParser parser = new delphiParser(tokens);
 * 
 * // Parse and create a parse tree
 * ParseTree tree = parser.program();
 * 
 * // Walk the parse tree with a custom listener
 * ParseTreeWalker walker = new ParseTreeWalker();
 * DelphiInterpreter interpreter = new DelphiInterpreter();
 * walker.walk(interpreter, tree);
 * }
 * 
 * @Override
 * public void enterClassDeclaration(delphiParser.ClassDeclarationContext ctx) {
 * String className = ctx.identifier(0).getText(); // Access first identifier
 * classes.put(className, new ClassInfo(className));
 * }
 * 
 * @Override
 * public void enterVariableDeclaration(delphiParser.VariableDeclarationContext
 * ctx) {
 * String varName = ctx.id.getText(); // Use named subrule "id"
 * variables.put(varName, null);
 * }
 * 
 * private static class ClassInfo {
 * String name;
 * 
 * ClassInfo(String name) {
 * this.name = name;
 * }
 * }
 * }
 */

/*
 * import org.antlr.v4.runtime.*;
 * import org.antlr.v4.runtime.tree.*;
 * 
 * import java.io.FileInputStream;
 * import java.io.InputStream;
 * import java.util.*;
 * 
 * public class DelphiInterpreter extends delphiBaseListener {
 * private Map<String, ClassInfo> classes = new HashMap<>();
 * private Map<String, Object> variables = new HashMap<>();
 * private Scanner scanner = new Scanner(System.in);
 * 
 * public static void main(String[] args) throws Exception {
 * String inputFile = args.length > 0 ? args[0] : "test/test1.pas";
 * InputStream is = new FileInputStream(inputFile);
 * 
 * // Create a lexer and parser for the input
 * delphiLexer lexer = new delphiLexer(CharStreams.fromStream(is));
 * CommonTokenStream tokens = new CommonTokenStream(lexer);
 * delphiParser parser = new delphiParser(tokens);
 * 
 * // Parse the input and create a parse tree
 * ParseTree tree = parser.program();
 * 
 * // Walk the parse tree with your custom listener
 * ParseTreeWalker walker = new ParseTreeWalker();
 * DelphiInterpreter interpreter = new DelphiInterpreter();
 * walker.walk(interpreter, tree);
 * }
 * 
 * @Override
 * public void enterClassDeclaration(delphiParser.ClassDeclarationContext ctx) {
 * String className = ctx.identifier(0).getText();
 * classes.put(className, new ClassInfo(className));
 * }
 * 
 * @Override
 * public void
 * enterConstructorDeclaration(delphiParser.ConstructorDeclarationContext ctx) {
 * String className = ctx.identifier(0).getText();
 * ClassInfo classInfo = classes.get(className);
 * if (classInfo != null) {
 * classInfo.setConstructor(ctx);
 * }
 * }
 * 
 * @Override
 * public void enterObjectInstantiation(delphiParser.ObjectInstantiationContext
 * ctx) {
 * String objectName = ctx.identifier(0).getText();
 * String className = ctx.identifier(1).getText();
 * ClassInfo classInfo = classes.get(className);
 * if (classInfo != null) {
 * variables.put(objectName, new ObjectInfo(classInfo));
 * }
 * }
 * 
 * @Override
 * public void enterVariableDeclaration(delphiParser.VariableDeclarationContext
 * ctx) {
 * String varName = ctx.id.getText(); // Updated to use named subrule "id"
 * variables.put(varName, null);
 * }
 * 
 * public void handleInput(String varName) {
 * System.out.print("Enter an integer: ");
 * int value = scanner.nextInt();
 * variables.put(varName, value);
 * }
 * 
 * public void handleOutput(String varName) {
 * Object value = variables.get(varName);
 * System.out.println(varName + " = " + value);
 * }
 * 
 * private static class ClassInfo {
 * String name;
 * delphiParser.ConstructorDeclarationContext constructor;
 * 
 * ClassInfo(String name) {
 * this.name = name;
 * }
 * 
 * void setConstructor(delphiParser.ConstructorDeclarationContext constructor) {
 * this.constructor = constructor;
 * }
 * }
 * 
 * private static class ObjectInfo {
 * ClassInfo classInfo;
 * 
 * ObjectInfo(ClassInfo classInfo) {
 * this.classInfo = classInfo;
 * }
 * }
 * }
 */
