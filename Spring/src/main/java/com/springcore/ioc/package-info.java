/**
 * 
 */
/**
 * @author pratu
 *
 */
package com.springcore.ioc;

//https://www.geeksforgeeks.org/spring-understanding-inversion-of-control-with-example/

/**
 * But what happens if in the future another new Sim Vodafone came and we need
 * to change again to the child class name in the code, like this So we have to
 * do our configuration in the source code. So how to make it configurable? We
 * don’t want to touch the source code of this. The source code should be
 * constant. And how can we make it? Here Spring IoC comes into the picture. So
 * in this example, we are going to use ApplicationContext to implement an IoC
 * container. First, we have to create an XML file and name the file as
 * “beans.xml“.
 * 
 **/

//spring Framework 6.2.x: JDK 17-25 (expected)
//Spring Framework 6.1.x: JDK 17-23
//Spring Framework 6.0.x: JDK 17-21
