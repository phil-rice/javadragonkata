package org.xingyi.javadragon.domain;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class DragonOps {

    public Dragon eat(Dragon dragon, Object item) {
        return null;//return a new dragon which is the old dragon copied (but not changed)with item in the stomach
    }

    public Dragon regurgitate(Dragon dragon, Object item) {
        return null;//return a new dragon which is the old dragon copied (but not changed)with item not in the stomach
    }

    public <T> List<T> processContents(Dragon dragon, Function<Object, T> item) {
        //iterate over all the items in the stomach and call the function on it return a list of the results
        return null;
    }

}
