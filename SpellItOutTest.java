package spellItOut;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Spell it out test class
 * @author jerill
 *
 */
public class SpellItOutTest {

	@Test
	public void testTensNumbers() {
		assertEquals("twenty-three", SpellItOut.convert(23));
		assertEquals("thirty-five", SpellItOut.convert(35));
		assertEquals("seventy", SpellItOut.convert(70));
	}

	@Test
	public void testOneToTenNumbers() {
		assertEquals("one", SpellItOut.convert(1));
		assertEquals("zero", SpellItOut.convert(0));
		assertEquals("five", SpellItOut.convert(5));
	}
	
	@Test
	public void testHundredsNumbers() {
		assertEquals("one hundred", SpellItOut.convert(100));
		assertEquals("five hundred", SpellItOut.convert(500));
		assertEquals("two hundred thirty-one", SpellItOut.convert(231));
	}	
	
	@Test
	public void testThousandsNumbers() {
		assertEquals("two thousand", SpellItOut.convert(2000));
		assertEquals("five thousand eight hundred ninety-four", SpellItOut.convert(5894));
		assertEquals("four thousand thirty-nine", SpellItOut.convert(4039));
	}

	@Test
	public void testMillionsNumbers() {
		assertEquals("two million", SpellItOut.convert(2000000));
		assertEquals("six million eight hundred ninety-four", SpellItOut.convert(6000894));
	}

	@Test
	public void testBillionNumber() {
		assertEquals("one billion", SpellItOut.convert(1000000000));
	}
	
}
