import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    //1.Positive testing Happy path
    //if (start<= end)
    //return array;
    @Test
    public void testStartLessThanEnd_HappyPath(){
        //AAA
        //Arrange
        int start =1;
        int end = 20;
        String[] expectedResult = {"1","2","Fizz"," 4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz",
            "16","17","Fizz","19","Buzz"};

        //Act
        String[] actualResult = new FizzBuzz().fizzBuzz(start,end);


        //Assert

            Assert.assertEquals(actualResult,expectedResult);}




        //2.Positive  testing
        //if start == end
        //return New String[0]
    @Test
    public void testStartEqualEnd_HappyPath() {
            //AAA
            //Arrange
            int start = 1;
            int end = 1;
            String[] expectedResult = {"1"};

            //Act
            String[] actualResult = new FizzBuzz().fizzBuzz(start, end);


            //Assert

            Assert.assertEquals(actualResult, expectedResult);}






            //2.Negative testing
            //if start > end
            //return New String[0]
        @Ignore
        @Test public void testStartLessThanEnd_StartEndAreNegativeNumbers_HappyPAth(){
            //AAA
            //Arrange
            int start =-1;
            int end = -20;
            String[] expectedResult = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz",
                    "16","17","Fizz","19","Buzz"};

            //Act
            String[] actualResult = new FizzBuzz().fizzBuzz(start,end);


            //Assert

            Assert.assertEquals(actualResult,expectedResult);}

    @Test
    public void testStartMoreThanEnd_NegativeTesting(){
        //AAA
        //Arrange
        int start =20;
        int end = 1;
        String[] expectedResult = {};

        //Act
        String[] actualResult = new FizzBuzz().fizzBuzz(start,end);


        //Assert

        Assert.assertEquals(actualResult,expectedResult);}


}
