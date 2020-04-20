package com.segmenttree.service;


import com.segmenttree.interfaces.SumSegmentTreeInterface;
import com.segmenttree.logic.Algorithm;
import com.segmenttree.model.Response;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SegmentTreeService implements SumSegmentTreeInterface {
    Integer nodes;
    @Autowired
    private Algorithm algorithm;




    @Override
    public Response initializeSegmentArray(int noOfElements, List<Integer> data, boolean random) {
        if(state.size() == 0){

            List<Integer> convertToSegmentTreeList = algorithm.convertDataArrayIntoSegmentArray(data);
            state.addAll(convertToSegmentTreeList);
            nodes = (state.size()+1)/2;
            return algorithm.treeBuildResponse(state,nodes);
        }
        return algorithm.treeBuildResponse(state,nodes);
    }

    @Override
    public Response updateInRange(int left, int right, int update) {

    }

    public void updateTraversal(int l,int r,int v,int index,int cl,int cr){
        if(l == r){
            int valupdate = state.get(l+nodes-1);
            state.set(l+nodes-1,valupdate);
            return;
        }



    }

    @Override
    public Response subtractInRange(int left, int right, int update)
    {
        return null;
    }

    @Override
    public Response searchInRange(int left, int right, int update) {

        return null;
    }

    @Override
    public boolean reset() {
        state.clear();
        return state.size() == 0 ? true : false;
    }
}
