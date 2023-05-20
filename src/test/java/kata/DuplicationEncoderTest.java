package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicationEncoderTest {

    @Test
    public void test() {
        assertEquals(")()())()(()()(", DuplicationEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicationEncoder.encode("   ()(   "));
    }

}