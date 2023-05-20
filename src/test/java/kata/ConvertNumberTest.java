package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertNumberTest {

    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, ConvertNumber.digitize(35231));
        assertArrayEquals(new int[] {0}, ConvertNumber.digitize(0));
    }

}