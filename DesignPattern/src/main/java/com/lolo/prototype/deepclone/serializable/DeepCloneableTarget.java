package com.lolo.prototype.deepclone.serializable;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

}
