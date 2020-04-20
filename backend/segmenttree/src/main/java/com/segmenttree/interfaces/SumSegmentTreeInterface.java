package com.segmenttree.interfaces;

import com.segmenttree.model.Node;
import com.segmenttree.model.Response;

import java.util.ArrayList;
import java.util.List;

public interface SumSegmentTreeInterface {

    List<Integer> state = new ArrayList<>();
    Integer nodes = 0;

    Response initializeSegmentArray(int noOfElements, List<Integer> data, boolean random);
    Response updateInRange(int left, int right, int update);
    Response subtractInRange(int left,int right,int update);
    Response searchInRange(int left,int right,int update);
    boolean reset();

}
