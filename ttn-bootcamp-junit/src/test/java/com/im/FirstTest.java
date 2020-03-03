package com.im;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {
    First obj= new First();
    @Test

    void remove_If_Not_Even_integer(){
        //given
        List<Integer> filter_even_integers= new ArrayList<Integer>();
        List<Integer> result = Arrays.asList(-1,1,3,5,7,9);
        filter_even_integers.add(-2);
        filter_even_integers.add(-1);
        filter_even_integers.add(0);
        filter_even_integers.add(1);
        filter_even_integers.add(2);
        filter_even_integers.add(3);
        filter_even_integers.add(4);
        filter_even_integers.add(5);
        filter_even_integers.add(6);
        filter_even_integers.add(7);
        filter_even_integers.add(8);
        filter_even_integers.add(9);
        filter_even_integers.add(10);
        //when
        List<Integer> list = obj.filterEvenElements(filter_even_integers);

        //then
        //assertArrayEquals( First.filterEvenElements(filter_even_integers),result)
        assertEquals(list, result);
    }

    @Test

    void return_UpdatedString_If_StringFound(){

        //given
        String main_string="abcdef";
        String sub_string="ab";
        String replace_string="yz";
        String final_string="yzcdef";
        //when

        String new_string=obj.replaceSubString(main_string,sub_string,replace_string);
        //then

        assertEquals(new_string,final_string);
    }

    @Test
    void return_OriginalString_If_SubStringNotFound(){

        //given
        String main_string="abcdef";
        String sub_string="xy";
        String replace_string="yz";
        String final_string="abcdef";
        //when

        String new_string=obj.replaceSubString(main_string,sub_string,replace_string);
        //then

        assertEquals(new_string,final_string);
    }

    @Test

    void CalculateAverage_If_ValuePresent(){

        //given

        List<BigDecimal> given= new ArrayList<BigDecimal>();
        given.add(new BigDecimal("2.50"));
        given.add(new BigDecimal("2.50"));
        given.add(new BigDecimal("5.00"));
        given.add(new BigDecimal("10.00"));
        BigDecimal result= new BigDecimal("5.00");

        //when
        BigDecimal trial= obj.calculateAverage(given);

        //then
        assertEquals(result,trial);
    }

    @Test

    void should_ThrowException_If_ValueNotPresent(){

        //given
        List<BigDecimal> given= new ArrayList<BigDecimal>();
        //String result="Invalid input";
        //when
        Executable executable=()->obj.calculateAverage(given);
       //then
        assertThrows(RuntimeException.class, executable);
    }

    @Test

    void check_If_GivenString_Is_PalindromeTrue(){

        //given
         String to_check="noon";
         Boolean expected_result=true;

        //when
        Boolean result=obj.isPallindrome(to_check);

        //then
        assertEquals(result,expected_result);
    }


    @Test

    void check_If_GivenString_Is_PalindromeFalse(){

        //given
        String to_check="moon";
        Boolean expected_result=false;

        //when
        Boolean result=obj.isPallindrome(to_check);

        //then
        assertEquals(result,expected_result);
    }

}