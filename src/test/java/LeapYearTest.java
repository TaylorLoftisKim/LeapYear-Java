import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_checkDivisibilityByFour_true() {
    LeapYear leapYear = new LeapYear();
    assertEquals(true, leapYear.isLeapYear(1996));
  }
  @Test
  public void isLeapYear_forNumbersNotDivisibleByFour_false() {
    LeapYear leapYear = new LeapYear();
    assertEquals(false, leapYear.isLeapYear(1999));
  }
  @Test
  public void isLeapYear_forMultiplesOfOneHundred_false() {
    LeapYear leapYear = new LeapYear();
    assertEquals(false, leapYear.isLeapYear(1900));
  }
  @Test
 public void isLeapYear_forMultiplesOfFourHundred_true() {
    LeapYear leapYear = new LeapYear();
    assertEquals(true, leapYear.isLeapYear(2000));
  }
}
