/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: EliteMember.java
 * Description: Extends EmailTemplateBase to represent an elite member,
 * sending an email with an elite-specific message.
 */

package edu.bu.met.cs665.models;

public class EliteMember extends EmailTemplateBase {

    /**
     * Generates the subject line for an elite member email.
     */
    @Override
    public void doSubjectLine() {
        System.out.println("Exclusive Elite Member Offer");
    }

    /**
     * Generates the main message for an elite member email.
     */
    @Override
    public void doMessage() {
        System.out.println("Dear Elite Member,");
        System.out.println("As an elite member, you are eligible for exclusive rewards and benefits.");
    }
}
