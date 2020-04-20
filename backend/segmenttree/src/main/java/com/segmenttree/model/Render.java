package com.segmenttree.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Render {
    List<Node> nodes;
    Integer totalDataNodes;
}
