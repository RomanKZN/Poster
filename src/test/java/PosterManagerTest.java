import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {

    @Test
    public void shouldAddAMovie() {
        PosterManager manager = new PosterManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");

        String[] actual = manager.findAll();
        String[] expected = {"Film1", "Film2", "Film3", "Film4"};


        assertArrayEquals(expected, actual);
    }

    @Test

    public void mustGiveTheLastPoster() {
        PosterManager manager = new PosterManager(10);
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");
        String[] actual = manager.findLast();
        String[] expected = {
                "Film12",
                "Film11",
                "Film10",
                "Film9",
                "Film8",
                "Film7",
                "Film6",
                "Film5",
                "Film4",
                "Film3",

        };


        assertArrayEquals(expected, actual);
    }
}
