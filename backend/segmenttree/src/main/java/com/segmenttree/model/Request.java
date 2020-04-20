package com.segmenttree.model;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Request {
    List<Integer> data;

    public static void main(String[] args) {
        Request request = new Request();
        request.setData(new ArrayList<>());
        request.getData().addAll(Arrays.asList(1,2,3,4));
        System.out.println(request);
    }
}
