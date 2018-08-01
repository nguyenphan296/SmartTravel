package com.example.pkun9.smarttravel.ModelSQLite;

import java.util.List;

/**
 * Created by sang on 17/01/2017.
 */

public interface  BaseModels<T> {

    List<T> getAllElements() ;

    public abstract T getElementById(T objT);

    public abstract boolean InsertElement(T objT);

    public abstract boolean InsertMultilElement(List<T> lsObjT);

    public abstract int UpdateElement(T objT);

    public abstract boolean DeleteElement(T objT);

    public abstract int CountElements();
}