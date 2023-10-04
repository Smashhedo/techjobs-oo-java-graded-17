package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;


public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
            Job aJobObject1 = new Job();
            Job aJobObject2 = new Job();
            assertNotEquals(aJobObject1.getId(), aJobObject2.getId());
        }

    @Test
    public void testJobConstructorSetsAllFields() {
        new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        }
}