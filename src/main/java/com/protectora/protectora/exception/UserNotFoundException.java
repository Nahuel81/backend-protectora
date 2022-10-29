/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.protectora.protectora.exception;

/**
 *
 * @author Usuario
 */
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
    super(message);
    }
}
