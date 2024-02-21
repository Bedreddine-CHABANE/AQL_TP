import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Person;
public class PersonTest {
    @Test
    public void isGetFullNameReturnFullName(){
        Person person = new Person("CHABANE","Bedreddine",22);
        String result = person.getFullName();
        Assertions.assertEquals("CHABANE Bedreddine",result);
    }

    @Test
    public void isAdultShouldReturnTrueIfAgeIsGreaterThanOrEquals18(){
        Person person = new Person("CHABANE","Bedreddine",18);
        Assertions.assertTrue(person.isAdult());
    }

    @Test
    public void isAdultShouldReturnFalseIfAgeIsInferieorThan18(){
        Person p = new Person("CHABANE","Bedreddine",17);
        Assertions.assertFalse(p.isAdult());
    }
}
