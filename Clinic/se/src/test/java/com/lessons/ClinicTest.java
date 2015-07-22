package com.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author pertiol
 *         2015-07-16
 */
public class ClinicTest {
    Clinic clinic = new Clinic();

    @Test (expected = UserException.class)
    public void testGetPetNameByClientName() throws Exception {
        clinic.getPetNameByClientName("Vasya");
    }

    @Test (expected = UserException.class)
    public void testGetClientNameByPetName() throws Exception {
        clinic.getClientNameByPetName("Vasya");
    }
}