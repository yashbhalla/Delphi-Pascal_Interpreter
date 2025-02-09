import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class DelphiInterpreter extends delphiBaseListener {
    private Map<String, ClassInfo> classes = new HashMap<>();
    private Map<String, Object> variables = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void enterClassDeclaration(delphiParser.ClassDeclarationContext ctx) {
        String className = ctx.identifier().getText();
        classes.put(className, new ClassInfo(className));
    }

    @Override
    public void enterConstructorDeclaration(delphiParser.ConstructorDeclarationContext ctx) {
        String className = ctx.identifier().getText();
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
        String varName = ctx.identifier().getText();
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
