package com.segmenttree.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Response {

    List<Node> nodes;
    boolean animationLine;
    boolean animationFormingTree;
    Integer leaves;

}
