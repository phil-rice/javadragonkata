package org.xingyi.javadragon.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

import static org.junit.Assert.assertEquals;

public class DragonOpsTest {
    String item1 = "item1";
    String item2 = "item2";


    DragonOps dragonOps = new DragonOps();
    Dragon dragonOne = new Dragon(new Body(new Chest(new Stomach(Arrays.asList(item1)), new Heart(60))), new Head(200));
    Dragon dragonOneTwo = new Dragon(new Body(new Chest(new Stomach(Arrays.asList(item1, item2)), new Heart(60))), new Head(200));

    @Test
    public void testEat() {
        assertEquals(dragonOneTwo, dragonOps.eat(dragonOne, "item2"));
    }

    @Test
    public void testRegurgitate() {
        assertEquals(dragonOne, dragonOps.regurgitate(dragonOneTwo, "item2"));
    }

    @Test
    public void testProcessContents() {
        assertEquals(Arrays.asList("<item1>", "<item2>"), dragonOps.processContents(dragonOneTwo, item -> "<" + item + ">"));
    }
}
