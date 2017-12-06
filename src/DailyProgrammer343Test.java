/*
 * Created by Dave on 12/5/17.
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class DailyProgrammer343Test {

    @Test
    public void testNote() {
        assertEquals("C", DailyProgrammer343.note("C", "Do"));
        assertEquals("D", DailyProgrammer343.note("C", "Re"));
        assertEquals("E", DailyProgrammer343.note("C", "Mi"));
        assertEquals("F#", DailyProgrammer343.note("D", "Mi"));
        assertEquals("D#", DailyProgrammer343.note("A#", "Fa"));
        assertEquals(null, DailyProgrammer343.note("$", "Do"));
        assertEquals("Invalid solfège name", DailyProgrammer343.note("C", "$"));
    }
}
