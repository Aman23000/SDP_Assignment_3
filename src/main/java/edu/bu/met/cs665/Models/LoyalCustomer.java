/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: LoyalCustomer.java
 * Description: Extends EmailTemplateBase to represent a loyal customer,
 * sending an email with a loyalty-specific message.
 */

package edu.bu.met.cs665.models;

public class LoyalCustomer extends EmailTemplateBase {

    /**
     * Generates the subject line for a loyal customer email.
     */
    @Override
    public void doSubjectLine() {
        System.out.println("Thank You for Your Frequent Visits");
    }

    /**
     * Generates the main message for a loyal customer email.
     */
    @Override
    public void doMessage() {
        System.out.println("Dear Loyal Customer,");
        System.out.println("We appreciate your frequent visits and have a special reward for you.");
    }
}
