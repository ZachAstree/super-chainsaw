package Line;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class LineTest {
    Line line = new Line(1.2, 3.4, 5.6, 7.8);
    Line line2 = new Line(2.1, 4.3, 6.5, 8.7);

    @Test
    public void testgetSlope() {
        assertEquals(1, line.getSlope(), 0.001);
    }

    @Test
    public void testgetDistance() {
        assertEquals(38.72, line.getDistance(), 0.001);
    }

    @Test
    public void testParallelTo() {
        assertFalse(line.parallelTo(line2));
    }
}
