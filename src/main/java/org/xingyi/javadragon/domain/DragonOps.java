package org.xingyi.javadragon.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DragonOps {

    static <T> List<T> add(List<T> list, T t) {
        List<T> result = new ArrayList<T>();
        result.addAll(list);
        result.add(t);
        return result;
    }

    static <T> List<T> remove(List<T> list, T t) {
        List<T> result = new ArrayList<T>();
        result.addAll(list);
        result.remove(t);
        return result;
    }

    public Dragon eat(Dragon dragon, Object item) {
//        return Dragon.contentsL.transform(dragon, old -> add(old, item));
        return dragon.withChest(dragon.chest.withStomach(dragon.chest.stomach.withContents(add(dragon.chest.stomach.contents, item))));//return a new dragon which is the old dragon copied (but not changed)with item in the stomach
        return null;
    }

    public Dragon regurgitate(Dragon dragon, Object item) {
//        return Dragon.contentsL.transform(dragon, old -> remove(old, item));
        return dragon.withChest(dragon.chest.withStomach(dragon.chest.stomach.withContents(remove(dragon.chest.stomach.contents, item))));//return a new dragon which is the old dragon copied (but not changed)with item in the stomach
        return null;
    }

    public <T> List<T> processContents(Dragon dragon, Function<Object, T> item) {
//        return null;
        return dragon.chest.stomach.contents.stream().map(item).collect(Collectors.toList());
    }

}
