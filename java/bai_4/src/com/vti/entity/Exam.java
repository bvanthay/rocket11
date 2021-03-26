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
public class Exam {
    int id;
    int Code;
    String Title;
    int Duration;
    Date CreateDate;
    CategoryQuestion Category;
    Account Creator;
     Question[] question;
}
