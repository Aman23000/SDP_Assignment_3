/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: EmailGenerationTest.java
 * Description: Unit tests for email generation for different customer segments
 * for TechSolve Innovations.
 */

        package edu.bu.met.cs665;

import edu.bu.met.cs665.models.*;
import org.junit.Test;

public class EmailGenerationTest {

    @Test
    public void testCorporateClientEmail() {
        EmailTemplateBase corporateClient = new CorporateClient();
        corporateClient.generateEmail("Liam", "Aman Jain");  // TechSolve owner
    }

    @Test
    public void testReturningClientEmail() {
        EmailTemplateBase returningClient = new ReturningClient();
        returningClient.generateEmail("Olivia", "Aman Jain");
    }

    @Test
    public void testLoyalCustomerEmail() {
        EmailTemplateBase loyalCustomer = new LoyalCustomer();
        loyalCustomer.generateEmail("Noah", "Aman Jain");
    }

    @Test
    public void testProspectiveCustomerEmail() {
        EmailTemplateBase prospectiveCustomer = new ProspectiveCustomer();
        prospectiveCustomer.generateEmail("Ava", "Aman Jain");
    }

    @Test
    public void testEliteMemberEmail() {
        EmailTemplateBase eliteMember = new EliteMember();
        eliteMember.generateEmail("Sophia", "Aman Jain");
    }

    @Test
    public void testMultipleCustomerTypes() {
        EmailTemplateBase client = new EliteMember();
        client.generateEmail("Mason", "Aman Jain");
        client = new LoyalCustomer();
        client.generateEmail("Lucas", "Aman Jain");
    }

    @Test
    public void testEmptyCustomerName() {
        EmailTemplateBase client = new CorporateClient();
        client.generateEmail("", "Aman Jain");  // Edge case: empty recipient name
    }
}
