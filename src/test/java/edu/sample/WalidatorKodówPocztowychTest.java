package edu.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class WalidatorKodówPocztowychTest {

    @ParameterizedTest
    @ValueSource(strings={"37-127","35-222","00-999"})
    public void testWalidator(String kodPocztowy){
        assertTrue(WalidatorKodówPocztowych.walidator(kodPocztowy));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void nullOrEmpty(String postalCode) {
        assertFalse(WalidatorKodówPocztowych.walidator(postalCode));
    }

    @Test
    public void testWalidator() {
        WalidatorKodówPocztowych w1 = new WalidatorKodówPocztowych();
        Assertions.assertTrue(w1.walidator("37-127"));
    }

    @Test
    public void testWalidator2() {
        WalidatorKodówPocztowych w2 = new WalidatorKodówPocztowych();
        Assertions.assertFalse(w2.walidator("37$123"));
    }

    @Test
    public void testWalidatorPustyString() {
        WalidatorKodówPocztowych w3 = new WalidatorKodówPocztowych();
        Assertions.assertFalse(w3.walidator(""));
    }

    @Test
    public void testWalidatorNull() {
        WalidatorKodówPocztowych w4 = new WalidatorKodówPocztowych();
        Assertions.assertFalse(w4.walidator(null));
    }

    @Test
    public void testWalidatorNullString() {
        WalidatorKodówPocztowych w5 = new WalidatorKodówPocztowych();
        Assertions.assertFalse(w5.walidator("null"));
    }
}