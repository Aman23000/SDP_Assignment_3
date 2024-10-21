/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: EmailTemplateBase.java
 * Description: Abstract class using the template method pattern to generate emails.
 */

package edu.bu.met.cs665.models;

public abstract class EmailTemplateBase {

    public boolean isFrequent;
    public boolean isVip;

    /**
     * Template method to generate an email.
     * @param recipientName name of the email recipient
     * @param senderName name of the email sender
     */
    public final void generateEmail(String recipientName, String senderName) {
        doHeader();
        doSubjectLine();
        doGreeting(recipientName);
        doMessage();
        if (isFrequent || isVip) {
            doPromotion();
        }
        doSignature(senderName);
    }

    /**
     * Generates the header of the email.
     */
    public void doHeader() {
        System.out.println("Header: TechSolve Innovations - \"Innovating Solutions, Elevating Possibilities\" ");
    }

    /**
     * Generates the subject line (abstract).
     */
    public abstract void doSubjectLine();

    /**
     * Generates a greeting for the email.
     * @param recipientName recipient's name
     */
    public void doGreeting(String recipientName) {
        System.out.println("Hello " + recipientName + ",");
    }

    /**
     * Generates the main message (abstract).
     */
    public abstract void doMessage();

    /**
     * Generates promotional content if applicable.
     */
    public void doPromotion() {
        System.out.println("You qualify for our special promotion!");
    }

    /**
     * Generates the signature of the email.
     * @param senderName name of the email sender
     */
    public void doSignature(String senderName) {
        System.out.println("Best regards,");
        System.out.println(senderName);
    }
}
