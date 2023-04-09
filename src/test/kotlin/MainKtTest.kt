import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun cardTypeMastercard_1() {
        assertEquals("100.0", translation( 100.0, "Mastercard"))

    }

    @Test
    fun cardTypeMastercard_2() {
        assertEquals("Превышен лимит!", translation( 100.0, "Mastercard", 600001.0))

    }

    @Test
    fun cardTypeMaestro_3() {
        assertEquals("80", translation( 100.0, "Maestro", 75001.0))

    }

    @Test
    fun cardTypeMaestro_4() {
        assertEquals("Превышен лимит!", translation( 150001.0, "Maestro", 75001.0))

    }

    @Test
    fun cardTypeVisa_1() {
        assertEquals("65.0", translation( 100.0, "Visa"))

    }

    @Test
    fun cardTypeVisa_2() {
        assertEquals("5955.0", translation( 6000.0, "Visa"))

    }


    @Test
    fun cardTypeVKPay_1() {
        assertEquals("100.0", translation( 100.0, "VK Pay"))

    }

    @Test
    fun cardTypeVKPay_2() {
        assertEquals("Превышен лимит!", translation( 15001.0, "VK Pay"))

    }

    @Test
    fun cardTypeVKPay_3() {
        assertEquals("Превышен лимит!", translation( 100.0, "VK Pay", 40001.0))

    }

    @Test
    fun cardTypeN() {
        assertEquals("100.0", translation( 100.0, ""))

    }

    @Test
    fun cardTypeM() {
        assertEquals(kotlin.Unit, main())

    }
}