package healthycoderapp;

import com.sun.org.apache.bcel.internal.classfile.Code;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void shouldReturn_ArithmeticException_Zero_Height() {
        //given
        Double weight = 90.0;
        Double height = 0.00;
        // when
        Executable executable = () -> BMICalculator.isDietRecommended(weight, height);
        //then
        assertThrows(ArithmeticException.class, executable);
    }

    @Test
    void isTrue_Diet_Recommended(){
        //given
        Double weight = 90.0;
        Double height = 1.70;

        // when
        Boolean test=BMICalculator.isDietRecommended(weight,height);

        //then
        assertTrue(test);
    }

    @Test
    void isFalse_Diet_Recommended(){
        //given
        Double weight = 90.0;
        Double height = 2.10;

        // when

        Boolean test=BMICalculator.isDietRecommended(weight,height);
        //then

        assertFalse(test);
    }


    @Test
    void should_Return_Coder_With_WorstBMI(){
        //given
        List<Coder> coders=new ArrayList<>();
        coders.add(new Coder(1.89,70));
        coders.add(new Coder(1.80,84));
        coders.add(new Coder(1.66,50));
        coders.add(new Coder(1.90,80));

        // when
        Coder worstBMI= BMICalculator.findCoderWithWorstBMI(coders);

        //then
        assertEquals(1.80,worstBMI.getHeight());
    }

    @Test
    void should_Return_Null_When_CoderList_IsEmpty(){
        //given
        List<Coder> coders=new ArrayList<>();

        // when
        Coder worstBMI= BMICalculator.findCoderWithWorstBMI(coders);

        //then
        assertNull(worstBMI);
    }

    @Test
    void should_ReturnBMIScoreArray_When_CoderList_NotEmpty(){

        //given
        List<Coder> coders=new ArrayList<>();
        coders.add(new Coder(1.79,70));
        coders.add(new Coder(1.80,84));
        coders.add(new Coder(1.66,50));
        coders.add(new Coder(1.90,80));
        double[] result={21.85, 25.93, 18.14, 22.16};

        //when
        double[] bmi_result=BMICalculator.getBMIScores(coders);

        //then
        assertArrayEquals(result, bmi_result);
    }
}