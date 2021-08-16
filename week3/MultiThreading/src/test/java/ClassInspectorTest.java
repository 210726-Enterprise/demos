import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ClassInspectorTest {

    String string = "hello";
    Integer integer;
    Scanner scanner;
    List<Scanner> scannerList;
    A a;
    B b;

    @Before
    public void setUp(){
        scanner = new Scanner(System.in);
        scannerList = new ArrayList<>();
        scannerList.add(scanner);
        integer = 1;
        a = new A();
        b = new B();
    }

    @Test
    public void listPublicConstructorsForStringsTest(){
        ClassInspector.listPublicConstructors(string.getClass());
    }

    @Test
    public void listPublicConstructorsForScannerTest(){
        ClassInspector.listPublicConstructors(scanner.getClass());
    }

    @Test
    public void listPublicConstructorsForScannersListTest(){
        ClassInspector.listPublicConstructors(scannerList.getClass());
    }

    @Test
    public void listPublicFieldsForStringsTest(){
        ClassInspector.listPublicFields(string.getClass());
    }

    @Test
    public void listPublicFieldsForScannerTest(){
        ClassInspector.listPublicFields(scanner.getClass());
    }

    @Test
    public void listPublicFieldsForScannersListTest(){
        ClassInspector.listPublicFields(scannerList.getClass());
    }

    @Test
    public void listNonPublicFieldsForStringsTest(){
        ClassInspector.listNonPublicFields(string.getClass());
    }

    @Test
    public void listNonPublicFieldsForScannerTest(){
        ClassInspector.listNonPublicFields(scanner.getClass());
    }

    @Test
    public void listNonPublicFieldsForScannersListTest(){
        ClassInspector.listNonPublicFields(scannerList.getClass());
    }

    @Test
    public void listAllFieldsForChildAndSuperClassTest(){
        ClassInspector.listPublicFields(a.getClass());
        ClassInspector.listPublicFields(b.getClass());
        ClassInspector.listNonPublicFields(a.getClass());
        ClassInspector.listNonPublicFields(b.getClass());
    }

    @Test
    public void listNonPublicConstructorsForStringsTest(){
        ClassInspector.listNonPublicConstructors(string.getClass());
    }

    @Test
    public void listNonPublicConstructorsForScannerTest(){
        ClassInspector.listNonPublicConstructors(scanner.getClass());
    }

    @Test
    public void listNonPublicConstructorsForScannersListTest(){
        ClassInspector.listNonPublicConstructors(scannerList.getClass());
    }

    @Test
    public void listPublicMethodsForStringsTest(){
        ClassInspector.listPublicMethods(string.getClass());
    }

    @Test
    public void listPublicMethodsForScannerTest(){
        ClassInspector.listPublicMethods(scanner.getClass());
    }

    @Test
    public void listPublicMethodsForScannersListTest(){
        ClassInspector.listPublicMethods(scannerList.getClass());
    }

    @Test
    public void listNonPublicMethodsForStringsTest(){
        ClassInspector.listNonPublicMethods(string.getClass());
    }

    @Test
    public void listNonPublicMethodsForScannerTest(){
        ClassInspector.listNonPublicMethods(scanner.getClass());
    }

    @Test
    public void listNonPublicMethodsForScannersListTest(){
        ClassInspector.listNonPublicMethods(scannerList.getClass());
    }
}