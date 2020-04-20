package com.segmenttree.logic;


import com.segmenttree.model.Node;
import com.segmenttree.model.Response;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Algorithm {

    public List<Integer> convertDataArrayIntoSegmentArray(List<Integer> data) {

        int ceilData = (int) Math.ceil(Math.log10(data.size()) / Math.log10(2));
        int nodesAtBase = (int) Math.pow(2, ceilData);
        int origin = data.size();
        for (int i = 0; i < nodesAtBase - origin; i++) {
            data.add(0);
        }

        List<Integer> tree = new ArrayList<>(2 * data.size());
        for (int i = 0; i < 2 * data.size(); i++) tree.add(null);

        for (int i = 0; i < data.size(); i++) {
            tree.set(data.size() + i, data.get(i));
        }

        for (int i = data.size() - 1; i > 0; i--) {
            tree.set(i, tree.get(2 * i) + tree.get(2 * i + 1));
        }
        return tree;

    }

    public Response treeBuildResponse(List<Integer> nodes,Integer original) {

        int[] id = {1};
        List<Node> result = nodes.subList(1, nodes.size())
                .stream()
                .map(it -> {
                    Node node = Node.builder()
                            .nodeId(id[0])
                            .value(it)
                            .build();
                    id[0] += 1;
                    return node;

                })
                .collect(Collectors.toList());
        int st=0;
        for(int i=result.size()/2;i<result.size();i++){
            result.get(i).setStart(st);
            result.get(i).setEnd(st);
            st++;
        }
        for(int i=result.size()/2 - 1;i >= 0 ;i--){
            int start = result.get(2*i + 1).getStart();
            int end= result.get(2*i+2).getEnd();
            result.get(i).setStart(start);
            result.get(i).setEnd(end);
        }

        return new Response(result,false,true,original);

    }

}
