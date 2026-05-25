package com.example.enhetstest

import com.example.enhetstest.temperatures.Temperature
import com.example.enhetstest.temperatures.highestTempHour
import junit.framework.TestCase.assertEquals
import org.junit.Test

class TemperatureTest {

    @Test
    fun testGetHighestTemp() {
        //TODO: Arrange
        val temp1 = Temperature(100, "10:12")
        val temp2 = Temperature(10, "14:22")
        val temp3 = Temperature(33, "20:19")
        val temp4 = Temperature(99, "08:55")
        val temp5 = Temperature(11, "01:52")
        val temps = listOf(temp1, temp2, temp3, temp4, temp5)

        //TODO: Act
        val highestTemp = highestTempHour(temps)

        //TODO: Assert
        assertEquals("10:12", highestTemp)
    }

    @Test
    fun testGetHighestTempLowNum() {
        // Arrange:
        val temp1 = Temperature(-102, "10:12")
        val temp2 = Temperature(-101, "14:22")
        val temp3 = Temperature(-103, "20:19")
        val temp4 = Temperature(-110, "08:55")
        val temp5 = Temperature(-111, "01:52")
        val temps = listOf(temp1, temp2, temp3, temp4, temp5)

        // Act:
        val higTemp = highestTempHour(temps)

        // Assert:
        assertEquals("06:00", higTemp)
        // resultat: Expected: 06:00, actual: --:--
        // vi får det på grunn av at det er default verdien

    }
}
