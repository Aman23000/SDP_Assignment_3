/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: CorporateClient.java
 * Description: Extends EmailTemplateBase to represent a corporate client,
 * sending an email with a corporate-specific message.
 */

package edu.bu.met.cs665.models;

public class CorporateClient extends EmailTemplateBase {

    /**
     * Generates the subject line for a corporate client email.
     */
    @Override
    public void doSubjectLine() {
        System.out.println("Exclusive Corporate Offer Inside");
    }

    /**
     * Generates the main message for a corporate client email.
     */
    @Override
    public void doMessage() {
        System.out.println("Dear Valued Corporate Client,");
        System.out.println("We have an exclusive offer tailored just for your business needs.");
    }
}
