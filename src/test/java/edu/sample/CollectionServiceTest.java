package edu.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionServiceTest {

    @Test
    public void testAddToCollection() {
        List<Integer> list = Arrays.asList(2,4,6,9);
        assertEquals(list, CollectionService.addToCollection(9,4,6,2));
    }

    @ParameterizedTest
    @ValueSource(ints={5,3,4,2})
    public void testSplit(int chunkSize) {
        // given
        List<Integer> list = Arrays.asList(2,4,6,9,14,5,56,32,11,24);

        int mySize= list.size()/chunkSize;

        // when
        List<List<Integer>> result = CollectionService.split(list,chunkSize);

        // then
        if(list.size()%chunkSize!=0){
           mySize= mySize+1;
        }

        assertEquals(mySize, result.size());
    }

    @ParameterizedTest
    @ValueSource(ints={0,-2,11,-4})
    public void testSplit2(int chunkSize){
        // given

        List<Integer> list = Arrays.asList(2,4,6,9,14,5,56,32,11,24);

        // when
        List<List<Integer>> result = CollectionService.split(list,chunkSize);

        // then
        assertEquals(list.size() / chunkSize, result.size());
    }

    @ParameterizedTest
    @ValueSource(ints={2,5})
    public void testMerge(int chunkSize){
        List<Integer> list1 = Arrays.asList(2,4,6,9,14);
        List<Integer> list2 = Arrays.asList(5,56,32,11,24);
        List<Integer> list = Arrays.asList(2,4,6,9,14,5,56,32,11,24);

        List<List<Integer>> result = CollectionService.merge(list1,list2);
        assertEquals(list,result);
    }
}