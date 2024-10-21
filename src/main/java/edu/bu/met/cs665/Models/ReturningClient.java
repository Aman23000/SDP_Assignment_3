/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: ReturningClient.java
 * Description: Extends EmailTemplateBase to represent a returning client,
 * sending an email with a return-specific message.
 */

package edu.bu.met.cs665.models;

public class ReturningClient extends EmailTemplateBase {

    /**
     * Generates the subject line for a returning client email.
     */
    @Override
    public void doSubjectLine() {
        System.out.println("Welcome Back!");
    }

    /**
     * Generates the main message for a returning client email.
     */
    @Override
    public void doMessage() {
        System.out.println("Dear Returning Client,");
        System.out.println("Thank you for coming back! We have a special offer waiting for you.");
    }
}
