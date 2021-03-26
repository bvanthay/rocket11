/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.entity;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Question {
    int id;
    String Content;
    String Question;
    Date CreateDate;
    TypeQuestion Type;
    Account Creator;
    CategoryQuestion Category;
    Exam[]exam;
    
}
