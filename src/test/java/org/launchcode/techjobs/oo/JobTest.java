package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.yaml.snakeyaml.events.Event;

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

                assertTrue(aJobObject3.getEmployer() instanceof Employer);
                assertTrue(aJobObject3.getName() instanceof String);
                assertTrue(aJobObject3.getLocation() instanceof Location);
                assertTrue(aJobObject3.getPositionType() instanceof PositionType);
                assertTrue(aJobObject3.getCoreCompetency() instanceof CoreCompetency);

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

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
            Job emptyLine = new Job();
        assertEquals(emptyLine.toString(), System.lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

//        ID:  _______
//        Name: _______
//        Employer: _______
//        Location: _______
//        Position Type: _______
//        Core Competency: _______

        Job aJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String expectedString = System.lineSeparator() +
                "ID: " + aJob.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence";
        assertEquals(expectedString, aJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {


    }
}

