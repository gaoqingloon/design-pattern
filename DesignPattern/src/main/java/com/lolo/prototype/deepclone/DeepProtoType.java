package com.lolo.prototype.deepclone;

public class DeepProtoType implements Cloneable {

    public String name; //String属性
    public DeepCloneableTarget deepCloneableTarget; //引用类型

    //深拷贝 - 方式1 使用clone 方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep;
        //这里完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }
}
