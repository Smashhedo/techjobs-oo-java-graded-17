package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;


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
        //below is the declared and initialized new Job object
                Job aJobObject3 = new Job("Product tester", new Employer("ACME"),
                                  new Location("Desert"), new PositionType("Quality control"),
                                  new CoreCompetency("Persistence"));

//                assertTrue();
//                assertTrue();
//                assertTrue();
//                assertTrue();
//                assertTrue();

                assertEquals("Product tester", aJobObject3.getName());
                assertEquals("ACME", aJobObject3.getEmployer());
                assertEquals("Desert", aJobObject3.getLocation());
                assertEquals("Quality control", aJobObject3.getPositionType());
                assertEquals("Persistence", aJobObject3.getCoreCompetency());

        }

    @Test
    public void testJobsForEquality() {
        Job aJobObject4 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job aJobObject5 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        aJobObject4.equals(aJobObject5);

    }
}