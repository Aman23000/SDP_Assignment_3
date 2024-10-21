/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: ProspectiveCustomer.java
 * Description: Extends EmailTemplateBase to represent a prospective customer,
 * sending an email with a prospective-specific message.
 */

package edu.bu.met.cs665.models;

public class ProspectiveCustomer extends EmailTemplateBase {

    /**
     * Generates the subject line for a prospective customer email.
     */
    @Override
    public void doSubjectLine() {
        System.out.println("Welcome! Start Your Journey with Us");
    }

    /**
     * Generates the main message for a prospective customer email.
     */
    @Override
    public void doMessage() {
        System.out.println("Dear Prospective Customer,");
        System.out.println("We are excited to introduce you to our offerings.");
    }
}
