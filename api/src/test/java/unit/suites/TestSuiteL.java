package unit.suites;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class TestSuiteL {

    @Test
    public void firstTest(){
        for (int i=0; i<10;i++){
            List<String> name = new ArrayList<String>();
            name.add("Holly Cow");
        }
        System.out.println("All cow objects created");
    }

    @Test
    public void SecondTest(){
        for (int i=0; i<10;i++){
            List<String> name = new ArrayList<String>();
            name.add("Brave Dog");
        }
        System.out.println("All Dog objects created");
    }

    @Test
    public void thirdtest(){
        for (int i=0; i<10;i++){
            List<String> name = new ArrayList<String>();
            name.add("Pussy Cat");
        }
        System.out.println("All Cat objects created");
    }

    @Test
    public void testFourth(){
        for (int i=0; i<10;i++){
            List<String> name = new ArrayList<String>();
            name.add("Fierce Tiger");
        }
        System.out.println("All Tiger objects created");
    }

    @Test
    public void testFifth(){
        for (int i=0; i<10;i++){
            List<String> name = new ArrayList<String>();
            name.add("Poor Deer");
        }
        System.out.println("All Deer objects created");
    }

    @Test
    public void testSixth(){
        for (int i=0; i<10;i++){
            List<String> name = new ArrayList<String>();
            name.add("Clever Jackal");
        }
        System.out.println("All Jackal objects created");
    }

    @Test
    public void testSeventh(){
        for (int i=0; i<10;i++){
            List<String> name = new ArrayList<String>();
            name.add("Gigantic Elephant");
        }
        System.out.println("All Elephant objects created");
    }
}
