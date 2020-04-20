package com.segmenttree.model;

import lombok.*;

@Data
@ToString
@Builder
public class Node {
    Integer nodeId;
    Integer start;
    Integer end;
    Integer value;

}
