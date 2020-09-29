package testDoubles;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class SpyExampleTest {

    @Test
    public void spyTest(){
        List<String> list = new ArrayList<>();
        List<String> spyList = spy(list);

        String testString = "test";

        spyList.add(testString);

        verify(spyList).add(testString);

        Assert.assertEquals(1, spyList.size());
    }


    @Test
    public void spyVsMock(){

        List<String> mockedList = mock(ArrayList.class);
        mockedList.add("one");
        verify(mockedList).add(anyString());

        Assert.assertEquals(0, mockedList.size());


        List <String> spyList = spy(new ArrayList<>());
        spyList.add("two");
        verify(spyList).add(anyString());

        Assert.assertEquals(1, spyList.size());
    }
}
